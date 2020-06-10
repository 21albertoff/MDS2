package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Crear_seccion extends Crear_seccion_Ventana {

	// Declaraciones
	iAdministrador admin;

	// Constructor
	public Crear_seccion() {
		admin = new DB_Main();

		// Botones del constructor
		botonGuardarSeccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				guardar_seccion();

			}
		});
	}

	// Guardar seccion
	public void guardar_seccion() {
		// Comprobamos que todos los campos son obligatorios
		if (tituloSeccion.getValue() == null || tituloSeccion.getValue() == "" || iconoSeccion.getValue() == null
				|| iconoSeccion.getValue() == "") {
			Notification.show("Todos los campos son obligatorios", "", Notification.Type.ERROR_MESSAGE);
		} else {
			admin.crear_seccion(tituloSeccion.getValue(), iconoSeccion.getValue(), fijarSeccion.getValue());

			// Ir a Seccion Ventana
			addComponent(new Administrador());
			Notification.show("La seccion ha sido creada con exito", "", Notification.Type.WARNING_MESSAGE);
		}
	}
}