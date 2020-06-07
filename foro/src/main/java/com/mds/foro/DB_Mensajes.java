package com.mds.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.MensajeDB;

public class DB_Mensajes {
	public DB_Main _bd_main_mensajes;
	public Vector<MensajeDB> _contiene_mensaje = new Vector<MensajeDB>();

	//Consultar mensajes usuario no identificado
	@SuppressWarnings("unchecked")
	public List<MensajeDB> consultar_M(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<MensajeDB> mensajes = null;
		try {			
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.contieneM='"+idTema+"'", null);
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
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.contieneM='"+idTema+"'", null);
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
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.contieneM='"+idTema+"'", null);
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
			mensajes = MensajeDBDAO.queryMensajeDB("MensajeDB.contieneM='"+idTema+"'", null);
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

	//Eliminar mensaje
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

	public void reportar_mensaje(int idUsuario, int idMensaje) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_registradoDB reporte = Usuario_registradoDBDAO.loadUsuario_registradoDBByORMID(idUsuario);
			reporte.reporta.add(reporte);
			Usuario_registradoDBDAO.save(reporte);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
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
			if (video == "null") {
				nuevoMensaje.setVideo(null);
				
				if (foto1 == "null") { nuevoMensaje.setFoto1(null);
				} else { nuevoMensaje.setFoto1(foto1);
					if (foto2 == "null") { nuevoMensaje.setFoto2(null);
					} else { nuevoMensaje.setFoto2(foto2);
						if (foto3 == "null") { nuevoMensaje.setFoto3(null);
						} else { nuevoMensaje.setFoto3(foto3);
						}
					}
				}
			} else {
				nuevoMensaje.setVideo(video);
			}
			MensajeDBDAO.save(nuevoMensaje);
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

			if(mensaje.gustado_por.contains(usuario)) {
				mensaje.gustado_por.remove(usuario);
				int likes = mensaje.getCantidadLike();
				likes = likes -1;
				mensaje.setCantidadLike(likes);
				Parametros.setLikesTema(likes);
			} else {
				mensaje.gustado_por.add(usuario);
				int likes = mensaje.getCantidadLike();
				likes = likes +1;
				mensaje.setCantidadLike(likes);
				Parametros.setLikesTema(likes);
			}
			MensajeDBDAO.save(mensaje);
			Usuario_DBDAO.save(usuario);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public boolean citar_mensaje(int idTema, int idUsuario, int idCita, String mensaje, String foto1, String foto2, String foto3, String video) throws PersistentException {
PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			MensajeDB nuevoMensaje = MensajeDBDAO.createMensajeDB();
			
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			MensajeDB citado = MensajeDBDAO.loadMensajeDBByORMID(idCita);
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
			nuevoMensaje.setEsta_en(citado);
			nuevoMensaje.setFoto1(null);
			nuevoMensaje.setFoto2(null);
			nuevoMensaje.setFoto3(null);
			nuevoMensaje.setVideo(null);
			if (video == "null") {
				nuevoMensaje.setVideo(null);
				
				if (foto1 == "null") { nuevoMensaje.setFoto1(null);
				} else { nuevoMensaje.setFoto1(foto1);
					if (foto2 == "null") { nuevoMensaje.setFoto2(null);
					} else { nuevoMensaje.setFoto2(foto2);
						if (foto3 == "null") { nuevoMensaje.setFoto3(null);
						} else { nuevoMensaje.setFoto3(foto3);
						}
					}
				}
			} else {
				nuevoMensaje.setVideo(video);
			}
			MensajeDBDAO.save(nuevoMensaje);
			t.commit();

			return true;
			
			} catch (PersistentException e1) {
				t.rollback();

				return false;
			}
	}
}