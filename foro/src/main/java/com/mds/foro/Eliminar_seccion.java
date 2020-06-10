package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Eliminar_seccion extends Eliminar_Seccion_Ventana {

	// Declaraciones
	iAdministrador admin;

	// Inicializacion
	public void inicializar() {
		admin = new DB_Main();
	}

	// Constructor
	public Eliminar_seccion() {
		inicializar();

		// Botones del constructor
		botonCancelar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Administrador());
			}
		});

		botonEliminarSeccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				eliminarSeccion();
			}
		});
	}

	// Eliminar seccion
	private void eliminarSeccion() {
		if (admin.eliminar_seccion(Parametros.getIdSeccion())) {
			addComponent(new Administrador());
			Notification.show("La seccion ha sido eliminado con exito", "", Notification.Type.WARNING_MESSAGE);
		}
	}
}