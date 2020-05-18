package com.mds.foro;

import java.util.*;
import java.io.*;
import java.time.*;

import com.mds.foro.Usuario_registradoDB;

public class DB_UsuariosRegistrados {
	public DB_Main _bd_main_usuarios_registrados;
	public Vector<Usuario_registradoDB> _contiene_usuario_registrado = new Vector<Usuario_registradoDB>();

	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario, String passwordUsuario, String descripcionUsuario, String fotoUsuario) {
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
				Usuario_DBDAO.save(nuevoUsuario);
				t.commit();
				return true;
				
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			t.rollback();
		}
	
		return false;
	}

	public boolean iniciar_sesion(String aNombreUsuario, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean recuperarContrasenia(int aIdUsuario, String aCorreoElectronico) {
		throw new UnsupportedOperationException();
	}

	public Amigo[] consultar_A(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_reportado[] consultar_UR() {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_amigoP(int aIdUsuario, int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_amigo(int aIdUsuario, int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_foto(int aIdUsuario, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_descripcion(int aIdUsuario, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_amigo(int aIdUsuario, int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_contrasenia(int aIdUsuario, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void Asignar_Desasignar_moderador(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_num_mensajes(int aIdUsuario, int aCantidad) {
		throw new UnsupportedOperationException();
	}

	public void banear_usuario(int aIdUsuario, int aTiempo) {
		throw new UnsupportedOperationException();
	}

	public void quitar_moderador(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_perfil(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_reporte(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Activar_Desactivar_notificaciones(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Activar_Desactivar_por_correo(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void perfil_oculto(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public ModeradorE[] consultar_Moderador() {
		throw new UnsupportedOperationException();
	}
}