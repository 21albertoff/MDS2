package com.mds.foro;

import java.util.Vector;
import com.mds.foro.Usuario_registradoDB;

public class DB_UsuariosRegistrados {
	public DB_Main _bd_main_usuarios_registrados;
	public Vector<Usuario_registradoDB> _contiene_usuario_registrado = new Vector<Usuario_registradoDB>();

	public boolean registrarse(String aNombreUsuario, String aNombreCompleto, String aCorreo, String aContrasenia, String aDescripcion, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public boolean iniciar_sesion(String aNombreUsuario, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean recuperarContrasenia(String aCorreoElectronico) {
		throw new UnsupportedOperationException();
	}

	public Amigo[] consultar_A() {
		throw new UnsupportedOperationException();
	}

	public Usuario_reportado[] consultar_UR() {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_amigoP(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_amigo(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_foto(String aFoto) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_descripcion(String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_amigo(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_contrasenia(String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void Asignar_Desasignar_moderador() {
		throw new UnsupportedOperationException();
	}

	public void cambiar_num_mensajes(int aCantidad) {
		throw new UnsupportedOperationException();
	}

	public void banear_usuario(String aTiempo) {
		throw new UnsupportedOperationException();
	}

	public void quitar_moderador(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_perfil(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_nombre(String aNombreUsuario, String aNewNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_reporte(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Activar_Desactivar_notificaciones() {
		throw new UnsupportedOperationException();
	}

	public void Activar_Desactivar_por_correo() {
		throw new UnsupportedOperationException();
	}

	public void perfil_oculto() {
		throw new UnsupportedOperationException();
	}

	public ModeradorE[] consultar_Moderador() {
		throw new UnsupportedOperationException();
	}
}