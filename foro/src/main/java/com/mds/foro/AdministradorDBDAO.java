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

public class AdministradorDBDAO {
	public static AdministradorDB loadAdministradorDBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadAdministradorDBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB getAdministradorDBByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getAdministradorDBByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadAdministradorDBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB getAdministradorDBByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return getAdministradorDBByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (AdministradorDB) session.load(com.mds.foro.AdministradorDB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB getAdministradorDBByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (AdministradorDB) session.get(com.mds.foro.AdministradorDB.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministradorDB) session.load(com.mds.foro.AdministradorDB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB getAdministradorDBByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministradorDB) session.get(com.mds.foro.AdministradorDB.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministradorDB(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryAdministradorDB(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministradorDB(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return queryAdministradorDB(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB[] listAdministradorDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listAdministradorDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB[] listAdministradorDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return listAdministradorDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministradorDB(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.AdministradorDB as AdministradorDB");
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
	
	public static List queryAdministradorDB(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.AdministradorDB as AdministradorDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AdministradorDB", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB[] listAdministradorDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministradorDB(session, condition, orderBy);
			return (AdministradorDB[]) list.toArray(new AdministradorDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB[] listAdministradorDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministradorDB(session, condition, orderBy, lockMode);
			return (AdministradorDB[]) list.toArray(new AdministradorDB[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadAdministradorDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return loadAdministradorDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AdministradorDB[] administradorDBs = listAdministradorDBByQuery(session, condition, orderBy);
		if (administradorDBs != null && administradorDBs.length > 0)
			return administradorDBs[0];
		else
			return null;
	}
	
	public static AdministradorDB loadAdministradorDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AdministradorDB[] administradorDBs = listAdministradorDBByQuery(session, condition, orderBy, lockMode);
		if (administradorDBs != null && administradorDBs.length > 0)
			return administradorDBs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorDBByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateAdministradorDBByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorDBByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoFinalPersistentManager.instance().getSession();
			return iterateAdministradorDBByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorDBByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.AdministradorDB as AdministradorDB");
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
	
	public static java.util.Iterator iterateAdministradorDBByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.mds.foro.AdministradorDB as AdministradorDB");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AdministradorDB", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB createAdministradorDB() {
		return new com.mds.foro.AdministradorDB();
	}
	
	public static boolean save(com.mds.foro.AdministradorDB administradorDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().saveObject(administradorDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.mds.foro.AdministradorDB administradorDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().deleteObject(administradorDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.AdministradorDB administradorDB)throws PersistentException {
		try {
			com.mds.foro.Usuario_DB[] lConvierte_en_moderadors = administradorDB.convierte_en_moderador.toArray();
			for(int i = 0; i < lConvierte_en_moderadors.length; i++) {
				lConvierte_en_moderadors[i].setConvertido_por(null);
			}
			com.mds.foro.Usuario_DB[] lBaneas = administradorDB.banea.toArray();
			for(int i = 0; i < lBaneas.length; i++) {
				lBaneas[i].setBaneado_por(null);
			}
			com.mds.foro.SeccionDB[] lCrea_seccions = administradorDB.crea_seccion.toArray();
			for(int i = 0; i < lCrea_seccions.length; i++) {
				lCrea_seccions[i].setCreada_por(null);
			}
			com.mds.foro.TemaDB[] lOculta_temas = administradorDB.oculta_tema.toArray();
			for(int i = 0; i < lOculta_temas.length; i++) {
				lOculta_temas[i].setOcultado_por(null);
			}
			com.mds.foro.MensajeDB[] lOculta_mensajes = administradorDB.oculta_mensaje.toArray();
			for(int i = 0; i < lOculta_mensajes.length; i++) {
				lOculta_mensajes[i].setOcultado_por(null);
			}
			if (administradorDB.getConvertido_por() != null) {
				administradorDB.getConvertido_por().convierte_en_moderador.remove(administradorDB);
			}
			
			if (administradorDB.getBaneado_por() != null) {
				administradorDB.getBaneado_por().banea.remove(administradorDB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = administradorDB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(administradorDB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = administradorDB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(administradorDB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = administradorDB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(administradorDB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = administradorDB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = administradorDB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = administradorDB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = administradorDB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(administradorDB);
			}
			return delete(administradorDB);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.mds.foro.AdministradorDB administradorDB, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.mds.foro.Usuario_DB[] lConvierte_en_moderadors = administradorDB.convierte_en_moderador.toArray();
			for(int i = 0; i < lConvierte_en_moderadors.length; i++) {
				lConvierte_en_moderadors[i].setConvertido_por(null);
			}
			com.mds.foro.Usuario_DB[] lBaneas = administradorDB.banea.toArray();
			for(int i = 0; i < lBaneas.length; i++) {
				lBaneas[i].setBaneado_por(null);
			}
			com.mds.foro.SeccionDB[] lCrea_seccions = administradorDB.crea_seccion.toArray();
			for(int i = 0; i < lCrea_seccions.length; i++) {
				lCrea_seccions[i].setCreada_por(null);
			}
			com.mds.foro.TemaDB[] lOculta_temas = administradorDB.oculta_tema.toArray();
			for(int i = 0; i < lOculta_temas.length; i++) {
				lOculta_temas[i].setOcultado_por(null);
			}
			com.mds.foro.MensajeDB[] lOculta_mensajes = administradorDB.oculta_mensaje.toArray();
			for(int i = 0; i < lOculta_mensajes.length; i++) {
				lOculta_mensajes[i].setOcultado_por(null);
			}
			if (administradorDB.getConvertido_por() != null) {
				administradorDB.getConvertido_por().convierte_en_moderador.remove(administradorDB);
			}
			
			if (administradorDB.getBaneado_por() != null) {
				administradorDB.getBaneado_por().banea.remove(administradorDB);
			}
			
			com.mds.foro.Usuario_DB[] lAmigos = administradorDB.amigo.toArray();
			for(int i = 0; i < lAmigos.length; i++) {
				lAmigos[i].amigo_de.remove(administradorDB);
			}
			com.mds.foro.MensajeDB[] lDa_megustas = administradorDB.da_megusta.toArray();
			for(int i = 0; i < lDa_megustas.length; i++) {
				lDa_megustas[i].gustado_por.remove(administradorDB);
			}
			com.mds.foro.Usuario_DB[] lAmigo_des = administradorDB.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].amigo.remove(administradorDB);
			}
			com.mds.foro.NotificacionDB[] lRecibes = administradorDB.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviada_por(null);
			}
			com.mds.foro.TemaDB[] lCrea_temas = administradorDB.crea_tema.toArray();
			for(int i = 0; i < lCrea_temas.length; i++) {
				lCrea_temas[i].setCreado_por(null);
			}
			com.mds.foro.MensajeDB[] lCrea_mensajes = administradorDB.crea_mensaje.toArray();
			for(int i = 0; i < lCrea_mensajes.length; i++) {
				lCrea_mensajes[i].setCreado_por(null);
			}
			com.mds.foro.TemaDB[] lDa_megusta_s = administradorDB.da_megusta_.toArray();
			for(int i = 0; i < lDa_megusta_s.length; i++) {
				lDa_megusta_s[i].gustado_por_.remove(administradorDB);
			}
			try {
				session.delete(administradorDB);
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
	
	public static boolean refresh(com.mds.foro.AdministradorDB administradorDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().refresh(administradorDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.mds.foro.AdministradorDB administradorDB) throws PersistentException {
		try {
			ProyectoFinalPersistentManager.instance().getSession().evict(administradorDB);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministradorDB loadAdministradorDBByCriteria(AdministradorDBCriteria administradorDBCriteria) {
		AdministradorDB[] administradorDBs = listAdministradorDBByCriteria(administradorDBCriteria);
		if(administradorDBs == null || administradorDBs.length == 0) {
			return null;
		}
		return administradorDBs[0];
	}
	
	public static AdministradorDB[] listAdministradorDBByCriteria(AdministradorDBCriteria administradorDBCriteria) {
		return administradorDBCriteria.listAdministradorDB();
	}
}
