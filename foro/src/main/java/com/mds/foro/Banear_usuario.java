package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Banear_usuario extends Banear_usuario_Ventana {

	// Declaraciones
	iAdministrador admin;

	// Inicializacion
	public void inicializar() {
		admin = new DB_Main();
	}

	// Constructor
	public Banear_usuario() {
		inicializar();

		botonCancelarBaneo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				if (Parametros.getVolverBaneo() == 1)
					addComponent(new Visualizar_tema_y_mensajes__Administrador_());
				if (Parametros.getVolverBaneo() == 2)
					addComponent(new Panel_de_control());
				if (Parametros.getVolverBaneo() == 3)
					addComponent(new Visualizar_perfil__Administrador_());

			}
		});

		botonBanear.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				banearUsuario();
			}
		});
	}

	// Banear usuario
	private void banearUsuario() {
		admin.banear_usuario(Parametros.getIdBaneado());
		if (Parametros.getVolverBaneo() == 1)
			addComponent(new Visualizar_tema_y_mensajes__Administrador_());
		if (Parametros.getVolverBaneo() == 2)
			addComponent(new Panel_de_control());
		if (Parametros.getVolverBaneo() == 3)
			addComponent(new Visualizar_perfil__Administrador_());
		Notification.show("El usuario ha sido baneado", "", Notification.Type.WARNING_MESSAGE);

	}
}