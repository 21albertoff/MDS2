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

public class Usuario_DBDAO {
	public static Usuario_DB loadUsuario_DBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_DBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB getUsuario_DBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getUsuario_DBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_DBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB getUsuario_DBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getUsuario_DBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_DB) session.load(com.mds.foro.Usuario_DB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB getUsuario_DBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_DB) session.get(com.mds.foro.Usuario_DB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_DB) session.load(com.mds.foro.Usuario_DB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB getUsuario_DBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_DB) session.get(com.mds.foro.Usuario_DB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_DB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryUsuario_DB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_DB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryUsuario_DB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB[] listUsuario_DBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listUsuario_DBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB[] listUsuario_DBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listUsuario_DBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_DB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_DB as Usuario_DB");
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
	
	public static List queryUsuario_DB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_DB as Usuario_DB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_DB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB[] listUsuario_DBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_DB(session, condition, orderBy);
			return (Usuario_DB[]) list.toArray(new Usuario_DB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB[] listUsuario_DBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_DB(session, condition, orderBy, lockMode);
			return (Usuario_DB[]) list.toArray(new Usuario_DB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_DBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_DBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_DB[] usuario_DBs = listUsuario_DBByQuery(session, condition, orderBy);
		if (usuario_DBs != null && usuario_DBs.length > 0)
			return usuario_DBs[0];
		else
			return null;
	}
	
	public static Usuario_DB loadUsuario_DBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_DB[] usuario_DBs = listUsuario_DBByQuery(session, condition, orderBy, lockMode);
		if (usuario_DBs != null && usuario_DBs.length > 0)
			return usuario_DBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_DBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateUsuario_DBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_DBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateUsuario_DBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_DBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_DB as Usuario_DB");
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
	
	public static java.util.Iterator iterateUsuario_DBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_DB as Usuario_DB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_DB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB createUsuario_DB() {
		return new com.mds.foro.Usuario_DB();
	}
	
	public static boolean save(com.mds.foro.Usuario_DB usuario_DB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(usuario_DB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.Usuario_DB usuario_DB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(usuario_DB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.Usuario_DB usuario_DB)throws PersistentException {
		if (usuario_DB instanceof com.mds.foro.AdministradorDB) {
			return com.mds.foro.AdministradorDBDAO.deleteAndDissociate((com.mds.foro.AdministradorDB) usuario_DB);
		}
		
		if (usuario_DB instanceof com.mds.foro.Usuario_registradoDB) {
			return com.mds.foro.Usuario_registradoDBDAO.deleteAndDissociate((com.mds.foro.Usuario_registradoDB) usuario_DB);
		}
		
		try {
			if (usuario_DB.getConvertido_por() != null) {
				usuario_DB.getConvertido_por().convierte_en_moderador.remove(usuario_DB);
			}
			
			if (usuario_DB.getBaneado_por() != null) {
				usuario_DB.getBaneado_por().banea.remove(usuario_DB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = usuario_DB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(usuario_DB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = usuario_DB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(usuario_DB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = usuario_DB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(usuario_DB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = usuario_DB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = usuario_DB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = usuario_DB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = usuario_DB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(usuario_DB);
			}
			return delete(usuario_DB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.Usuario_DB usuario_DB, org.orm.PersistentSession session)throws PersistentException {
		if (usuario_DB instanceof com.mds.foro.AdministradorDB) {
			return com.mds.foro.AdministradorDBDAO.deleteAndDissociate((com.mds.foro.AdministradorDB) usuario_DB, session);
		}
		
		if (usuario_DB instanceof com.mds.foro.Usuario_registradoDB) {
			return com.mds.foro.Usuario_registradoDBDAO.deleteAndDissociate((com.mds.foro.Usuario_registradoDB) usuario_DB, session);
		}
		
		try {
			if (usuario_DB.getConvertido_por() != null) {
				usuario_DB.getConvertido_por().convierte_en_moderador.remove(usuario_DB);
			}
			
			if (usuario_DB.getBaneado_por() != null) {
				usuario_DB.getBaneado_por().banea.remove(usuario_DB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = usuario_DB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(usuario_DB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = usuario_DB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(usuario_DB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = usuario_DB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(usuario_DB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = usuario_DB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = usuario_DB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = usuario_DB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = usuario_DB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(usuario_DB);
			}
			try {
				session.delete(usuario_DB);
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
	
	public static boolean refresh(com.mds.foro.Usuario_DB usuario_DB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(usuario_DB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.Usuario_DB usuario_DB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(usuario_DB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_DB loadUsuario_DBByCriteria(Usuario_DBCriteria usuario_DBCriteria) {
		Usuario_DB[] usuario_DBs = listUsuario_DBByCriteria(usuario_DBCriteria);
		if(usuario_DBs == null || usuario_DBs.length == 0) {
			return null;
		}
		return usuario_DBs[0];
	}
	
	public static Usuario_DB[] listUsuario_DBByCriteria(Usuario_DBCriteria usuario_DBCriteria) {
		return usuario_DBCriteria.listUsuario_DB();
	}
}
