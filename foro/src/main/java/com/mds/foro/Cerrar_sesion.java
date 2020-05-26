package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

public class Cerrar_sesion extends Cerrar_sesion_Ventana {
	
	//Declaracion de ventanas
	/*private Label _mensaje;
	private Label _cerrarL;
	private Button _cerrarB;
	private Label _cancelarL;
	private Button _cancelarB;
	*/
	
	
	public Cerrar_sesion() {
		cancelarCerrarSesion.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				
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
			}
		});
		
		 
		cerrarSesion.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
		    	addComponent(new Iniciar_sesion());

			} 
		});
		
	}
}