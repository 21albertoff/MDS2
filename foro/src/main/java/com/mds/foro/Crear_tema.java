package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

public class Crear_tema extends Crear_tema_Ventana{

	iUsuario_identificado uni;
	public Crear_tema() {
		uni = new DB_Main();
		botonGuardarTema.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				guardar_tema();

			} 
		}
	);
	}
	
	public void guardar_tema() {
		//Comprobamos que todos los campos son obligatorios
				if (tituloTemas.getValue() == null || tituloTemas.getValue() == "" ||
				    descripcionTema.getValue() == null || descripcionTema.getValue() == "" ){
					Notification.show("Todos los campos son obligatorios","", Notification.Type.ERROR_MESSAGE);
				} else {
					uni.guardar_tema(Parametros.getIdSeccion(), Parametros.getIdUsuario(), tituloTemas.getValue(), descripcionTema.getValue());
					
					//Ir a Seccion Ventana
					 //Usuario registrado
					if(Parametros.getTipoUsuario()==1) {
				        addComponent(new Visualizar_seccion__Usuario_identificado_());
					}
					
					//Moderador
					else if(Parametros.getTipoUsuario()==2) {
				        addComponent(new Visualizar_seccion__Usuario_identificado_());
					}
					
					//Administrador
					else if(Parametros.getTipoUsuario()==3) {
				        addComponent(new Visualizar_seccion__Administrador_());
					}
					
					else {
				        addComponent(new Visualizar_seccion());
					}
					Notification.show("El tema ha sido creado con exito","", Notification.Type.WARNING_MESSAGE);
				}
	}
}