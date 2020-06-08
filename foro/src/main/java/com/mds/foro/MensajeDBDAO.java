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

public class MensajeDBDAO {
	public static MensajeDB loadMensajeDBByORMID(int idMensaje) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadMensajeDBByORMID(session, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB getMensajeDBByORMID(int idMensaje) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getMensajeDBByORMID(session, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByORMID(int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadMensajeDBByORMID(session, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB getMensajeDBByORMID(int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getMensajeDBByORMID(session, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByORMID(PersistentSession session, int idMensaje) throws PersistentException {
		try {
			return (MensajeDB) session.load(com.mds.foro.MensajeDB.class, new Integer(idMensaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB getMensajeDBByORMID(PersistentSession session, int idMensaje) throws PersistentException {
		try {
			return (MensajeDB) session.get(com.mds.foro.MensajeDB.class, new Integer(idMensaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByORMID(PersistentSession session, int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MensajeDB) session.load(com.mds.foro.MensajeDB.class, new Integer(idMensaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB getMensajeDBByORMID(PersistentSession session, int idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MensajeDB) session.get(com.mds.foro.MensajeDB.class, new Integer(idMensaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensajeDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryMensajeDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensajeDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryMensajeDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB[] listMensajeDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listMensajeDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB[] listMensajeDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listMensajeDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensajeDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.MensajeDB as MensajeDB");
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
	
	public static List queryMensajeDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.MensajeDB as MensajeDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MensajeDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB[] listMensajeDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMensajeDB(session, condition, orderBy);
			return (MensajeDB[]) list.toArray(new MensajeDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB[] listMensajeDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMensajeDB(session, condition, orderBy, lockMode);
			return (MensajeDB[]) list.toArray(new MensajeDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadMensajeDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadMensajeDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MensajeDB[] mensajeDBs = listMensajeDBByQuery(session, condition, orderBy);
		if (mensajeDBs != null && mensajeDBs.length > 0)
			return mensajeDBs[0];
		else
			return null;
	}
	
	public static MensajeDB loadMensajeDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MensajeDB[] mensajeDBs = listMensajeDBByQuery(session, condition, orderBy, lockMode);
		if (mensajeDBs != null && mensajeDBs.length > 0)
			return mensajeDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMensajeDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateMensajeDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateMensajeDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.MensajeDB as MensajeDB");
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
	
	public static java.util.Iterator iterateMensajeDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.MensajeDB as MensajeDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MensajeDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB createMensajeDB() {
		return new com.mds.foro.MensajeDB();
	}
	
	public static boolean save(com.mds.foro.MensajeDB mensajeDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(mensajeDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.MensajeDB mensajeDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(mensajeDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.MensajeDB mensajeDB)throws PersistentException {
		try {
			if (mensajeDB.getEsta_en() != null) {
				mensajeDB.getEsta_en().contiene_respuesta.remove(mensajeDB);
			}
			
			if (mensajeDB.getContieneM() != null) {
				mensajeDB.getContieneM().esta_en_tema.remove(mensajeDB);
			}
			
			if (mensajeDB.getCreado_por() != null) {
				mensajeDB.getCreado_por().crea_mensaje.remove(mensajeDB);
			}
			
			if (mensajeDB.getOcultado_por() != null) {
				mensajeDB.getOcultado_por().oculta_mensaje.remove(mensajeDB);
			}
			
			com.mds.foro.MensajeDB[] lContiene_respuestas = mensajeDB.contiene_respuesta.toArray();
			for(int i = 0; i < lContiene_respuestas.length; i++) {
				lContiene_respuestas[i].setEsta_en(null);
			}
			com.mds.foro.Usuario_DB[] lGustado_pors = mensajeDB.gustado_por.toArray();
			for(int i = 0; i < lGustado_pors.length; i++) {
				lGustado_pors[i].da_megusta.remove(mensajeDB);
			}
			return delete(mensajeDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.MensajeDB mensajeDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (mensajeDB.getEsta_en() != null) {
				mensajeDB.getEsta_en().contiene_respuesta.remove(mensajeDB);
			}
			
			if (mensajeDB.getContieneM() != null) {
				mensajeDB.getContieneM().esta_en_tema.remove(mensajeDB);
			}
			
			if (mensajeDB.getCreado_por() != null) {
				mensajeDB.getCreado_por().crea_mensaje.remove(mensajeDB);
			}
			
			if (mensajeDB.getOcultado_por() != null) {
				mensajeDB.getOcultado_por().oculta_mensaje.remove(mensajeDB);
			}
			
			com.mds.foro.MensajeDB[] lContiene_respuestas = mensajeDB.contiene_respuesta.toArray();
			for(int i = 0; i < lContiene_respuestas.length; i++) {
				lContiene_respuestas[i].setEsta_en(null);
			}
			com.mds.foro.Usuario_DB[] lGustado_pors = mensajeDB.gustado_por.toArray();
			for(int i = 0; i < lGustado_pors.length; i++) {
				lGustado_pors[i].da_megusta.remove(mensajeDB);
			}
			try {
				session.delete(mensajeDB);
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
	
	public static boolean refresh(com.mds.foro.MensajeDB mensajeDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(mensajeDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.MensajeDB mensajeDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(mensajeDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MensajeDB loadMensajeDBByCriteria(MensajeDBCriteria mensajeDBCriteria) {
		MensajeDB[] mensajeDBs = listMensajeDBByCriteria(mensajeDBCriteria);
		if(mensajeDBs == null || mensajeDBs.length == 0) {
			return null;
		}
		return mensajeDBs[0];
	}
	
	public static MensajeDB[] listMensajeDBByCriteria(MensajeDBCriteria mensajeDBCriteria) {
		return mensajeDBCriteria.listMensajeDB();
	}
}
