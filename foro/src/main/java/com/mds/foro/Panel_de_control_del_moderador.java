package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
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

		// Botones del constructor
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
				addComponent(new Panel_de_control_del_moderador());

			}
		});

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Moderador());
			}
		});
	}

	// Consultar lista de moderadores
	private void consultarListaReportados() {
		List<Usuario_registradoDB> rep = moderador.consultar_UR();
		int idR = 0;
		while (idR < rep.size()) {
			String motivo = rep.get(idR).getMotivo();
			if (motivo.contains("-")) {

				// Creacion del componente
				Usuario_reportado usuario = new Usuario_reportado();

				// Elementos del componente
				usuario.imagenUsuario.setSource(new ExternalResource(rep.get(idR).getFoto()));
				usuario.nombreUsuario.setValue(rep.get(idR).getNombreUsuario());
				usuario.mensajeUsuario.setValue(motivo);

				// Añadir el componente
				verticalMensajesReportados.addComponent(usuario);

				// Botones del componente
				final int id = idR;
				usuario.eliminarReporte.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						idReporte = rep.get(id).getORMID();
						eliminarReporte();
						addComponent(new Panel_de_control_del_moderador());
						Notification.show("El reporte ha sido eliminado.", "", Notification.Type.WARNING_MESSAGE);
					}
				});

				usuario.notificarUsuario.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdNotificado(rep.get(id).getORMID());
						Parametros.setVolverBaneo(2);
						addComponent(new Notificar_usuario());
						Notification.show("El usuario ha sido notificado.", "", Notification.Type.WARNING_MESSAGE);
					}
				});
			}
			idR++;

		}
	}

	// Eliminar reporte
	private void eliminarReporte() {
		moderador.eliminar_reporte(idReporte);
	}
}