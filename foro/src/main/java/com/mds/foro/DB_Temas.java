package com.mds.foro;

import java.util.Vector;
import com.mds.foro.TemaDB;

public class DB_Temas {
	public DB_Main _bd_main_temas;
	public Vector<TemaDB> _contiene_tema = new Vector<TemaDB>();

	public Tema[] consultar_T(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema__Usuario_identificado_[] consultar_T_UI(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema__Administrador_[] consultar_T_A(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema_oculto[] consultar_TO() {
		throw new UnsupportedOperationException();
	}

	public boolean guardar_tema(int aIdSeccion, String aTituloTema, String aSubtituloTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_propio_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void cerrar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void mostrar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void ocultar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void valorar_tema(int aIdUsuario, int aIdTema) {
		throw new UnsupportedOperationException();
	}
}