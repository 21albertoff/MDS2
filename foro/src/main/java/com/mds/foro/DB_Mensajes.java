package com.mds.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.MensajeDB;

public class DB_Mensajes {
	public DB_Main _bd_main_mensajes;
	public Vector<MensajeDB> _contiene_mensaje = new Vector<MensajeDB>();

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_M(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.esta_en='"+idTema+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_M_UR(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.esta_en='"+idTema+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_M_UI(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.esta_en='"+idTema+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_MA(int idAmigo) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.creado_por='"+idAmigo+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_MisM(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.creado_por='"+idUsuario+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_M_Mo(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.esta_en='"+idTema+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_MU(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.creado_por='"+idUsuario+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_M_A(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.esta_en='"+idTema+"'", null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_MO() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB(null, null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return mensajes;
	}

	public boolean agregar_fotos(int idMensaje, String foto1, String foto2, String foto3) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			mensaje.setFoto1(foto1);
			if(foto2 != null || foto2 != "") {
				mensaje.setFoto2(foto2);
			}
			if(foto3 != null || foto3 != "") {
				mensaje.setFoto2(foto3);
			}
			MensajeDBDAO.save(mensaje);
			t.commit();
			return true;
			
			} catch (PersistentException e1) {
				t.rollback();

				return false;
			}
	}

	public boolean agregar_video(int idMensaje, String video) throws PersistentException {
PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			mensaje.setVideo(video);
			MensajeDBDAO.save(mensaje);
			t.commit();
			return true;
			
			} catch (PersistentException e1) {
				t.rollback();

				return false;
			}
	}

	public boolean eliminar_mi_mensaje(int idMensaje) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			mensaje.setEliminado(true);
			MensajeDBDAO.save(mensaje);
			t.commit();
			eliminado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	public boolean eliminar_mensaje(int idMensaje) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			mensaje.setEliminado(true);
			MensajeDBDAO.save(mensaje);
			t.commit();
			eliminado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	public void mostrar_mensaje(int idMensaje) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			mensaje.setOculto(false);
			MensajeDBDAO.save(mensaje);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public void reportar_mensaje(int aIdUsuario, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void ocultar_mensaje(int idMensaje) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			mensaje.setOculto(true);
			MensajeDBDAO.save(mensaje);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public boolean crear_mensaje(int idTema, int idUsuario, String mensaje, String foto1, String foto2, String foto3, String video) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			MensajeDB nuevoMensaje = MensajeDBDAO.createMensajeDB();
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			nuevoMensaje.setOcultado_por(null);
			nuevoMensaje.setORM_Ocultado_por(null);
			nuevoMensaje.setCreado_por(usuario);
			nuevoMensaje.setORM_Creado_por(usuario);
			nuevoMensaje.setORM_Esta_en(null);
			nuevoMensaje.setContieneM(tema);
			nuevoMensaje.setORM_ContieneM(tema);;
			nuevoMensaje.setCantidadLike(0);
			nuevoMensaje.setEliminado(false);
			nuevoMensaje.setOculto(false);
			nuevoMensaje.setMensaje(mensaje);
			nuevoMensaje.setEsta_en(null);
			MensajeDBDAO.save(nuevoMensaje);
			if(video != null || video != "") {
				agregar_video(nuevoMensaje.getIdMensaje(),video);
			}
			if(foto1 != null || foto1 != "") {
				agregar_fotos(nuevoMensaje.getIdMensaje(),foto1,foto2,foto3);
			}
				
			t.commit();
			return true;
			
			} catch (PersistentException e1) {
				t.rollback();

				return false;
			}
	}

	public void valorar_mensaje(int idUsuario, int idMensaje) throws PersistentException {
PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			MensajeDB mensaje = MensajeDBDAO.loadMensajeDBByORMID(idMensaje);
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);

			if(usuario.da_megusta.contains(mensaje)) {
				usuario.da_megusta.remove(mensaje);
				int likes = mensaje.getCantidadLike();
				mensaje.setCantidadLike(likes-1);
			} else {
				usuario.da_megusta.add(mensaje);
				int likes = mensaje.getCantidadLike();
				mensaje.setCantidadLike(likes+1);
			}
			MensajeDBDAO.save(mensaje);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}
}