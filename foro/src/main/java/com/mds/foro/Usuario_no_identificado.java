package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Usuario_no_identificado extends Usuario {

	// Inicializador
	public void inicializarUNI() {
		menuUsuarioNoIdentifado.setVisible(true);
	}

	// Constructor
	public Usuario_no_identificado() {
		inicializarUNI();

		// Menu usuario no identificado
		menuIniciarSesion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Iniciar_sesion());
			}
		});

		menuRegistrarse.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Registrarse());
			}
		});

	}

}