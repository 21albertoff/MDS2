package com.mds.foro;

import java.util.*;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.Usuario_registradoDB;

public class DB_UsuariosRegistrados {
	public DB_Main _bd_main_usuarios_registrados;
	public Vector<Usuario_registradoDB> _contiene_usuario_registrado = new Vector<Usuario_registradoDB>();

	//Registrarse
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario, String passwordUsuario, String descripcionUsuario, String fotoUsuario) throws PersistentException{
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
			try {	
				Usuario_DB nuevoUsuario = Usuario_DBDAO.createUsuario_DB();
				nuevoUsuario.setNombreUsuario(nombreUsuario);
				nuevoUsuario.setNombreCompleto(nombreCompleto);
				nuevoUsuario.setCorreo(correoUsuario);
				nuevoUsuario.setPassword(passwordUsuario);
				nuevoUsuario.setDescripcion(descripcionUsuario);
				nuevoUsuario.setFoto(fotoUsuario);
				nuevoUsuario.setRecibir_notificacion(true);
				nuevoUsuario.setRecibir_por_correo(true);
				nuevoUsuario.setPerfil_oculto(false);
				nuevoUsuario.setPermiso(1);
				nuevoUsuario.setBaneado(false);
				nuevoUsuario.setBaneado_por(null);
				nuevoUsuario.setConvertido_por(null);
				Usuario_DBDAO.save(nuevoUsuario);
				t.commit();
				return true;
				
		} catch (PersistentException e1) {
			t.rollback();
		}
	
		return false;
	}

	//Inciar sesion
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario) throws PersistentException{
		boolean correcto = false;
		
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();;

		try {
			Usuario_DB cargarUsuarios = Usuario_DBDAO.loadUsuario_DBByQuery("Usuario_DB.nombreUsuario='"+nombreUsuario+"' and Usuario_DB.password='"+passwordUsuario+"'",null);
			for(Object usr: Usuario_DBDAO.queryUsuario_DB(null, null)) {
				Usuario_DB usuario = (Usuario_DB) usr;
				if(usuario.getNombreUsuario().equals(cargarUsuarios.getNombreUsuario())) {
						Parametros.setIdUsuario(usuario.getIdUsuario());
						Parametros.setTipoUsuario(usuario.getPermiso());
						Parametros.setBaneado(usuario.getBaneado());
						correcto = true;
				} 
			}
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		return correcto;
	}

	//Recuperar contrasenia
	public boolean recuperarContrasenia(String nombreUsuario, String correoElectronico) throws PersistentException {
        boolean correcto = false;
		
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();;

		try {
			Usuario_DB cargarUsuarios = Usuario_DBDAO.loadUsuario_DBByQuery("Usuario_DB.nombreUsuario='"+nombreUsuario+"' and Usuario_DB.correo='"+correoElectronico+"'",null);
			for(Object usr: Usuario_DBDAO.queryUsuario_DB(null, null)) {
				Usuario_DB usuario = (Usuario_DB) usr;
				if(usuario.getNombreUsuario().equals(cargarUsuarios.getNombreUsuario())) {
					Parametros.setNombreUsuario(usuario.getNombreUsuario());
					Parametros.setPasswordUsuario(usuario.getPassword());
					Parametros.setCorreoUsuario(usuario.getCorreo());
					correcto = true;
				} 
			}
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		return correcto;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario_DB> consultar_A(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_DB> amigos = null;
		try {			
			amigos = Usuario_DBDAO.queryUsuario_DB("Usuario_DB.amigo_de='"+idUsuario+"'", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return amigos;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario_registradoDB> consultar_UR() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_registradoDB> reportados = null;
		try {			
			reportados = Usuario_registradoDBDAO.queryUsuario_registradoDB("Usuario_DB.reporta!=''", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return reportados;
	}

	public boolean eliminar_amigoP(int idUsuario, int idAmigo) throws PersistentException {
		return eliminar_amigo(idUsuario, idAmigo);
	}

	public boolean eliminar_amigo(int idUsuario, int idAmigo) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			Usuario_DB amigo = Usuario_DBDAO.loadUsuario_DBByORMID(idAmigo);
			usuario.amigo.remove(amigo);
			amigo.amigo_de.remove(usuario);
			t.commit();
			eliminado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	public boolean modificar_foto(int idUsuario, String foto) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setFoto(foto);
			t.commit();
			modificado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return modificado;
	}

	public boolean modificar_descripcion(int idUsuario, String descripcion) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setDescripcion(descripcion);
			t.commit();
			modificado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return modificado;
	}

	public boolean agregar_amigo(int idUsuario, int idAmigo) throws PersistentException {
		boolean amiguitos = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			Usuario_DB amigo = Usuario_DBDAO.loadUsuario_DBByORMID(idAmigo);
			usuario.amigo.add(amigo);
			amigo.amigo_de.add(usuario);
			t.commit();
			amiguitos=true;
		}catch(Exception e) {
			t.rollback();
		}
		return amiguitos;
	}

	public boolean cambiar_contrasenia(int idUsuario, String contrasenia) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setPassword(contrasenia);
			t.commit();
			modificado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return modificado;
	}

	public void Asignar_Desasignar_moderador(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if(usuario.getPermiso() == 2) usuario.setPermiso(1);
			if(usuario.getPermiso() == 1) usuario.setPermiso(2);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public void cambiar_num_mensajes(int idUsuario, int cantidad) {
		throw new UnsupportedOperationException();
	}

	public void banear_usuario(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setBaneado(true);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public void quitar_moderador(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if(usuario.getPermiso() == 2) usuario.setPermiso(1);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public boolean eliminar_perfil(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {	
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			Usuario_DBDAO.delete(usuario);
			Usuario_DBDAO.save(usuario);
			t.commit();
			return true;
			
		} catch (PersistentException e1) {
			t.rollback();
		}
		return false;
	}

	public boolean modificar_nombre(int idUsuario, String newNombreUsuario) throws PersistentException {
		boolean modificado = true;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setNombreUsuario(newNombreUsuario);
			t.commit();
			modificado=true;
		}catch(Exception e) {
			t.rollback();
		}
		return modificado;
	}

	public void eliminar_reporte(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_registradoDB reporte = Usuario_registradoDBDAO.loadUsuario_registradoDBByORMID(idUsuario);
			reporte.reporta.remove(reporte);
			Usuario_registradoDBDAO.save(reporte);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public void Activar_Desactivar_notificaciones(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if(usuario.getRecibir_notificacion()) usuario.setRecibir_notificacion(false);
			if(!usuario.getRecibir_notificacion()) usuario.setRecibir_notificacion(true);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public void Activar_Desactivar_por_correo(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if(usuario.getRecibir_por_correo()) usuario.setRecibir_por_correo(false);
			if(!usuario.getRecibir_por_correo()) usuario.setRecibir_por_correo(true);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	public void perfil_oculto(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if(usuario.getPerfil_oculto()) usuario.setPerfil_oculto(false);
			if(!usuario.getPerfil_oculto()) usuario.setPerfil_oculto(true);
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Usuario_DB> consultar_Moderador() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_DB> moderadores = null;
		try {			
			moderadores = Usuario_DBDAO.queryUsuario_DB("Usuario_DB.permiso='"+2+"'", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return moderadores;
	}
}