package com.mds.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Iniciar_sesion_Ventana extends AbsoluteLayout {
	protected Label nombreForo;
	protected AbsoluteLayout menuUsuarioNoIdentifado;
	protected Link menuRegistrarse;
	protected Link menuIniciarSesion;
	protected AbsoluteLayout cajacambiar;
	protected Label cambiarcontrasena;
	protected Button botonIniciarSesion;
	protected TextField nombreUsuario;
	protected Link recuperarLink;
	protected Image imagenIniciarSesion;

	public Iniciar_sesion_Ventana() {
		Design.read(this);
	}
}
