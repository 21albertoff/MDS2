package com.mds.foro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
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
public class Visualizar_seccion_Ventana extends AbsoluteLayout {
	protected AbsoluteLayout menuSuperior;
	protected AbsoluteLayout menuUsuarioNoIdentifado;
	protected Button menuRegistrarse;
	protected Button menuIniciarSesion;
	protected AbsoluteLayout menuUsuarioIdentificado;
	protected Button menuMiPerfilUsuario;
	protected Button menuCerrarSesionUsuario;
	protected Button menuNotificacionesUsuario;
	protected AbsoluteLayout menuUsuarioModerador;
	protected Button menuMiPerfilModerador;
	protected Button menuCerrarSesionModerador;
	protected Button menuNotificacionesModerador;
	protected Button menuPanelControlModerador;
	protected AbsoluteLayout menuUsuarioAdministrador;
	protected Button menuMiPerfilAdministrador;
	protected Button menuCerrarSesionAdministrador;
	protected Button menuNotificacionesAdministrador;
	protected Button menuPanelControlAdministrador;
	protected Button nombreForo;
	protected Label tituloS;
	protected Panel panelTemas;
	protected VerticalLayout verticalTemas;
	protected Label seccionesDestacadas;
	protected Image anuncio2;
	protected Image anuncio;
	protected Image iconoS;
	protected ComboBox<java.lang.String> ordenarPor;
	protected VerticalLayout verticalSeccionesDestacadas;
	protected Button crearTema;

	public Visualizar_seccion_Ventana() {
		Design.read(this);
	}
}
