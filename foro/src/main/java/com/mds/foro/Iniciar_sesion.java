package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Iniciar_sesion extends Iniciar_sesion_Ventana {

	//Declaraciones
	iUsuario_no_identificado usuarioNoIdentificado;
	
	//Inicializar
	private void inicializar() {
		usuarioNoIdentificado = new DB_Main();
		menuIniciarSesion.setVisible(false);
	}
	
	//Constructor
	public Iniciar_sesion(){
		inicializar();
		
		botonIniciarSesion.addClickListener(new Button.ClickListener()
			{
				public void buttonClick(ClickEvent event) 
				{ 
					iniciar_sesion();
				} 
			}
		);
		
		menuRegistrarse.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Registrarse());
				} 
		}
	    );
		
		nombreForo.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Usuario());
				} 
		}
	    );
		
		recuperarPassword.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Recuperar_password());
				} 
		}
	    );
		
	}
	
	//Metodo iniciar sesion
	private void iniciar_sesion() {
		//Comprobar que los campos no estan vacios
		if (nombreUsuario.getValue() == null || nombreUsuario.getValue() == "" ||
			campoPassword.getValue() == null || campoPassword.getValue() == "" ){
				Notification.show("El nombre o la contraseña no puede estar vacia","", Notification.Type.ERROR_MESSAGE);
		}
		
		boolean inicio = false;
		inicio = usuarioNoIdentificado.iniciar_sesion(nombreUsuario.getValue(), campoPassword.getValue());
		if (inicio) {
			
			if(Parametros.getBaneado()) {
				Notification.show("Permiso denegado","Has sido temporalmente baneado", Notification.Type.ERROR_MESSAGE);
			}
			
			//Usuario registrado
			if(Parametros.getTipoUsuario()==1) {
				Usuario_registrado Usuario = new Usuario_registrado();
				addComponent(Usuario);
			}
			
			//Moderador
			if(Parametros.getTipoUsuario()==2) {
				//addComponent(new Moderador());
				Notification.show("Moderador","", Notification.Type.ERROR_MESSAGE);

			}
			
			//Administrador
			if(Parametros.getTipoUsuario()==3) {
				Administrador Admin = new Administrador();
				addComponent(Admin);

			}
		}else {
			//Fallo al iniciar sesion
			Notification.show("El nombre de usuario o la contraseña es incorrecta","", Notification.Type.ERROR_MESSAGE);
		}
	}

}