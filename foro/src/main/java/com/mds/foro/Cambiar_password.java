package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Cambiar_password extends Cambiar_password_Ventana {

	// Declaraciones
	iUsuario_registrado registrado;
	private int idUsuario;
	private String passwordActual;
	private String passwordActualComprobar;
	private String passwordNueva;
	private String passwordNuevaR;

	// Inicializador
	public void inicializar() {
		registrado = new DB_Main();
		idUsuario = Parametros.getIdUsuario();
		passwordActual = Parametros.getPasswordUsuario();

		// Control del menu
		if (Parametros.getTipoUsuario() == 1) {
			menuUsuarioIdentificado.setVisible(true);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioAdministrador.setVisible(false);
			menuUsuarioModerador.setVisible(false);

		} else if (Parametros.getTipoUsuario() == 2) {
			menuUsuarioModerador.setVisible(true);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioIdentificado.setVisible(false);
			menuUsuarioAdministrador.setVisible(false);

		} else if (Parametros.getTipoUsuario() == 3) {
			menuUsuarioModerador.setVisible(false);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioIdentificado.setVisible(false);
			menuUsuarioAdministrador.setVisible(true);
		}
	}

	// Constructor
	public Cambiar_password() {
		inicializar();

		// Usuario registrado
		if (Parametros.getTipoUsuario() == 1) {
			menuCerrarSesionUsuario.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Cerrar_sesion());

				}
			});

			menuMiPerfilUsuario.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Visualizar_mi_perfil__Usuario_registrado_());

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

		// Botones del constructor
		confirmarCambio.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				passwordActualComprobar = campoPasswordActual.getValue();
				if (passwordActualComprobar.equals(passwordActual)) {
					passwordNueva = campoPassword.getValue();
					passwordNuevaR = campoPasswordRepetir.getValue();
					if (validar_password()) {
						confirmar_cambio_password();
						Parametros.setPasswordUsuario(passwordNueva);
						if (Parametros.getTipoUsuario() == 1) {
							addComponent(new Visualizar_mi_perfil__Usuario_registrado_());
						}
						if (Parametros.getTipoUsuario() == 2) {
							addComponent(new Visualizar_mi_perfil__Moderador_());
						}
						if (Parametros.getTipoUsuario() == 3) {
							addComponent(new Visualizar_mi_perfil());
						}
						
						Notification.show("La contraseña ha sido cambiada con exito.",
								Notification.Type.WARNING_MESSAGE);
					}
				}
				if (!passwordActualComprobar.equals(passwordActual)) {
					Notification.show("Tu contraseña actual es incorrecta.", Notification.Type.ERROR_MESSAGE);
					addComponent(new Cambiar_password());
				}
			}
		});

		cancelarCambio.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				if (Parametros.getTipoUsuario() == 1) {
					addComponent(new Visualizar_mi_perfil__Usuario_registrado_());
				}
				if (Parametros.getTipoUsuario() == 2) {
					addComponent(new Visualizar_mi_perfil__Moderador_());
				}
				if (Parametros.getTipoUsuario() == 3) {
					addComponent(new Visualizar_mi_perfil());
				}
			}
		});
	}

	// Confirmar cambio de contraseña
	public void confirmar_cambio_password() {
		registrado.cambiar_contrasenia(idUsuario, passwordNueva);
	}

	// Validar contraseña
	public boolean validar_password() {
		boolean passwordCorrecta = true;
		if (passwordNueva.length() < 8) {
			Notification.show("La contraseña es demasiado corta.", Notification.Type.ERROR_MESSAGE);
			addComponent(new Cambiar_password());
			passwordCorrecta = false;
		}
		if (!passwordNueva.equals(passwordNuevaR)) {
			Notification.show("Las contraseñas nuevas no coinciden.", Notification.Type.ERROR_MESSAGE);
			addComponent(new Cambiar_password());
			passwordCorrecta = false;
		}
		if (passwordNueva.equals(passwordActual)) {
			Notification.show("Las contraseña nueva no puede coincidir con la anterior.",
					Notification.Type.ERROR_MESSAGE);
			addComponent(new Cambiar_password());
			passwordCorrecta = false;
		}
		return passwordCorrecta;
	}
}