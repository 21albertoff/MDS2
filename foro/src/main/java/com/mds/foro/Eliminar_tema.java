package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Eliminar_tema extends Eliminar_tema_Ventana {

	// Declaraciones
	iAdministrador admin;
	iUsuario_identificado usuarioidentificado;

	// Inicializacion
	public void inicializar() {
		admin = new DB_Main();
		usuarioidentificado = new DB_Main();
	}

	// Constructor
	public Eliminar_tema() {
		inicializar();

		// Boton del constructor
		botonCancelarTema.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Usuario registrado
				if (Parametros.getTipoUsuario() == 1)
					addComponent(new Visualizar_seccion__Usuario_identificado_());

				// Moderador
				if (Parametros.getTipoUsuario() == 2)
					addComponent(new Visualizar_seccion__Usuario_identificado_());

				// Administrador
				if (Parametros.getTipoUsuario() == 3)
					addComponent(new Visualizar_seccion__Administrador_());
			}
		});

		botonEliminarTema.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Usuario registrado
				if (Parametros.getTipoUsuario() == 1)
					eliminarTemaPropio();

				// Moderador
				if (Parametros.getTipoUsuario() == 2)
					eliminarTemaPropio();

				// Administrador
				if (Parametros.getTipoUsuario() == 3)
					eliminarTema();
			}
		});
	}

	// Eliminar tema propio
	private void eliminarTemaPropio() {
		if (usuarioidentificado.eliminar_propio_tema(Parametros.getIdTema())) {
			addComponent(new Visualizar_seccion__Usuario_identificado_());
			Notification.show("El tema ha sido eliminado con exito", "", Notification.Type.WARNING_MESSAGE);
		}
	}

	// Eliminar tema
	private void eliminarTema() {
		if (admin.eliminar_tema(Parametros.getIdTema())) {
			addComponent(new Visualizar_seccion__Administrador_());
			Notification.show("El tema ha sido eliminado con exito", "", Notification.Type.WARNING_MESSAGE);
		}
	}

}