/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Alberto Fuentes(University of Almeria)
 * License Type: Academic
 */
package com.mds.foro;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class SeccionDBDAO {
	public static SeccionDB loadSeccionDBByORMID(int idSeccion) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadSeccionDBByORMID(session, idSeccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB getSeccionDBByORMID(int idSeccion) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getSeccionDBByORMID(session, idSeccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByORMID(int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadSeccionDBByORMID(session, idSeccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB getSeccionDBByORMID(int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getSeccionDBByORMID(session, idSeccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByORMID(PersistentSession session, int idSeccion) throws PersistentException {
		try {
			return (SeccionDB) session.load(com.mds.foro.SeccionDB.class, new Integer(idSeccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB getSeccionDBByORMID(PersistentSession session, int idSeccion) throws PersistentException {
		try {
			return (SeccionDB) session.get(com.mds.foro.SeccionDB.class, new Integer(idSeccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByORMID(PersistentSession session, int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SeccionDB) session.load(com.mds.foro.SeccionDB.class, new Integer(idSeccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB getSeccionDBByORMID(PersistentSession session, int idSeccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SeccionDB) session.get(com.mds.foro.SeccionDB.class, new Integer(idSeccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccionDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return querySeccionDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccionDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return querySeccionDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB[] listSeccionDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listSeccionDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB[] listSeccionDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listSeccionDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccionDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.SeccionDB as SeccionDB");
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
	
	public static List querySeccionDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.SeccionDB as SeccionDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SeccionDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB[] listSeccionDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySeccionDB(session, condition, orderBy);
			return (SeccionDB[]) list.toArray(new SeccionDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB[] listSeccionDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySeccionDB(session, condition, orderBy, lockMode);
			return (SeccionDB[]) list.toArray(new SeccionDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadSeccionDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadSeccionDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SeccionDB[] seccionDBs = listSeccionDBByQuery(session, condition, orderBy);
		if (seccionDBs != null && seccionDBs.length > 0)
			return seccionDBs[0];
		else
			return null;
	}
	
	public static SeccionDB loadSeccionDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SeccionDB[] seccionDBs = listSeccionDBByQuery(session, condition, orderBy, lockMode);
		if (seccionDBs != null && seccionDBs.length > 0)
			return seccionDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSeccionDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateSeccionDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateSeccionDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.SeccionDB as SeccionDB");
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
	
	public static java.util.Iterator iterateSeccionDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.SeccionDB as SeccionDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SeccionDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB createSeccionDB() {
		return new com.mds.foro.SeccionDB();
	}
	
	public static boolean save(com.mds.foro.SeccionDB seccionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(seccionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.SeccionDB seccionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(seccionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.SeccionDB seccionDB)throws PersistentException {
		try {
			if (seccionDB.getCreada_por() != null) {
				seccionDB.getCreada_por().crea_seccion.remove(seccionDB);
			}
			
			com.mds.foro.TemaDB[] lContienes = seccionDB.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setEsta_en(null);
			}
			return delete(seccionDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.SeccionDB seccionDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (seccionDB.getCreada_por() != null) {
				seccionDB.getCreada_por().crea_seccion.remove(seccionDB);
			}
			
			com.mds.foro.TemaDB[] lContienes = seccionDB.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setEsta_en(null);
			}
			try {
				session.delete(seccionDB);
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
	
	public static boolean refresh(com.mds.foro.SeccionDB seccionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(seccionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.SeccionDB seccionDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(seccionDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SeccionDB loadSeccionDBByCriteria(SeccionDBCriteria seccionDBCriteria) {
		SeccionDB[] seccionDBs = listSeccionDBByCriteria(seccionDBCriteria);
		if(seccionDBs == null || seccionDBs.length == 0) {
			return null;
		}
		return seccionDBs[0];
	}
	
	public static SeccionDB[] listSeccionDBByCriteria(SeccionDBCriteria seccionDBCriteria) {
		return seccionDBCriteria.listSeccionDB();
	}
}
