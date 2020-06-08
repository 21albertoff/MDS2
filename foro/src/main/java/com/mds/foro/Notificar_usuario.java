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
							addComponent(new Visualizar_tema_y_mensajes__Moderador_());
						
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
				addComponent(new Visualizar_tema_y_mensajes__Moderador_());
				Notification.show("El usuario ha sido notificado", "", Notification.Type.WARNING_MESSAGE);
			
		}
}