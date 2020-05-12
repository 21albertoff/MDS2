package com.mds.foro;

import java.util.Vector;
import com.mds.foro.MensajeDB;

public class DB_Mensajes {
	public DB_Main _bd_main_mensajes;
	public Vector<MensajeDB> _contiene_mensaje = new Vector<MensajeDB>();

	public Mensaje[] consultar_M(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_no_propietario__Usuario_registrado_[] consultar_M_UR(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Usuario_identificado_[] consultar_M_UI(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_amigo[] consultar_MA(int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public Mi_mensaje[] consultar_MisM(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_no_propietario__Moderador_[] consultar_M_Mo(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_usuario[] consultar_MU(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Administrador_[] consultar_M_A(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_oculto[] consultar_MO() {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_fotos(int aIdMensaje, String aFoto1, String aFoto2, String aFoto3) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_video(int aIdMensaje, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_mi_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void mostrar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void reportar_mensaje(int aIdUsuario, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void ocultar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_mensaje(int aIdTema, String aMensaje, String aFotos, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public void valorar_mensaje(int aIdUsuario, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean citar_tema(String aMensaje, String aFotos, String aVideo, int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}
}