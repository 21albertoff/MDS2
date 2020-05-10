/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: dor494(University of Almeria)
 * License Type: Academic
 */
package com.mds.foro;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class NotificacionDBDAO {
	public static NotificacionDB loadNotificacionDBByORMID(int idNotificacion) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacionDBByORMID(session, idNotificacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB getNotificacionDBByORMID(int idNotificacion) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getNotificacionDBByORMID(session, idNotificacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByORMID(int idNotificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacionDBByORMID(session, idNotificacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB getNotificacionDBByORMID(int idNotificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getNotificacionDBByORMID(session, idNotificacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByORMID(PersistentSession session, int idNotificacion) throws PersistentException {
		try {
			return (NotificacionDB) session.load(com.mds.foro.NotificacionDB.class, new Integer(idNotificacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB getNotificacionDBByORMID(PersistentSession session, int idNotificacion) throws PersistentException {
		try {
			return (NotificacionDB) session.get(com.mds.foro.NotificacionDB.class, new Integer(idNotificacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByORMID(PersistentSession session, int idNotificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotificacionDB) session.load(com.mds.foro.NotificacionDB.class, new Integer(idNotificacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB getNotificacionDBByORMID(PersistentSession session, int idNotificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotificacionDB) session.get(com.mds.foro.NotificacionDB.class, new Integer(idNotificacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacionDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryNotificacionDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacionDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryNotificacionDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB[] listNotificacionDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listNotificacionDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB[] listNotificacionDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listNotificacionDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacionDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.NotificacionDB as NotificacionDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacionDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.NotificacionDB as NotificacionDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotificacionDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB[] listNotificacionDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotificacionDB(session, condition, orderBy);
			return (NotificacionDB[]) list.toArray(new NotificacionDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB[] listNotificacionDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotificacionDB(session, condition, orderBy, lockMode);
			return (NotificacionDB[]) list.toArray(new NotificacionDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacionDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadNotificacionDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		NotificacionDB[] notificacionDBs = listNotificacionDBByQuery(session, condition, orderBy);
		if (notificacionDBs != null && notificacionDBs.length > 0)
			return notificacionDBs[0];
		else
			return null;
	}
	
	public static NotificacionDB loadNotificacionDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		NotificacionDB[] notificacionDBs = listNotificacionDBByQuery(session, condition, orderBy, lockMode);
		if (notificacionDBs != null && notificacionDBs.length > 0)
			return notificacionDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotificacionDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateNotificacionDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacionDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateNotificacionDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacionDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.NotificacionDB as NotificacionDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacionDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.NotificacionDB as NotificacionDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotificacionDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB createNotificacionDB() {
		return new com.mds.foro.NotificacionDB();
	}
	
	public static boolean save(com.mds.foro.NotificacionDB notificacionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(notificacionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.NotificacionDB notificacionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(notificacionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.NotificacionDB notificacionDB)throws PersistentException {
		try {
			if (notificacionDB.getEnviada_por() != null) {
				notificacionDB.getEnviada_por().recibe.remove(notificacionDB);
			}
			
			return delete(notificacionDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.NotificacionDB notificacionDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notificacionDB.getEnviada_por() != null) {
				notificacionDB.getEnviada_por().recibe.remove(notificacionDB);
			}
			
			try {
				session.delete(notificacionDB);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.mds.foro.NotificacionDB notificacionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(notificacionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.NotificacionDB notificacionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(notificacionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificacionDB loadNotificacionDBByCriteria(NotificacionDBCriteria notificacionDBCriteria) {
		NotificacionDB[] notificacionDBs = listNotificacionDBByCriteria(notificacionDBCriteria);
		if(notificacionDBs == null || notificacionDBs.length == 0) {
			return null;
		}
		return notificacionDBs[0];
	}
	
	public static NotificacionDB[] listNotificacionDBByCriteria(NotificacionDBCriteria notificacionDBCriteria) {
		return notificacionDBCriteria.listNotificacionDB();
	}
}
