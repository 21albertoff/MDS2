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

public class Usuario_registradoDBDAO {
	public static Usuario_registradoDB loadUsuario_registradoDBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_registradoDBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB getUsuario_registradoDBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getUsuario_registradoDBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_registradoDBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB getUsuario_registradoDBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getUsuario_registradoDBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_registradoDB) session.load(com.mds.foro.Usuario_registradoDB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB getUsuario_registradoDBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_registradoDB) session.get(com.mds.foro.Usuario_registradoDB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_registradoDB) session.load(com.mds.foro.Usuario_registradoDB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB getUsuario_registradoDBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_registradoDB) session.get(com.mds.foro.Usuario_registradoDB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registradoDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryUsuario_registradoDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registradoDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryUsuario_registradoDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB[] listUsuario_registradoDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listUsuario_registradoDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB[] listUsuario_registradoDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listUsuario_registradoDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registradoDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_registradoDB as Usuario_registradoDB");
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
	
	public static List queryUsuario_registradoDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_registradoDB as Usuario_registradoDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_registradoDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB[] listUsuario_registradoDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_registradoDB(session, condition, orderBy);
			return (Usuario_registradoDB[]) list.toArray(new Usuario_registradoDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB[] listUsuario_registradoDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_registradoDB(session, condition, orderBy, lockMode);
			return (Usuario_registradoDB[]) list.toArray(new Usuario_registradoDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_registradoDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadUsuario_registradoDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_registradoDB[] usuario_registradoDBs = listUsuario_registradoDBByQuery(session, condition, orderBy);
		if (usuario_registradoDBs != null && usuario_registradoDBs.length > 0)
			return usuario_registradoDBs[0];
		else
			return null;
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_registradoDB[] usuario_registradoDBs = listUsuario_registradoDBByQuery(session, condition, orderBy, lockMode);
		if (usuario_registradoDBs != null && usuario_registradoDBs.length > 0)
			return usuario_registradoDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_registradoDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateUsuario_registradoDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_registradoDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateUsuario_registradoDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_registradoDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_registradoDB as Usuario_registradoDB");
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
	
	public static java.util.Iterator iterateUsuario_registradoDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.Usuario_registradoDB as Usuario_registradoDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_registradoDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB createUsuario_registradoDB() {
		return new com.mds.foro.Usuario_registradoDB();
	}
	
	public static boolean save(com.mds.foro.Usuario_registradoDB usuario_registradoDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(usuario_registradoDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.Usuario_registradoDB usuario_registradoDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(usuario_registradoDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.Usuario_registradoDB usuario_registradoDB)throws PersistentException {
		try {
			com.mds.foro.Usuario_registradoDB[] lReportas = usuario_registradoDB.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].reportado_por.remove(usuario_registradoDB);
			}
			com.mds.foro.Usuario_registradoDB[] lReportado_pors = usuario_registradoDB.reportado_por.toArray();
			for(int i = 0; i < lReportado_pors.length; i++) {
				lReportado_pors[i].reporta.remove(usuario_registradoDB);
			}
			if (usuario_registradoDB.getConvertido_por() != null) {
				usuario_registradoDB.getConvertido_por().convierte_en_moderador.remove(usuario_registradoDB);
			}
			
			if (usuario_registradoDB.getBaneado_por() != null) {
				usuario_registradoDB.getBaneado_por().banea.remove(usuario_registradoDB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = usuario_registradoDB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(usuario_registradoDB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = usuario_registradoDB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(usuario_registradoDB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = usuario_registradoDB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(usuario_registradoDB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = usuario_registradoDB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = usuario_registradoDB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = usuario_registradoDB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = usuario_registradoDB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(usuario_registradoDB);
			}
			return delete(usuario_registradoDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.Usuario_registradoDB usuario_registradoDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mds.foro.Usuario_registradoDB[] lReportas = usuario_registradoDB.reporta.toArray();
			for(int i = 0; i < lReportas.length; i++) {
				lReportas[i].reportado_por.remove(usuario_registradoDB);
			}
			com.mds.foro.Usuario_registradoDB[] lReportado_pors = usuario_registradoDB.reportado_por.toArray();
			for(int i = 0; i < lReportado_pors.length; i++) {
				lReportado_pors[i].reporta.remove(usuario_registradoDB);
			}
			if (usuario_registradoDB.getConvertido_por() != null) {
				usuario_registradoDB.getConvertido_por().convierte_en_moderador.remove(usuario_registradoDB);
			}
			
			if (usuario_registradoDB.getBaneado_por() != null) {
				usuario_registradoDB.getBaneado_por().banea.remove(usuario_registradoDB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = usuario_registradoDB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(usuario_registradoDB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = usuario_registradoDB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(usuario_registradoDB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = usuario_registradoDB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(usuario_registradoDB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = usuario_registradoDB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = usuario_registradoDB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = usuario_registradoDB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = usuario_registradoDB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(usuario_registradoDB);
			}
			try {
				session.delete(usuario_registradoDB);
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
	
	public static boolean refresh(com.mds.foro.Usuario_registradoDB usuario_registradoDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(usuario_registradoDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.Usuario_registradoDB usuario_registradoDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(usuario_registradoDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registradoDB loadUsuario_registradoDBByCriteria(Usuario_registradoDBCriteria usuario_registradoDBCriteria) {
		Usuario_registradoDB[] usuario_registradoDBs = listUsuario_registradoDBByCriteria(usuario_registradoDBCriteria);
		if(usuario_registradoDBs == null || usuario_registradoDBs.length == 0) {
			return null;
		}
		return usuario_registradoDBs[0];
	}
	
	public static Usuario_registradoDB[] listUsuario_registradoDBByCriteria(Usuario_registradoDBCriteria usuario_registradoDBCriteria) {
		return usuario_registradoDBCriteria.listUsuario_registradoDB();
	}
}
