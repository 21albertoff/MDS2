package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Cerrar_sesion extends Cerrar_sesion_Ventana {

	// Constructor
	public Cerrar_sesion() {
		cancelarCerrarSesion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				// Usuario registrado
				if (Parametros.getTipoUsuario() == 1) {
					addComponent(new Usuario_registrado());
				}

				// Moderador
				if (Parametros.getTipoUsuario() == 2) {
					addComponent(new Moderador());
				}

				// Administrador
				if (Parametros.getTipoUsuario() == 3) {
					addComponent(new Administrador());
				}
			}
		});

		// Boton del contrustor
		cerrarSesion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Parametros.setTipoUsuario(0);
				addComponent(new Usuario_no_identificado());
				Notification.show("Has cerrado sesion", "", Notification.Type.WARNING_MESSAGE);
			}
		});

	}
}