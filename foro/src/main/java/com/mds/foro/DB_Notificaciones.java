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
	public List<NotificacionDB> consultar_N(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<NotificacionDB> notificacion = null;
		try {
			Usuario_DB user = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			notificacion = Arrays.asList(user.recibe.toArray());
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
			Usuario_DB user = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			user.recibe.remove(notificacion);
			NotificacionDBDAO.delete(notificacion);
			NotificacionDBDAO.save(notificacion);
			Usuario_DBDAO.save(user);
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
			notificacion.setEnviada_por(user2);
			NotificacionDBDAO.save(notificacion);
			user.recibe.add(notificacion);
			Usuario_DBDAO.save(user);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}
}