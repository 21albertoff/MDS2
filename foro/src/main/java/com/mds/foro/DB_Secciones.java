package com.mds.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.SeccionDB;

@SuppressWarnings("unchecked")
public class DB_Secciones {
	public DB_Main _bd_main_secciones;
	public Vector<SeccionDB> _contiene_seccion = new Vector<SeccionDB>();

	//Consultar secciones destacadas
	public List<SeccionDB> consultar_SD() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<SeccionDB> seccion = null;
		try {
			seccion = SeccionDBDAO.querySeccionDB(null, null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return seccion;
	}

	//Consultar secciones fijas
	public List<SeccionDB> consultar_SF() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<SeccionDB> seccion = null;
		try {
			seccion = SeccionDBDAO.querySeccionDB(null, null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return seccion;
	}

	//Consultar ultimas secciones
	public List<SeccionDB> consultar_US() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<SeccionDB> seccion = null;
		try {
			seccion = SeccionDBDAO.querySeccionDB(null, null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return seccion;
	}

	//Consultar secciones Fijas Administrador
	public List consultar_SF_A() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<SeccionDB> seccion = null;
		try {
			seccion = SeccionDBDAO.querySeccionDB(null, null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return seccion;
	}

	//Consultar ultimas secciones Administrador
	public List consultar_US_A() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<SeccionDB> seccion = null;
		try {
			seccion = SeccionDBDAO.querySeccionDB(null, null);
			t.commit();
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return seccion;
	}

	//Eliminar seccion
	public boolean eliminar_seccion(int idSeccion) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			SeccionDB seccion = SeccionDBDAO.loadSeccionDBByORMID(idSeccion);
			seccion.setEliminado(true);
			SeccionDBDAO.save(seccion);
			t.commit();
			eliminado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	//QuitarSeccionFija
	public void quitar_seccion_fija(int idSeccion) throws PersistentException  {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			SeccionDB seccion = SeccionDBDAO.loadSeccionDBByORMID(idSeccion);
			seccion.setSeccionFija(false);
			SeccionDBDAO.save(seccion);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	//Crear seccion
	public boolean crear_seccion(String tituloSeccion, String icono, boolean fijarSeccion) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			SeccionDB nuevaSeccion = SeccionDBDAO.createSeccionDB();
			nuevaSeccion.setSeccion(tituloSeccion);
			nuevaSeccion.setIcono(icono);
			nuevaSeccion.setSeccionFija(fijarSeccion);
			nuevaSeccion.setEliminado(false);
			nuevaSeccion.setCreada_por(null);
			SeccionDBDAO.save(nuevaSeccion);
			t.commit();
			return true;
			
	} catch (PersistentException e1) {
		t.rollback();
	}

	return false;
	}
}