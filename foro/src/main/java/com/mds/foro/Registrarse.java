package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

import com.vaadin.navigator.View;
import com.vaadin.ui.DateField;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

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
		
		boolean correcto= false;	
		if (campoFoto.getValue() == null || campoFoto.getValue() == " ") {
			campoFoto.setValue("https://i.dlpng.com/static/png/6728146_preview.png");
		}
			
		if(campoPassword.getValue().equals(campoPassworddos.getValue())) {
			correcto= usuarioNoIdentificado.registrarse(campoNombreUsuario.getValue(), campoNombreCompleto.getValue(), campoCorreoUsuario.getValue(), campoPassword.getValue(), campoDescripcion.getValue(), campoFoto.getValue());
		}
			
		if(correcto) {
				for(Window windows : UI.getCurrent().getWindows()){
					windows.close();
					
				}
				Window iniciarSesion=new Window("Iniciar Sesion");
				iniciarSesion.setContent(new Iniciar_sesion());
				iniciarSesion.center();		
				iniciarSesion.setResponsive(true);
				usuarioNoIdentificado.getCurrent().addWindow(iniciarSesion);
				
			}
	}

}