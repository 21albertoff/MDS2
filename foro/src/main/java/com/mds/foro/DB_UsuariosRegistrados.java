package com.mds.foro;

import java.util.*;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mds.foro.Usuario_registradoDB;

public class DB_UsuariosRegistrados {

	// Declaraciones
	public DB_Main _bd_main_usuarios_registrados;
	public Vector<Usuario_registradoDB> _contiene_usuario_registrado = new Vector<Usuario_registradoDB>();

	// Consultar usuarios notificados
	@SuppressWarnings("unchecked")
	public List<Usuario_registradoDB> consultar_UN() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_registradoDB> notificados = null;
		try {
			notificados = Usuario_registradoDBDAO.queryUsuario_registradoDB("Usuario_registradoDB.motivo!=''", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return notificados;
	}

	// Notificar
	public void notificar(int idUsuario, String motivo) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_registradoDB usuarioNotificado = Usuario_registradoDBDAO.loadUsuario_registradoDBByORMID(idUsuario);
			usuarioNotificado.setMotivo(motivo);
			Usuario_registradoDBDAO.save(usuarioNotificado);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
	}

	// Registrarse
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario,
			String passwordUsuario, String descripcionUsuario, String fotoUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_registradoDB usuarioNotificado = Usuario_registradoDBDAO.createUsuario_registradoDB();
			usuarioNotificado.setMotivo("");
			usuarioNotificado.setNombreUsuario(nombreUsuario);
			usuarioNotificado.setNombreCompleto(nombreCompleto);
			usuarioNotificado.setCorreo(correoUsuario);
			usuarioNotificado.setPassword(passwordUsuario);
			usuarioNotificado.setDescripcion(descripcionUsuario);
			usuarioNotificado.setFoto(fotoUsuario);
			usuarioNotificado.setRecibir_notificacion(true);
			usuarioNotificado.setRecibir_por_correo(true);
			usuarioNotificado.setPerfil_oculto(false);
			usuarioNotificado.setPermiso(1);
			usuarioNotificado.setBaneado(false);
			usuarioNotificado.setBaneado_por(null);
			usuarioNotificado.setConvertido_por(null);
			Usuario_DBDAO.save(usuarioNotificado);
			t.commit();
			return true;

		} catch (PersistentException e1) {
			t.rollback();
		}

		return false;
	}

	// Inciar sesion
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario) throws PersistentException {
		boolean correcto = false;

		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		;

		try {
			Usuario_DB cargarUsuarios = Usuario_DBDAO.loadUsuario_DBByQuery("Usuario_DB.nombreUsuario='" + nombreUsuario
					+ "' and Usuario_DB.password='" + passwordUsuario + "'", null);
			for (Object usr : Usuario_DBDAO.queryUsuario_DB(null, null)) {
				Usuario_DB usuario = (Usuario_DB) usr;
				if (usuario.getNombreUsuario().equals(cargarUsuarios.getNombreUsuario())) {
					Parametros.setIdUsuario(usuario.getIdUsuario());
					Parametros.setTipoUsuario(usuario.getPermiso());
					Parametros.setNombreUsuario(usuario.getNombreUsuario());
					Parametros.setNombreCompleto(usuario.getNombreCompleto());
					Parametros.setFotoPerfil(usuario.getFoto());
					Parametros.setDescripcionUsuario(usuario.getDescripcion());
					Parametros.setActivar_Desactivar_Notificacion(usuario.getRecibir_notificacion());
					Parametros.setPerfilOculto(usuario.getPerfil_oculto());
					int idUsuario = usuario.getIdUsuario();
					Usuario_registradoDB ur = Usuario_registradoDBDAO.loadUsuario_registradoDBByORMID(idUsuario);
					Parametros.setBaneado(ur.getBaneado());
					correcto = true;
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return correcto;
	}

	// Recuperar contrasenia
	public boolean recuperarContrasenia(String nombreUsuario, String correoElectronico) throws PersistentException {
		boolean correcto = false;

		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		;

		try {
			Usuario_DB cargarUsuarios = Usuario_DBDAO.loadUsuario_DBByQuery("Usuario_DB.nombreUsuario='" + nombreUsuario
					+ "' and Usuario_DB.correo='" + correoElectronico + "'", null);
			for (Object usr : Usuario_DBDAO.queryUsuario_DB(null, null)) {
				Usuario_DB usuario = (Usuario_DB) usr;
				if (usuario.getNombreUsuario().equals(cargarUsuarios.getNombreUsuario())) {
					Parametros.setNombreUsuario(usuario.getNombreUsuario());
					Parametros.setPasswordUsuario(usuario.getPassword());
					Parametros.setCorreoUsuario(usuario.getCorreo());
					correcto = true;
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return correcto;
	}

	// Consultar amigos
	public List<Usuario_DB> consultar_A(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_DB> amigos = null;
		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			amigos = Arrays.asList(usuario.amigo_de.toArray());
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return amigos;
	}

	// Consultar usuarios registrados
	@SuppressWarnings("unchecked")
	public List<Usuario_registradoDB> consultar_UR() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_registradoDB> reportados = null;
		try {
			reportados = Usuario_registradoDBDAO.queryUsuario_registradoDB("Usuario_registradoDB.motivo!=''", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return reportados;
	}

	// Eliminar amigo perfil
	public boolean eliminar_amigoP(int idUsuario, int idAmigo) throws PersistentException {
		return eliminar_amigo(idUsuario, idAmigo);
	}

	// Eliminar amigo
	public boolean eliminar_amigo(int idUsuario, int idAmigo) throws PersistentException {
		boolean eliminado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			Usuario_DB amigo = Usuario_DBDAO.loadUsuario_DBByORMID(idAmigo);
			usuario.amigo.remove(amigo);
			amigo.amigo.remove(usuario);
			amigo.amigo_de.remove(usuario);
			usuario.amigo_de.remove(amigo);
			Usuario_DBDAO.save(usuario);
			Usuario_DBDAO.save(amigo);
			t.commit();
			eliminado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return eliminado;
	}

	// Modificar foto
	public boolean modificar_foto(int idUsuario, String foto) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setFoto(foto);
			Usuario_DBDAO.save(usuario);
			t.commit();
			modificado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
	}

	// Modificar descripcion
	public boolean modificar_descripcion(int idUsuario, String descripcion) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setDescripcion(descripcion);
			Usuario_DBDAO.save(usuario);
			t.commit();
			modificado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
	}

	// Agregar amigo
	public boolean agregar_amigo(int idUsuario, int idAmigo) throws PersistentException {
		boolean amiguitos = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			Usuario_DB amigo = Usuario_DBDAO.loadUsuario_DBByORMID(idAmigo);
			usuario.amigo.add(amigo);
			amigo.amigo.add(usuario);
			amigo.amigo_de.add(usuario);
			usuario.amigo_de.add(amigo);
			Usuario_DBDAO.save(usuario);
			Usuario_DBDAO.save(amigo);
			t.commit();
			amiguitos = true;
		} catch (Exception e) {
			t.rollback();
		}
		return amiguitos;
	}

	// Cambiar password
	public boolean cambiar_contrasenia(int idUsuario, String contrasenia) throws PersistentException {
		boolean modificado = false;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setPassword(contrasenia);
			Usuario_DBDAO.save(usuario);
			t.commit();
			modificado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
	}

	// Asignar deasignar moderador
	public void Asignar_Desasignar_moderador(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if (usuario.getPermiso() == 2)
				usuario.setPermiso(1);
			if (usuario.getPermiso() == 1)
				usuario.setPermiso(2);
			Usuario_DBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Cambiar numero de mensajes
	public void cambiar_num_mensajes(int idUsuario, int cantidad) {
		throw new UnsupportedOperationException();
	}

	// Banear usuario
	public void banear_usuario(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_registradoDB usuario = Usuario_registradoDBDAO.loadUsuario_registradoDBByORMID(idUsuario);
			usuario.setBaneado(true);
			usuario.setMotivo("");
			Usuario_registradoDBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Quitar moderador
	public void quitar_moderador(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if (usuario.getPermiso() == 2)
				usuario.setPermiso(1);
			Usuario_DBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Eliminar perfil
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

	// Modificar nombre
	public boolean modificar_nombre(int idUsuario, String newNombreUsuario) throws PersistentException {
		boolean modificado = true;
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			usuario.setNombreUsuario(newNombreUsuario);
			Usuario_DBDAO.save(usuario);
			t.commit();
			modificado = true;
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
	}

	// Eliminar reporte
	public void eliminar_reporte(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_registradoDB reporte = Usuario_registradoDBDAO.loadUsuario_registradoDBByORMID(idUsuario);
			reporte.reporta.clear();
			reporte.setMotivo("");
			Usuario_registradoDBDAO.save(reporte);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Activar o desactivar notificaciones
	public void Activar_Desactivar_notificaciones(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if (usuario.getRecibir_notificacion())
				usuario.setRecibir_notificacion(false);
			if (!usuario.getRecibir_notificacion())
				usuario.setRecibir_notificacion(true);
			Usuario_DBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Activar o desactivar notificaciones correo
	public void Activar_Desactivar_por_correo(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if (usuario.getRecibir_por_correo())
				usuario.setRecibir_por_correo(false);
			if (!usuario.getRecibir_por_correo())
				usuario.setRecibir_por_correo(true);
			Usuario_DBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Activar o desactivar perfil oculto
	public void perfil_oculto(int idUsuario) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();

		try {
			Usuario_DB usuario = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuario);
			if (usuario.getPerfil_oculto())
				usuario.setPerfil_oculto(false);
			if (!usuario.getPerfil_oculto())
				usuario.setPerfil_oculto(true);
			Usuario_DBDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	// Consultar moderadores
	@SuppressWarnings("unchecked")
	public List<Usuario_DB> consultar_Moderador() throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		List<Usuario_DB> moderadores = null;
		try {
			moderadores = Usuario_DBDAO.queryUsuario_DB("Usuario_DB.permiso='" + 2 + "'", null);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return moderadores;
	}
	
	//Consultar un amigo
	public Usuario_DB consultar_Amigo(int idUsuarioAmigo) throws PersistentException {
		PersistentTransaction t = ProyectoFinalPersistentManager.instance().getSession().beginTransaction();
		Usuario_DB amigo = null;
		try {
			amigo = Usuario_DBDAO.loadUsuario_DBByORMID(idUsuarioAmigo);
			t.commit();
		} catch (PersistentException e1) {
			t.rollback();
		}
		return amigo;
	}
}