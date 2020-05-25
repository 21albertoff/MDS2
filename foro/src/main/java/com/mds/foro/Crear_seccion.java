package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;

@SuppressWarnings("serial")
public class Crear_seccion extends Crear_seccion_Ventana {
	/**
	private Label _tituloSeccionL;
	private Image _iconoDeSeccion;
	private CheckBox _fijarSeccion;
	private Button _guardar;
	private TextField _nombreSeccionTF;
**/

	iAdministrador admin;
	public Crear_seccion() {
		admin = new DB_Main();
		botonGuardarSeccion.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				guardar_seccion();
				//Ir a Seccion Ventana
				addComponent(new Usuario_identificado());
				Notification.show("La seccion a sido creada con exito","", Notification.Type.WARNING_MESSAGE);
			} 
		}
	);
	}
	
	public void guardar_seccion() {
		//Comprobamos que todos los campos son obligatorios
				if (tituloSeccion.getValue() == null || tituloSeccion.getValue() == ""){
					Notification.show("Todos los campos son obligatorios","", Notification.Type.ERROR_MESSAGE);
				}else if (iconoSeccion.getValue() == null || iconoSeccion.getValue() == "" ) {
					Notification.show("Todos los campos son obligatorios","", Notification.Type.ERROR_MESSAGE);
				} else {
					admin.crear_seccion(tituloSeccion.getValue(), iconoSeccion.getValue(), fijarSeccion.getValue());
				}
	}
}