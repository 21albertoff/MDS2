package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class Panel_de_control_del_moderador extends Panel_de_control_del_moderador_Ventana {
	// Declaraciones
	iModerador moderador;
	private int idReporte;

	// Inicializacion
	public void inicializar() {
		moderador = new DB_Main();
	}

	// Constructor
	public Panel_de_control_del_moderador() {
		inicializar();
		consultarListaReportados();

		//Menu superior 
		
		menuCerrarSesionModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Cerrar_sesion());

			}
		});

		menuMiPerfilModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_mi_perfil__Moderador_());

			}
		});

		menuNotificacionesModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Notificaciones());

			}
		});
		
		menuPanelControlModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Panel_de_control());

			}
		});

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_seccion__Administrador_());
			}
		});
	}

	//Consultar lista de moderadores
	private void consultarListaReportados() {
		List<Usuario_registradoDB> rep = moderador.consultar_UR();
		int idR = 0;
		while (idR < rep.size()) {
			String motivo = rep.get(idR).getMotivo();
			if(motivo.contains("-")) {
			Usuario_reportado usuario = new Usuario_reportado();
			
			usuario.imagenUsuario.setSource(new ExternalResource(rep.get(idR).getFoto()));
			usuario.nombreUsuario.setValue(rep.get(idR).getNombreUsuario());
			usuario.mensajeUsuario.setValue(motivo);
			
			verticalMensajesReportados.addComponent(usuario);
			
			//Consultas
			final int id = idR;
			usuario.eliminarReporte.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					idReporte = rep.get(id).getORMID();
					eliminarReporte();
				}
			});
			
			usuario.notificarUsuario.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					Parametros.setIdNotificado(rep.get(id).getORMID());
					Parametros.setVolverBaneo(2);
					addComponent(new Notificar_usuario());
				}
			});
			}
			idR++;
			
		}
	}
	
	private void eliminarReporte() {
		moderador.eliminar_reporte(idReporte);
	}
}