package com.mds.foro;


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
		recuperarContrasenia();
		nombreForo.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Usuario());
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
			//enviarPassword();
		} else {
			Notification.show("El nombre de usuario o el correo es incorrecto","", Notification.Type.ERROR_MESSAGE);
		}
	}
	
	//Metodo enviarPassword
	/**public void enviarPassword() {
		try {			
			HtmlEmail email = new HtmlEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setSSLOnConnect(true);			
			email.setAuthentication("mds2ual@gmail.com", "aprobada");
			email.setFrom("mds2ual@gmail.com");
			email.addTo(Parametros.getCampo_recup_contrasenia());				
			email.setSubject("Nueva contrasenia");
			email.setHtmlMsg("La nueva contrasenia es:"+Parametros.getContraseniaGenerada()+"<br/> Introduce esta contrasenia en el popup que aparece para restablecerla");				
			email.send();		
			Parametros.setContraseniaGenerada("");
			Window w=new Window("Cambiar Contrasenia");
			w.setContent(new Cambiar_Contrasena());
			w.center();		
			w.setResponsive(true);
			UI.getCurrent().addWindow(w);
			
		}catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}