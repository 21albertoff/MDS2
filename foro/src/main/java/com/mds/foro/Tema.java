package com.mds.foro;

@SuppressWarnings("serial")
public class Tema extends Tema_Ventana{

	//Constructor
	public Tema() {
		imagenTema.setVisible(true);
		nombreTema.setVisible(true);
		comentarios.setVisible(true);
		imagenUsuario.setVisible(true);
		nombreUsuario.setVisible(true);
		cantidadMeGustas.setVisible(true);
		botonEliminarTema.setVisible(false);
		botonEliminarOculto.setVisible(false);
	}
}