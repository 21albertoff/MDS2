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

public class TemaDBDAO {
	public static TemaDB loadTemaDBByORMID(int idTema) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadTemaDBByORMID(session, idTema);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB getTemaDBByORMID(int idTema) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getTemaDBByORMID(session, idTema);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByORMID(int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadTemaDBByORMID(session, idTema, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB getTemaDBByORMID(int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getTemaDBByORMID(session, idTema, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByORMID(PersistentSession session, int idTema) throws PersistentException {
		try {
			return (TemaDB) session.load(com.mds.foro.TemaDB.class, new Integer(idTema));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB getTemaDBByORMID(PersistentSession session, int idTema) throws PersistentException {
		try {
			return (TemaDB) session.get(com.mds.foro.TemaDB.class, new Integer(idTema));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByORMID(PersistentSession session, int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TemaDB) session.load(com.mds.foro.TemaDB.class, new Integer(idTema), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB getTemaDBByORMID(PersistentSession session, int idTema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TemaDB) session.get(com.mds.foro.TemaDB.class, new Integer(idTema), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemaDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryTemaDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemaDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryTemaDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB[] listTemaDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listTemaDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB[] listTemaDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listTemaDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemaDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.TemaDB as TemaDB");
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
	
	public static List queryTemaDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.TemaDB as TemaDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TemaDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB[] listTemaDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTemaDB(session, condition, orderBy);
			return (TemaDB[]) list.toArray(new TemaDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB[] listTemaDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTemaDB(session, condition, orderBy, lockMode);
			return (TemaDB[]) list.toArray(new TemaDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadTemaDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadTemaDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TemaDB[] temaDBs = listTemaDBByQuery(session, condition, orderBy);
		if (temaDBs != null && temaDBs.length > 0)
			return temaDBs[0];
		else
			return null;
	}
	
	public static TemaDB loadTemaDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TemaDB[] temaDBs = listTemaDBByQuery(session, condition, orderBy, lockMode);
		if (temaDBs != null && temaDBs.length > 0)
			return temaDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTemaDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateTemaDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateTemaDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.TemaDB as TemaDB");
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
	
	public static java.util.Iterator iterateTemaDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.TemaDB as TemaDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TemaDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB createTemaDB() {
		return new com.mds.foro.TemaDB();
	}
	
	public static boolean save(com.mds.foro.TemaDB temaDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(temaDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.TemaDB temaDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(temaDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.TemaDB temaDB)throws PersistentException {
		try {
			if (temaDB.getOcultado_por() != null) {
				temaDB.getOcultado_por().oculta_tema.remove(temaDB);
			}
			
			if (temaDB.getCreado_por() != null) {
				temaDB.getCreado_por().crea_tema.remove(temaDB);
			}
			
			if (temaDB.getEsta_en() != null) {
				temaDB.getEsta_en().contiene.remove(temaDB);
			}
			
			com.mds.foro.Usuario_DB[] lGustado_por_s = temaDB.gustado_por_.toArray();
			for(int i = 0; i < lGustado_por_s.length; i++) {
				lGustado_por_s[i].da_megusta_.remove(temaDB);
			}
			return delete(temaDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.TemaDB temaDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (temaDB.getOcultado_por() != null) {
				temaDB.getOcultado_por().oculta_tema.remove(temaDB);
			}
			
			if (temaDB.getCreado_por() != null) {
				temaDB.getCreado_por().crea_tema.remove(temaDB);
			}
			
			if (temaDB.getEsta_en() != null) {
				temaDB.getEsta_en().contiene.remove(temaDB);
			}
			
			com.mds.foro.Usuario_DB[] lGustado_por_s = temaDB.gustado_por_.toArray();
			for(int i = 0; i < lGustado_por_s.length; i++) {
				lGustado_por_s[i].da_megusta_.remove(temaDB);
			}
			try {
				session.delete(temaDB);
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
	
	public static boolean refresh(com.mds.foro.TemaDB temaDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(temaDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.TemaDB temaDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(temaDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TemaDB loadTemaDBByCriteria(TemaDBCriteria temaDBCriteria) {
		TemaDB[] temaDBs = listTemaDBByCriteria(temaDBCriteria);
		if(temaDBs == null || temaDBs.length == 0) {
			return null;
		}
		return temaDBs[0];
	}
	
	public static TemaDB[] listTemaDBByCriteria(TemaDBCriteria temaDBCriteria) {
		return temaDBCriteria.listTemaDB();
	}
}
