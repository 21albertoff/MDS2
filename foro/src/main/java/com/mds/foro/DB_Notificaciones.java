package com.mds.foro;

import java.util.Vector;
import com.mds.foro.NotificacionDB;

public class DB_Notificaciones {
	public DB_Main _bd_main_notificaciones;
	public Vector<NotificacionDB> _contiene_notificacion = new Vector<NotificacionDB>();

	public Notificacion[] consultar_N() {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_notificacion(int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}
}