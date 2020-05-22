package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public class Registrarse extends Registrarse_Ventana{
	
	/*
	private Label _tituloL;
	private Label _nombreUsuario;
	private TextField _nombreUsuarioTF;
	private Label _nombreCompletoL;
	private TextField _nombreCompletoTF;
	private Label _correoElectronicoL;
	private TextField _correoElectronicoTF;
	private Image _imagen;
	private Label _descripcionL;
	private TextField _descripcionTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Label _repetirPasswordL;
	private TextField _repetirPasswordTF;
	private Label _registrarseL;
	private Button _registrarseB;
	public Validar_registro _validar_registro;
	 */
	
	iUsuario_no_identificado usuarioNoIdentificado;
	private void inicializar(){
		usuarioNoIdentificado = new DB_Main();
		menuRegistrarse.setVisible(false);
        
		menuIniciarSesion.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				addComponent(new Iniciar_sesion());
				} 
		}
	    );
	}
	
	public Registrarse(){
		
		inicializar();
		botonRegistrarse.addClickListener(new Button.ClickListener()
			{
				public void buttonClick(ClickEvent event) 
				{ 
					registrarse();
				} 
			}
		);
	}

	private void registrarse() {
	
		//Comprobamos que todos los campos son obligatorios
		if (campoNombreUsuario.getValue() == null || campoNombreUsuario.getValue() == "" ||
		    campoCorreoUsuario.getValue() == null || campoCorreoUsuario.getValue() == "" ||
		    campoPassword.getValue() == null || campoPassword.getValue() == "" ||
		    campoDescripcion.getValue() == null || campoDescripcion.getValue() == "" ||
		    campoPassworddos.getValue() == null || campoPassworddos.getValue() == "" ||
			campoFoto.getValue() == null || campoFoto.getValue() == "" ){
			Notification.show("Todos los campos son obligatorios","", Notification.Type.ERROR_MESSAGE);
		}
		
		//Comprobar que la contraseña tiene mas de 8 caracteres
		else if (campoPassword.getValue().length()<8){
			Notification.show("La contraseña tiene que tener 8 o más caracteres","", Notification.Type.ERROR_MESSAGE);
		}
		
		//Comprobar que la contraseña se ha escrito correctamente
		else if (!(campoPassword.getValue().equals(campoPassworddos.getValue()))){
				Notification.show("Las contraseñas no coinciden","", Notification.Type.ERROR_MESSAGE);
		}

		//Registrarse
		else{
			usuarioNoIdentificado.registrarse(campoNombreUsuario.getValue(), 
											  campoNombreCompleto.getValue(), 
									      	  campoCorreoUsuario.getValue(),
											  campoPassword.getValue(), 
											  campoDescripcion.getValue(), 
											  campoFoto.getValue());
			
			//Ir a iniciar sesion
			addComponent(new Iniciar_sesion());
		}
		
	}
}