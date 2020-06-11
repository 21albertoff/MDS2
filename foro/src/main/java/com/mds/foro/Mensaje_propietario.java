package com.mds.foro;

@SuppressWarnings("serial")
public class Mensaje_propietario extends Mensaje_propietario_Ventana{
	
	public Mensaje_propietario() {
		citado.setVisible(false);
		botonOcultar.setVisible(false);
		botonEliminar.setVisible(true);
		fotoPerfil.setVisible(true);
		nickUsuario.setVisible(true);
		reportar.setVisible(true);
		botonBanear.setVisible(false);
		botonNotificar.setVisible(false);
		citarMen.setVisible(true);
		mensaje.setVisible(true);
		videos.setVisible(false);
		linkVideo.setVisible(false);
		imagen.setVisible(true);
		imagen1.setVisible(true);
		imagen2.setVisible(true);
		imagen3.setVisible(true);
		cantidadMeGusta.setVisible(true);
		botonMeGusta.setVisible(false);
		responderMensaje.setVisible(true);
	}
}