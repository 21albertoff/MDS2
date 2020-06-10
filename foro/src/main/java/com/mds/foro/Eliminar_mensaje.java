package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Eliminar_mensaje extends Eliminar_mensaje_Ventana {

	// Declaraciones
	iAdministrador admin;
	iUsuario_identificado usuarioidentificado;
	int idMensaje;

	// Inicializacion
	public void inicializar() {
		admin = new DB_Main();
		usuarioidentificado = new DB_Main();
		idMensaje = Parametros.getIdMensaje();
	}

	// Constructor
	public Eliminar_mensaje() {
		inicializar();

		// Botones del constructor
		botonCancelarMensaje.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Usuario registrado
				if (Parametros.getTipoUsuario() == 1) {
					addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
				}

				// Moderador
				if (Parametros.getTipoUsuario() == 2) {
					addComponent(new Visualizar_tema_y_mensajes__Moderador_());
				}

				// Administrador
				if (Parametros.getTipoUsuario() == 3) {
					addComponent(new Visualizar_tema_y_mensajes__Administrador_());
				}
			}
		});

		botonEliminarMensaje.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Usuario registrado
				if (Parametros.getTipoUsuario() == 1)
					eliminarPropioMensaje();

				// Moderador
				if (Parametros.getTipoUsuario() == 2)
					eliminarPropioMensaje();

				// Administrador
				if (Parametros.getTipoUsuario() == 3)
					eliminarMensaje();
			}
		});
	}

	// Eliminar propio mensaje
	private void eliminarPropioMensaje() {
		if (usuarioidentificado.eliminar_mi_mensaje(idMensaje)) {
			// Usuario registrado
			if (Parametros.getTipoUsuario() == 1)
				addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());

			// Moderador
			if (Parametros.getTipoUsuario() == 2)
				addComponent(new Visualizar_tema_y_mensajes__Moderador_());

			Notification.show("El mensaje ha sido eliminado con exito", "", Notification.Type.WARNING_MESSAGE);
		}
	}

	// Eliminar mensaje
	private void eliminarMensaje() {
		if (admin.eliminar_mensaje(idMensaje)) {
			addComponent(new Visualizar_tema_y_mensajes__Administrador_());
			Notification.show("El mensaje ha sido eliminado con exito", "", Notification.Type.WARNING_MESSAGE);
		}
	}

}