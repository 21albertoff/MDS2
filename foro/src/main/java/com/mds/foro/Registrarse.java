package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Link;

import citas.Administrador;
import citas.Login;
import citas.Usuario;

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
	public Registrarse(){
		
		usuarioNoIdentificado = new DB_Main();
		menuRegistrarse.setVisible(false);
		errorMensaje.setVisible(false);
        
        menuIniciarSesion.addClickListener(new Link.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				setContent(new Iniciar_sesion());
			}
		});
        
   
		
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
		
		if (campoFoto.getValue() == null || campoFoto.getValue() == "") {
			campoFoto.setValue("https://i.dlpng.com/static/png/6728146_preview.png");
		}
		
		if (campoNombreUsuario.getValue() == null || campoNombreUsuario.getValue() == "" ||
		    campoCorreoUsuario.getValue() == null || campoCorreoUsuario.getValue() == "" ||
		    campoPassword.getValue() == null || campoPassword.getValue() == "" ||
		    campoDescripcion.getValue() == null || campoDescripcion.getValue() == "" ||
		    campoPassworddos.getValue() == null || campoPassworddos.getValue() == "" ) {
			errorMensaje.setVisible(true);
		}
	
		else if(campoPassword.getValue().equals(campoPassworddos.getValue())) {
			usuarioNoIdentificado.registrarse(campoNombreUsuario.getValue(), 
														campoNombreCompleto.getValue(), 
														campoCorreoUsuario.getValue(),
														campoPassword.getValue(), 
														campoDescripcion.getValue(), 
														campoFoto.getValue());
		}
			

	}
}