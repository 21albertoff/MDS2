package com.mds.foro;

import java.util.List;

import org.orm.PersistentException;

public class DB_Main implements iUsuario_no_identificado, iCorreo, iElementos_fijos, iUsuario, iUsuario_identificado, iModerador, iUsuario_registrado, iAdministrador {
	public DB_Temas temas = new DB_Temas();
	public DB_Administradores administradores = new DB_Administradores();
	public DB_UsuariosNotificados usuarios_notificados = new DB_UsuariosNotificados();
	public DB_Secciones secciones = new DB_Secciones();
	public DB_Notificaciones notificaciones = new DB_Notificaciones();
	public DB_Mensajes mensajes = new DB_Mensajes();
	public DB_UsuariosRegistrados registrados = new DB_UsuariosRegistrados();

	/**Usuario no identificado**/
	
	//Registrarse
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario, String passwordUsuario, String descripcionUsuario, String fotoUsuario) {
		try {
			return  registrados.registrarse(nombreUsuario, nombreCompleto, correoUsuario, passwordUsuario, descripcionUsuario, fotoUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//Iniciar Sesion
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario) {
		try {
			return  registrados.iniciar_sesion(nombreUsuario, passwordUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	//Recuperar contrasenia
	public boolean recuperarContrasenia(String idUsuario, String correoElectronico) {
		try {
			return  registrados.recuperarContrasenia(idUsuario, correoElectronico);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**Usuario**/
	
	//Consultar secciones fijas
	public List consultar_SF() {
		try {
			return secciones.consultar_SF();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<SeccionDB> consultar_US() {
		try {
			return secciones.consultar_US();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List consultar_T(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List consultar_M(int aIdTema) {
		throw new UnsupportedOperationException();
	}
	
	//Elementos fijos
	
	public List consultar_SD() {
		try {
			return secciones.consultar_SD();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Correo 
	
	public void enviar_Mensaje(int aIdUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}
	
	//Usuario identificado
	
	//Usuario registrado
	
	//Moderador
	
	//Administrador
	
	//Otros metodos
	
	public Usuario_registradoDB get_Correo() {
		throw new UnsupportedOperationException();
	}

	public Usuario_registradoDB get_Usuario_identificado() {
		throw new UnsupportedOperationException();
	}

	public Usuario_registradoDB get_Moderador() {
		throw new UnsupportedOperationException();
	}

	public Usuario_registradoDB get_Usuario_registrado() {
		throw new UnsupportedOperationException();
	}

	public AdministradorDB get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public List consultar_T_UI(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List consultar_M_UI(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public List consultar_MA(int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public List consultar_N(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List consultar_A(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List consultar_MisM(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List consulta_M_UR(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public List consultar_UR() {
		throw new UnsupportedOperationException();
	}

	public List consultar_M_Mo(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public List consultar_MU(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public List consultar_M_A(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public List consultar_T_A(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public List consultar_SF_A() {
		try {
			return secciones.consultar_SF_A();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List consultar_US_A() {
		try {
			return secciones.consultar_US_A();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List consultar_TO() {
		throw new UnsupportedOperationException();
	}

	public List consultar_MO() {
		throw new UnsupportedOperationException();
	}

	public List consultar_UN() {
		throw new UnsupportedOperationException();
	}

	public boolean guardar_tema(int aIdSeccion, String aTituloTema, String aSubtituloTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_propio_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_fotos(int aIdMensaje, String aFoto1, String aFoto2, String aFoto3) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_video(int aIdMensaje, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public boolean agregar_amigo(int aIdUsuario, int aIdAmigo) {
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

	public boolean eliminar_notificacion(int aIdUsuario, int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_contrasenia(int aIdUsuario, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_mi_mensaje(int aIdUsuario, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void Asignar_Desasignar_moderador(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_num_mensajes(int aIdUsuario, int aCantidad) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_estado_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void cerrar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void banear_usuario(int aIdUsuario, int aTiempo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_seccion(int idSeccion) {
		try {
			return  secciones.eliminar_seccion(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void quitar_seccion_fija(int idSeccion) {
		try {
			secciones.quitar_seccion_fija(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean crear_seccion(String tituloSeccion, String icono, boolean fijarSeccion) {
		try {
			return  secciones.crear_seccion(tituloSeccion, icono, fijarSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void quitar_moderador(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void mostrar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_mensaje(int aIdUsuario, int aIdTema, String aMensaje, String aFotos, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public void valorar_tema(int aIdUsuario, int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void valorar_mensaje(int aIdUsuario, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public boolean citar_tema(String aMensaje, String aFotos, String aVideo, int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, int aIdMensaje) {
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

	public boolean eliminar_perfil(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void notificar(int aIdUsuario, String aMotivo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_reporte(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void ocultar_tema(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public void ocultar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void reportar_mensaje(int aIdUsuario, int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public void mostrar_mensaje(int aIdMensaje) {
		throw new UnsupportedOperationException();
	}

	public List consultar_Mo() {
		throw new UnsupportedOperationException();
	}
}