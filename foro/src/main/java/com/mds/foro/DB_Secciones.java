package com.mds.foro;

import java.util.Vector;
import com.mds.foro.SeccionDB;

public class DB_Secciones {
	public DB_Main _bd_main_secciones;
	public Vector<SeccionDB> _contiene_seccion = new Vector<SeccionDB>();

	public Seccion_destacada[] consultar_SD() {
		throw new UnsupportedOperationException();
	}

	public Seccion_fija[] consultar_SF() {
		throw new UnsupportedOperationException();
	}

	public Ultima_seccion[] consultar_US() {
		throw new UnsupportedOperationException();
	}

	public Seccion_fija__Administrador_[] consultar_SF_A() {
		throw new UnsupportedOperationException();
	}

	public Ultimas_secciones__Administrador_[] consultar_US_A() {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_seccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void quitar_seccion_fija(Object aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_seccion(String aTituloSeccion, String aIcono, boolean aFijarSeccion) {
		throw new UnsupportedOperationException();
	}
}