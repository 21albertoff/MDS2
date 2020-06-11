package com.mds.foro;

@SuppressWarnings("serial")
public class Mensaje_no_propietario extends Mensaje_propietario_Ventana{

	public Mensaje_no_propietario() {
		citado.setVisible(true);
		botonOcultar.setVisible(false);
		botonEliminar.setVisible(false);
		fotoPerfil.setVisible(true);
		nickUsuario.setVisible(true);
		reportar.setVisible(false);
		botonBanear.setVisible(false);
		botonNotificar.setVisible(false);
		citarMen.setVisible(true);
		mensaje.setVisible(true);
		videos.setVisible(true);
		linkVideo.setVisible(true);
		imagen.setVisible(true);
		imagen1.setVisible(true);
		imagen2.setVisible(true);
		imagen3.setVisible(true);
		cantidadMeGusta.setVisible(true);
		botonMeGusta.setVisible(true);
		responderMensaje.setVisible(true);
	}
}