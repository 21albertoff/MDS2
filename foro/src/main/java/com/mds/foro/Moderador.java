package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Moderador extends Usuario_identificado {
	
	//Declaraciones
	iUsuario moderador;
	iElementos_fijos Elementos_fijos;

	//Inicializacion
	public void inicializar() {
		moderador = new DB_Main();
		Elementos_fijos = new DB_Main();
	    menuUsuarioModerador.setVisible(true);
	}

	//Constructor
	public Moderador() {
		inicializar();
		
		menuCerrarSesionModerador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Cerrar_sesion());

			} 
		});
		
		menuMiPerfilModerador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Visualizar_mi_perfil());

			} 
		});
		
		menuNotificacionesModerador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Notificaciones());

			} 
		});
	}
	
}