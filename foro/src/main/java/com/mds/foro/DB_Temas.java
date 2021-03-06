package com.mds.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.TemaDB;

public class DB_Temas {

	// Declaraciones
	public DB_Main _bd_main_temas;
	public Vector<TemaDB> _contiene_tema = new Vector<TemaDB>();

	// Consultar temas
	@SuppressWarnings("unchecked")
	public List<TemaDB> consultar_T(int idSeccion) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<TemaDB> temas = null;
		try {
			temas = TemaDBDAO.queryTemaDB("TemaDB.esta_en='" + idSeccion + "'", null);
			t.commit();

		} catch (PersistentException e1) {
			t.rollback();
		}
		return temas;
	}

	// Consultar temas usuario identificado
	@SuppressWarnings("unchecked")
	public List<TemaDB> consultar_T_UI(int idSeccion) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<TemaDB> temas = null;
		try {
			temas = TemaDBDAO.queryTemaDB("TemaDB.esta_en='" + idSeccion + "'", null);
			t.commit();

		} catch (PersistentException e1) {
			t.rollback();
		}
		return temas;
	}

	// Consultar temas administrador
	@SuppressWarnings("unchecked")
	public List<TemaDB> consultar_T_A(int idSeccion) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<TemaDB> temas = null;
		try {
			temas = TemaDBDAO.queryTemaDB("TemaDB.esta_en='" + idSeccion + "'", null);
			t.commit();

		} catch (PersistentException e1) {
			t.rollback();
		}
		return temas;
	}

	// Consultar temas ocultos
	@SuppressWarnings("unchecked")
	public List<TemaDB> consultar_TO() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<TemaDB> temas = null;
		try {
			temas = TemaDBDAO.queryTemaDB("TemaDB.oculto='1'", null);
			t.commit();

		} catch (PersistentException e1) {
			t.rollback();
		}
		return temas;
	}

	// Crear tema
	public boolean guardar_tema(int idSeccion, int idUsuario, String tituloTema, String subtituloTema)
			throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB nuevoTema = TemaDBDAO.createTemaDB();
			SeccionDB seccion = SeccionDBDAO.loadSeccionDBByORMID(idSeccion);
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			nuevoTema.setOcultado_por(null);
			nuevoTema.setORM_Ocultado_por(null);
			nuevoTema.setCreado_por(usuario);
			nuevoTema.setORM_Creado_por(usuario);
			nuevoTema.setORM_Esta_en(seccion);
			nuevoTema.setEsta_en(seccion);
			nuevoTema.setTema(tituloTema);
			nuevoTema.setDescripcion(subtituloTema);
			nuevoTema.setCantidadLike(0);
			nuevoTema.setEliminado(false);
			nuevoTema.setOculto(false);
			TemaDBDAO.save(nuevoTema);
			t.commit();
			return true;

		} catch (PersistentException e1) {
			t.rollback();

			return false;
		}
	}

	// Eliminar propio tema
	public boolean eliminar_propio_tema(int idTema) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			tema.setEliminado(true);
			TemaDBDAO.save(tema);
			t.commit();
			eliminado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	// Cambiar estado tema
	public void cambiar_estado_tema(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			if (tema.getOculto() == false) {
				ocultar_tema(idTema);
				TemaDBDAO.save(tema);
				t.commit();
			} else {
				mostrar_tema(idTema);
				TemaDBDAO.save(tema);
				t.commit();
			}

		} catch (Exception e) {
			t.rollback();
		}
	}

	// Eliminar tema
	public boolean eliminar_tema(int idTema) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			tema.setEliminado(true);
			TemaDBDAO.save(tema);
			t.commit();
			eliminado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	// Mostrar tema
	public void mostrar_tema(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			tema.setOculto(false);
			TemaDBDAO.save(tema);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Ocultar tema
	public void ocultar_tema(int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			tema.setOculto(true);
			TemaDBDAO.save(tema);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Valorar tema
	public void valorar_tema(int idUsuario, int idTema) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			TemaDB tema = TemaDBDAO.loadTemaDBByORMID(idTema);
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);

			if (usuario.da_megusta_.contains(tema)) {
				usuario.da_megusta_.remove(tema);
				int likes = tema.getCantidadLike();
				likes = likes - 1;
				tema.setCantidadLike(likes);
				Parametros.setLikesTema(likes);
			} else {
				usuario.da_megusta_.add(tema);
				int likes = tema.getCantidadLike();
				likes = likes + 1;
				tema.setCantidadLike(likes);
				Parametros.setLikesTema(likes);
			}
			TemaDBDAO.save(tema);
			Usuario_DBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}