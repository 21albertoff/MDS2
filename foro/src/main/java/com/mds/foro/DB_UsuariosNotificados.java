package com.mds.foro;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.Usuario_notificadosDB;

public class DB_UsuariosNotificados {
	public DB_Main _bd_main_usuarios_notificados;
	public Vector<Usuario_notificadosDB> _contiene_usuario_notificados = new Vector<Usuario_notificadosDB>();

	@SuppressWarnings("unchecked")
	public List<Usuario_notificadosDB> consultar_UN() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_notificadosDB> notificados = null;
		try {			
			notificados = Usuario_notificadosDBDAO.queryUsuario_notificadosDB(null, null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return notificados;
	}

	public void notificar(int idUsuario, String motivo) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_notificadosDB usuarioNotificado = Usuario_notificadosDBDAO.loadUsuario_notificadosDBByORMID(idUsuario);
			usuarioNotificado.setMotivo(motivo);
			Usuario_notificadosDBDAO.save(usuarioNotificado);
			t.commit();
			} catch (PersistentException e1) {
				t.rollback();
			}
	}
}