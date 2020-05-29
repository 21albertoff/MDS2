package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial") 
public class Usuario_registrado extends Usuario_identificado {
	
	//Inicializacion
	public void inicializarUR() {
	    menuUsuarioIdentificado.setVisible(true);
	}

	//Constructor
	public Usuario_registrado() {
		inicializarUR();

		menuCerrarSesionUsuario.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Cerrar_sesion());

			} 
		});
		
		menuMiPerfilUsuario.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Visualizar_mi_perfil());

			} 
		});
		
		menuNotificacionesUsuario.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Notificaciones());

			} 
		});
		
	}
	
}