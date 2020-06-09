package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Notificar_usuario extends Notificar_usuario_Ventana {
	
	// Declaraciones
		iModerador moderador;

		// Inicializacion
		public void inicializar() {
			moderador = new DB_Main();
		}

		// Constructor
		public Notificar_usuario() {
				inicializar();

				botonCancelarNotificacion.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						if (Parametros.getVolverBaneo() == 1) {
							addComponent(new Visualizar_tema_y_mensajes__Moderador_());
						} 
						if (Parametros.getVolverBaneo() == 2)
							addComponent(new Panel_de_control_del_moderador());
						
					}
				});

				botonNotificar.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
							notificarUsuario();
					}
				});
			}

		// Banear usuario
		private void notificarUsuario() {
				moderador.notificar(Parametros.getIdNotificado(), motivoNotificacion.getValue()); 
				if (Parametros.getVolverBaneo() == 1) {
					addComponent(new Visualizar_tema_y_mensajes__Moderador_());
				} 
				if (Parametros.getVolverBaneo() == 2)
					addComponent(new Panel_de_control_del_moderador());
				
				Notification.show("El usuario ha sido notificado", "", Notification.Type.WARNING_MESSAGE);
			
		}
}