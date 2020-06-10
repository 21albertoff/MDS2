package com.mds.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.NotificacionDB;

public class DB_Notificaciones {
	public DB_Main _bd_main_notificaciones;
	public Vector<NotificacionDB> _contiene_notificacion = new Vector<NotificacionDB>();

	@SuppressWarnings("unchecked")
	public List<NotificacionDB> consultar_N(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<NotificacionDB> notificacion = null;
		try {			
			notificacion = NotificacionDBDAO.queryNotificacionDB(null, null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return notificacion;
	}

	public boolean eliminar_notificacion(int idUsuario, int idNotificacion) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			NotificacionDB notificacion = NotificacionDBDAO.loadNotificacionDBByORMID(idNotificacion);
			NotificacionDBDAO.deleteAndDissociate(notificacion);
			NotificacionDBDAO.save(notificacion);
			t.commit();
			eliminado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	public void crear_notificacion(int idUsuario, int idUsuarioAmigo) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			NotificacionDB notificacion = NotificacionDBDAO.createNotificacionDB();
			Usuario_DB user = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			notificacion.setEnviada_por(user);
			NotificacionDBDAO.save(notificacion);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		
	}
}