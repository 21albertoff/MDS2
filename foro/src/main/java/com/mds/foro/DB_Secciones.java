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

	public List consultar_SF_A() {
		throw new UnsupportedOperationException();
	}

	public List consultar_US_A() {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_seccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void quitar_seccion_fija(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_seccion(String aTituloSeccion, String aIcono, boolean aFijarSeccion) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			SeccionDB nuevaSeccion = SeccionDBDAO.createSeccionDB();
			nuevaSeccion.setSeccion(aTituloSeccion);
			nuevaSeccion.setIcono(aIcono);
			nuevaSeccion.setSeccionFija(aFijarSeccion);
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