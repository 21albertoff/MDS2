package com.mds.foro;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Recuperar_password extends Recuperar_password_Ventana{

	//Declaraciones
	iUsuario_no_identificado usuarioNoIdentificado;
	//Inicializador
	public void inicializar() {
		usuarioNoIdentificado = new DB_Main();
	}
	
	//Constructor
	public Recuperar_password() {
		inicializar();
		nombreForo.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Usuario_no_identificado());
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
		
		menuIniciarSesion.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Iniciar_sesion());
				} 
		}
	    );
		
		botonAtras.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Iniciar_sesion());
				} 
		}
	    );
		
		botonEnviar.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				recuperarContrasenia();
				} 
		}
	    );
	}
	
	//Metodo
	private void recuperarContrasenia() {
		if (labelEmail.getValue()==null || labelEmail.getValue()=="" ||
		    labelNombreUsuario.getValue()==null || labelNombreUsuario.getValue()=="") {
			Notification.show("El nombre o el correo no pueden estar vacios","", Notification.Type.ERROR_MESSAGE);
		}
		else if(usuarioNoIdentificado.recuperarContrasenia(labelNombreUsuario.getValue(), labelEmail.getValue())) {
			enviarPassword();
		} else {
			Notification.show("El nombre de usuario o el correo es incorrecto","", Notification.Type.ERROR_MESSAGE);
		}
	}
	
	//Metodo enviarPassword
	public void enviarPassword() {
		try {			
			HtmlEmail email = new HtmlEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setSSLOnConnect(true);			
			email.setAuthentication("foromds22020@gmail.com", "mds22020");
			email.setFrom("foromds22020@gmail.com");
			email.addTo(Parametros.getCorreoUsuario());				
			email.setSubject("Recuperacion de password");
			email.setHtmlMsg("Saludos, "+Parametros.getNombreUsuario()+ ". Tu password es:"+Parametros.getPasswordUsuario()+"<br/> Introduce este password para iniciar sesion");				
			email.send();		
			Parametros.setPasswordUsuario("");
			Parametros.setCorreoUsuario("");
			Parametros.setNombreUsuario("");
			addComponent(new Iniciar_sesion());
			Notification.show("Contraseña enviada","Revisa tu correo para obtener la contraseña", Notification.Type.WARNING_MESSAGE);
			
		}catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}