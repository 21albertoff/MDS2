package com.mds.foro;

import java.util.Vector;
import com.mds.foro.Notificacion;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

public class Notificaciones extends Notificaciones_Ventana {
	
	//Declaracion de variables
	private Label _cerrarL;
	private Button _cerrarB;
	private Panel _notificaciones;
	public Vector<Notificacion> _verNotificacion = new Vector<Notificacion>();
}