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

public class Usuario_notificadosDBDAO {
	public static Usuario_notificadosDB loadUsuario_notificadosDBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_notificadosDBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB getUsuario_notificadosDBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getUsuario_notificadosDBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_notificadosDBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB getUsuario_notificadosDBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getUsuario_notificadosDBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_notificadosDB) session.load(com.mds.foro.Usuario_notificadosDB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB getUsuario_notificadosDBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_notificadosDB) session.get(com.mds.foro.Usuario_notificadosDB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_notificadosDB) session.load(com.mds.foro.Usuario_notificadosDB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB getUsuario_notificadosDBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_notificadosDB) session.get(com.mds.foro.Usuario_notificadosDB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_notificadosDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryUsuario_notificadosDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_notificadosDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryUsuario_notificadosDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB[] listUsuario_notificadosDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listUsuario_notificadosDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB[] listUsuario_notificadosDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listUsuario_notificadosDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_notificadosDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_notificadosDB as Usuario_notificadosDB");
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
	
	public static List queryUsuario_notificadosDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_notificadosDB as Usuario_notificadosDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_notificadosDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB[] listUsuario_notificadosDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_notificadosDB(session, condition, orderBy);
			return (Usuario_notificadosDB[]) list.toArray(new Usuario_notificadosDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB[] listUsuario_notificadosDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_notificadosDB(session, condition, orderBy, lockMode);
			return (Usuario_notificadosDB[]) list.toArray(new Usuario_notificadosDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_notificadosDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_notificadosDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_notificadosDB[] usuario_notificadosDBs = listUsuario_notificadosDBByQuery(session, condition, orderBy);
		if (usuario_notificadosDBs != null && usuario_notificadosDBs.length > 0)
			return usuario_notificadosDBs[0];
		else
			return null;
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_notificadosDB[] usuario_notificadosDBs = listUsuario_notificadosDBByQuery(session, condition, orderBy, lockMode);
		if (usuario_notificadosDBs != null && usuario_notificadosDBs.length > 0)
			return usuario_notificadosDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_notificadosDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateUsuario_notificadosDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_notificadosDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateUsuario_notificadosDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_notificadosDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_notificadosDB as Usuario_notificadosDB");
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
	
	public static java.util.Iterator iterateUsuario_notificadosDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_notificadosDB as Usuario_notificadosDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_notificadosDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB createUsuario_notificadosDB() {
		return new com.mds.foro.Usuario_notificadosDB();
	}
	
	public static boolean save(com.mds.foro.Usuario_notificadosDB usuario_notificadosDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(usuario_notificadosDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.Usuario_notificadosDB usuario_notificadosDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(usuario_notificadosDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.Usuario_notificadosDB usuario_notificadosDB)throws PersistentException {
		try {
			if (usuario_notificadosDB.getBaneado_porN() != null) {
				usuario_notificadosDB.getBaneado_porN().baneaN.remove(usuario_notificadosDB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = usuario_notificadosDB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(usuario_notificadosDB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = usuario_notificadosDB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(usuario_notificadosDB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = usuario_notificadosDB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(usuario_notificadosDB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = usuario_notificadosDB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = usuario_notificadosDB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = usuario_notificadosDB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = usuario_notificadosDB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(usuario_notificadosDB);
			}
			return delete(usuario_notificadosDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.Usuario_notificadosDB usuario_notificadosDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario_notificadosDB.getBaneado_porN() != null) {
				usuario_notificadosDB.getBaneado_porN().baneaN.remove(usuario_notificadosDB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = usuario_notificadosDB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(usuario_notificadosDB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = usuario_notificadosDB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(usuario_notificadosDB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = usuario_notificadosDB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(usuario_notificadosDB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = usuario_notificadosDB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = usuario_notificadosDB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = usuario_notificadosDB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = usuario_notificadosDB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(usuario_notificadosDB);
			}
			try {
				session.delete(usuario_notificadosDB);
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
	
	public static boolean refresh(com.mds.foro.Usuario_notificadosDB usuario_notificadosDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(usuario_notificadosDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.Usuario_notificadosDB usuario_notificadosDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(usuario_notificadosDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_notificadosDB loadUsuario_notificadosDBByCriteria(Usuario_notificadosDBCriteria usuario_notificadosDBCriteria) {
		Usuario_notificadosDB[] usuario_notificadosDBs = listUsuario_notificadosDBByCriteria(usuario_notificadosDBCriteria);
		if(usuario_notificadosDBs == null || usuario_notificadosDBs.length == 0) {
			return null;
		}
		return usuario_notificadosDBs[0];
	}
	
	public static Usuario_notificadosDB[] listUsuario_notificadosDBByCriteria(Usuario_notificadosDBCriteria usuario_notificadosDBCriteria) {
		return usuario_notificadosDBCriteria.listUsuario_notificadosDB();
	}
}
