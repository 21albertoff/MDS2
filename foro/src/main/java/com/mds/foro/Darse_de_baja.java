package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Darse_de_baja extends Darse_de_baja_Ventana{
	
	/**Declaracion de variables
	private Label _preguntaConfirmacionL;
	private Link _eliminarPerfil;
	private Label _cancelarL;
	private Button _cancelarB;
	public Visualizar_mi_perfil__Usuario_registrado_ _unnamed_Visualizar_mi_perfil__Usuario_registrado__;**/
	
	iUsuario_registrado registrado;
	private int idUsuario;
	
	public void inicializar() {
		registrado = new DB_Main();
		idUsuario = Parametros.getIdUsuario();
	}
	
	public Darse_de_baja() {
		inicializar();
		
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
			}
		});
		
	}

	public void eliminar_perfil() {
		registrado.eliminar_perfil(idUsuario);
	}
}