package com.mds.foro;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.NotificacionDB;

public class DB_Notificaciones {
	public DB_Main _bd_main_notificaciones;
	public Vector<NotificacionDB> _contiene_notificacion = new Vector<NotificacionDB>();

	// Consultar notificaciones
	@SuppressWarnings("unchecked")
	public List<NotificacionDB> consultar_N(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<NotificacionDB> notificacion = null;
		try {
			notificacion = NotificacionDBDAO.queryNotificacionDB("NotificacionDB.enviada_por='"+idUsuario+"'", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return notificacion;
	}

	// Eliminar notificaicon
	public boolean eliminar_notificacion(int idUsuario, int idNotificacion) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			NotificacionDB notificacion = NotificacionDBDAO.loadNotificacionDBByORMID(idNotificacion);
			NotificacionDBDAO.deleteAndDissociate(notificacion);
			NotificacionDBDAO.save(notificacion);
			t.commit();
			eliminado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	// Crear notificacion
	public void crear_notificacion(int idUsuario, int idUsuarioAmigo) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			NotificacionDB notificacion = NotificacionDBDAO.createNotificacionDB();
			Usuario_DB user = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuarioAmigo);
			Usuario_DB user2 = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			String m = ""+user2.getIdUsuario();
			notificacion.setMensajeNotif(m);
			notificacion.setORM_Enviada_por(user);
			NotificacionDBDAO.save(notificacion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}
}