package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Darse_de_baja extends Darse_de_baja_Ventana {

	// Declaraciones
	iUsuario_registrado registrado;
	private int idUsuario;

	// Inicializador
	public void inicializar() {
		registrado = new DB_Main();
		idUsuario = Parametros.getIdUsuario();
	}

	// Constructor
	public Darse_de_baja() {
		inicializar();

		// Botones constructor
		cancelarEliminar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_mi_perfil());
			}
		});

		eliminarCuenta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				eliminar_perfil();
				Parametros.borrarUsuario();
				addComponent(new Usuario_no_identificado());
				Notification.show("La cuenta ha sido eliminada con exito", "", Notification.Type.ERROR_MESSAGE);
			}
		});

	}

	// Eliminar perfil
	public void eliminar_perfil() {
		registrado.eliminar_perfil(idUsuario);
	}
}