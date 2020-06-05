package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Escribir_mensaje extends Escribir_mensaje_Ventana {

	// Declaraciones
	iUsuario_identificado usuarioidentificado;
	int idTema;
	int idUsuario;
	int idCitado;

	// Inicializacion
	public void inicializar() {
		usuarioidentificado = new DB_Main();
		idTema = Parametros.getIdTema();
		idUsuario = Parametros.getIdUsuario();
		idCitado = Parametros.getIdCitado();
	}

	// Constructor
	public Escribir_mensaje() {
		inicializar();

		botonEscribirMensaje.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				String mensaje = mensajeEscrito.getValue();
				if (mensaje.length() < 2 || mensaje.length() > 255) {
					if (Parametros.getTipoUsuario() == 1) {
						addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
					}
					if (Parametros.getTipoUsuario() == 2) {
						addComponent(new Visualizar_tema_y_mensajes__Moderador_());
					}
					if (Parametros.getTipoUsuario() == 3) {
						addComponent(new Visualizar_tema_y_mensajes__Administrador_());
					}
					if (mensaje.length() < 2)
						Notification.show("El mensaje era demasiado corto", "", Notification.Type.WARNING_MESSAGE);
					if (mensaje.length() > 255)
						Notification.show("El mensaje era demasiado largo", "", Notification.Type.WARNING_MESSAGE);

				} else {
					if (video.getValue() == "")
						video.setValue("null");
					if (imagen1.getValue() == "")
						imagen1.setValue("null");
					if (imagen2.getValue() == "")
						imagen2.setValue("null");
					if (imagen3.getValue() == "")
						imagen3.setValue("null");
					if (Parametros.getCitado() == false) {
						escribirMensaje();
					} else {
						citarMensaje();
					}
				}
			}
		});
	}

	// Eliminar tema
	private void escribirMensaje() {
		if (usuarioidentificado.crear_mensaje(idTema, idUsuario, mensajeEscrito.getValue(), imagen1.getValue(),
				imagen2.getValue(), imagen3.getValue(), video.getValue())) {
			if (Parametros.getTipoUsuario() == 1) {
				addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
			}
			if (Parametros.getTipoUsuario() == 2) {
				addComponent(new Visualizar_tema_y_mensajes__Moderador_());
			}
			if (Parametros.getTipoUsuario() == 3) {
				addComponent(new Visualizar_tema_y_mensajes__Administrador_());
			}
			Notification.show("Has escrito un nuevo mensaje", "", Notification.Type.WARNING_MESSAGE);
		}
	}

	// Eliminar tema
	private void citarMensaje() {
		if (usuarioidentificado.citar_mensaje(idTema, idUsuario, idCitado, mensajeEscrito.getValue(),
				imagen1.getValue(), imagen2.getValue(), imagen3.getValue(), video.getValue())) {
			if (Parametros.getTipoUsuario() == 1) {
				addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
			}
			if (Parametros.getTipoUsuario() == 2) {
				addComponent(new Visualizar_tema_y_mensajes__Moderador_());
			}
			if (Parametros.getTipoUsuario() == 3) {
				addComponent(new Visualizar_tema_y_mensajes__Administrador_());
			}
			Notification.show("Has respondido a un mensaje", "", Notification.Type.WARNING_MESSAGE);
		}
	}
}