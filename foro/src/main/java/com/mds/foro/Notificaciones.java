package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Notificaciones extends Notificaciones_Ventana {

	// Declaraciones
	iUsuario_identificado usuarioidentificado;
	private int idUsuario;
	private int idUsuarioAmigo;
	private int notificacionUsuario;

	// Inicializacion
	public void inicializar() {
		usuarioidentificado = new DB_Main();

		idUsuario = Parametros.getIdUsuario();

		menuUsuarioIdentificado.setVisible(false);
		menuUsuarioNoIdentifado.setVisible(false);
		menuUsuarioAdministrador.setVisible(false);
		menuUsuarioModerador.setVisible(false);

		if (Parametros.getTipoUsuario() == 1) {
			menuUsuarioIdentificado.setVisible(true);
		} else if (Parametros.getTipoUsuario() == 2) {
			menuUsuarioModerador.setVisible(true);
		} else if (Parametros.getTipoUsuario() == 3) {
			menuUsuarioAdministrador.setVisible(true);
		}
	}

	// Constructor
	public Notificaciones() {
		inicializar();
		consultar_notificaciones();

		// Botones del constructor
		cerrarNotificaciones.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				if (Parametros.getTipoUsuario() == 1)
					addComponent(new Usuario_registrado());
				if (Parametros.getTipoUsuario() == 2)
					addComponent(new Moderador());
				if (Parametros.getTipoUsuario() == 3)
					addComponent(new Administrador());
			}
		});

		// Usuario registrado
		if (Parametros.getTipoUsuario() == 1) {
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

		// Administrador
		if (Parametros.getTipoUsuario() == 3) {
			menuCerrarSesionAdministrador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Cerrar_sesion());

				}
			});

			menuMiPerfilAdministrador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Visualizar_mi_perfil());

				}
			});

			menuNotificacionesAdministrador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Notificaciones());

				}
			});

			menuPanelControlAdministrador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Panel_de_control());

				}
			});

			nombreForo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Administrador());
				}
			});
		}

		// Moderador
		if (Parametros.getTipoUsuario() == 2) {
			menuCerrarSesionModerador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Cerrar_sesion());

				}
			});

			menuMiPerfilModerador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Visualizar_mi_perfil());

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
	}

	// Consultar notificaciones
	private void consultar_notificaciones() {
		List<NotificacionDB> notif = usuarioidentificado.consultar_N(idUsuario);
		int idM = notif.size() - 1;
		while (idM >= 0) {

			// Creacion del componente
			Notificacion notificacion = new Notificacion();

			// Elementos del componente
			notificacion.fotoPerfil.setSource(new ExternalResource(notif.get(idM).getEnviada_por().getFoto()));
			notificacion.nombreUsuario.setValue(notif.get(idM).getEnviada_por().getNombreUsuario());

			// Añadir el compoenente
			verticalNotificaciones.addComponent(notificacion);

			// Botones del componente
			notificacionUsuario = notif.get(idM).getORMID();
			final int id = idM;
			notificacion.aceptarSolicitud.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					idUsuarioAmigo = notif.get(id).getEnviada_por().getIdUsuario();
					agregar_amigo();
					eliminar_notificacion();
					addComponent(new Notificaciones());
					Notification.show("Se acepto la solicitud de amistad", "", Notification.Type.WARNING_MESSAGE);

				}
			});

			notificacion.eliminarSolicitud.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					eliminar_notificacion();
					addComponent(new Notificaciones());
					Notification.show("La notificacion ha sido eliminada", "", Notification.Type.WARNING_MESSAGE);

				}
			});

			idM--;
		}
	}

	// Metodo eliminar notificacion
	private void eliminar_notificacion() {
		usuarioidentificado.eliminar_notificacion(idUsuario, notificacionUsuario);
	}

	// Metodo agregar amigo
	private void agregar_amigo() {
		usuarioidentificado.agregar_amigo(idUsuario, idUsuarioAmigo);
	}

}