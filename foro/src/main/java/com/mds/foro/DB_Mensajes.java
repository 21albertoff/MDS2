package com.mds.foro;

import java.util.Vector;
import com.mds.foro.MensajeDB;

public class DB_Mensajes {
	public DB_Main _bd_main_mensajes;
	public Vector<MensajeDB> _contiene_mensaje = new Vector<MensajeDB>();

	public Mensaje[] consultar_M() {
		throw new UnsupportedOperationException();
	}

	public Mensaje_no_propietario__Usuario_registrado_[] consultar_M_UR() {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Usuario_identificado_[] consultar_M_UI() {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Administrador_[] consultar_MA() {
		throw new UnsupportedOperationException();
	}

	public Mi_mensaje[] consultar_MisM() {
		throw new UnsupportedOperationException();
	}

	public Mensaje_no_propietario__Moderador_[] consultar_M_Mo() {
		throw new UnsupportedOperationException();
	}

	public Mensaje_usuario[] consultar_MU() {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Administrador_[] consultar_M_A() {
		throw new UnsupportedOperationException();
	}

	public Mensaje_oculto[] consultar_MO() {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_fotos(String aFotos) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_video(String aVideo) {
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

	public void reportar_mensaje(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void ocultar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_mensaje(String aMensaje, String aFotos, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public void valorar_mensaje() {
		throw new UnsupportedOperationException();
	}

	public boolean citar_tema(String aMensaje, String aFotos, String aVideo, String aTema) {
		throw new UnsupportedOperationException();
	}

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, String aMensajeCitado) {
		throw new UnsupportedOperationException();
	}
}