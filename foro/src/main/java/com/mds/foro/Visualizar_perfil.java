package com.mds.foro;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_perfil extends Visualizar_perfil_ventana {

	// Declaracion de variables
	iUsuario_identificado usuarioidentificado;
	iUsuario_registrado registrado;
	private int idUsuario;
	private int idUsuarioAmigo;
	Usuario_DB amigo;
	Usuario_DB yo;

	// Inicializador
	public void inicializar() {
		usuarioidentificado = new DB_Main();
		registrado = new DB_Main();

		idUsuario = Parametros.getIdUsuario();
		idUsuarioAmigo = Parametros.getPerfilUsuario();

		menuUsuarioIdentificado.setVisible(true);
		menuUsuarioNoIdentifado.setVisible(false);
		menuUsuarioAdministrador.setVisible(false);
		menuUsuarioModerador.setVisible(false);
	}

	public Visualizar_perfil() {
		inicializar();

		// Comprobamos si ya son amigos
		amigo = consultar_Amigo(idUsuarioAmigo);
		if(idUsuario == idUsuarioAmigo) {
			addComponent(new Visualizar_mi_perfil());
		}
		yo = consultar_Amigo(idUsuario);
		if (yo.amigo_de.contains(amigo) || yo.getPermiso() == 2 || yo.getPermiso() == 3) {
			Parametros.setIdMiAmigo(amigo.getIdUsuario());
			addComponent(new Visualizar_perfil_amigo());
		}
		
		if(amigo.getPerfil_oculto()) {
			addAmigo.setVisible(false);
		} else {
			addAmigo.setVisible(true);
		}
		
		nickUsuario.setValue(amigo.getNombreUsuario());
		descripcionUsuario.setValue(amigo.getDescripcion());
		imagenPerfil.setSource(new ExternalResource(amigo.getFoto()));

		// Enviar solicitud de amistad
		addAmigo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addAmigo();
				Parametros.setIdMiAmigo(idUsuarioAmigo);
				addComponent(new Visualizar_perfil());
				Notification.show("Se ha enviado una solicitud al usuario "+amigo.getNombreUsuario()+".","", Notification.Type.WARNING_MESSAGE);
			}
		});

		// Menu usuario identificado
		menuCerrarSesionUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Cerrar_sesion());

			}
		});

		menuMiPerfilUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_mi_perfil());

			}
		});

		menuNotificacionesUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Notificaciones());

			}
		});

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Usuario_registrado());
			}
		});
	}

	// Consultar el usuario del perfil
	private Usuario_DB consultar_Amigo(int idUsuarioAmigo2) {
		return usuarioidentificado.consultar_Amigo(idUsuarioAmigo2);
	}

	// Enviar solicitud de amistad
	public void addAmigo() {
		usuarioidentificado.enviar_solicitud(Parametros.getIdUsuario(), amigo.getIdUsuario());
	}
}