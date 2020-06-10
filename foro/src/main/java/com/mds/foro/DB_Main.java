package com.mds.foro;

import java.util.List;

public class DB_Main implements iUsuario_no_identificado, iElementos_fijos, iUsuario, iUsuario_identificado, iModerador,
		iUsuario_registrado, iAdministrador {

	// Declaraciones
	public DB_Temas temas = new DB_Temas();
	public DB_Administradores administradores = new DB_Administradores();
	public DB_Secciones secciones = new DB_Secciones();
	public DB_Notificaciones notificaciones = new DB_Notificaciones();
	public DB_Mensajes mensajes = new DB_Mensajes();
	public DB_UsuariosRegistrados registrados = new DB_UsuariosRegistrados();

	/** Usuario no identificado **/

	// Registrarse
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario,
			String passwordUsuario, String descripcionUsuario, String fotoUsuario) {
		try {
			return registrados.registrarse(nombreUsuario, nombreCompleto, correoUsuario, passwordUsuario,
					descripcionUsuario, fotoUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Iniciar Sesion
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario) {
		try {
			return registrados.iniciar_sesion(nombreUsuario, passwordUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Recuperar contrasenia
	public boolean recuperarContrasenia(String nombreUsuario, String correoElectronico) {
		try {
			return registrados.recuperarContrasenia(nombreUsuario, correoElectronico);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/** Usuario **/

	// Consultar secciones fijas
	public List<SeccionDB> consultar_SF() {
		try {
			return secciones.consultar_SF();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar ultimas secciones
	public List<SeccionDB> consultar_US() {
		try {
			return secciones.consultar_US();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar temas
	public List<TemaDB> consultar_T(int idSeccion) {
		try {
			return temas.consultar_T(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar mensajes
	public List<MensajeDB> consultar_M(int idTema) {
		try {
			return mensajes.consultar_M(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/** Elementos fijos **/

	// Consultar secciones destacadas
	public List<SeccionDB> consultar_SD() {
		try {
			return secciones.consultar_SD();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/** Usuario identificado **/

	// Crear tema
	public boolean guardar_tema(int idSeccion, int idUsuario, String tituloTema, String subtituloTema) {
		try {
			return temas.guardar_tema(idSeccion, idUsuario, tituloTema, subtituloTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Consultar tema usuario identificado
	public List<TemaDB> consultar_T_UI(int idSeccion) {
		try {
			return temas.consultar_T_UI(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Eliminar propio tema
	public boolean eliminar_propio_tema(int idTema) {
		try {
			return temas.eliminar_propio_tema(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Crear mensaje
	public boolean crear_mensaje(int idTema, int idUsuario, String mensaje, String foto1, String foto2, String foto3,
			String video) {
		try {
			return mensajes.crear_mensaje(idTema, idUsuario, mensaje, foto1, foto2, foto3, video);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Valorar tema
	public void valorar_tema(int idUsuario, int idTema) {
		try {
			temas.valorar_tema(idUsuario, idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Citar mensaje
	public boolean citar_mensaje(int idTema, int idUsuario, int idCitado, String mensaje, String foto1, String foto2,
			String foto3, String video) {
		try {
			return mensajes.citar_mensaje(idTema, idUsuario, idCitado, mensaje, foto1, foto2, foto3, video);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Eliminar propio mensaje
	public boolean eliminar_mi_mensaje(int idMensaje) {
		try {
			return mensajes.eliminar_mi_mensaje(idMensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Valorar mensaje
	public void valorar_mensaje(int idUsuario, int idMensaje) {
		try {
			mensajes.valorar_mensaje(idUsuario, idMensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar mis mensajes
	public List<MensajeDB> consultar_MisM(int idUsuario) {
		try {
			return mensajes.consultar_MisM(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar amigos
	public List<Usuario_DB> consultar_A(int idUsuario) {
		try {
			return registrados.consultar_A(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Eliminar amigo perfil
	public boolean eliminar_amigoP(int idUsuario, int idAmigo) {
		try {
			return registrados.eliminar_amigoP(idUsuario, idAmigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Eliminar amigo
	public boolean eliminar_amigo(int idUsuario, int idAmigo) {
		try {
			return registrados.eliminar_amigo(idUsuario, idAmigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Modificar foto
	public boolean modificar_foto(int idUsuario, String foto) {
		try {
			return registrados.modificar_foto(idUsuario, foto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Modificar descripcion
	public boolean modificar_descripcion(int idUsuario, String descripcion) {
		try {
			return registrados.modificar_descripcion(idUsuario, descripcion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Activar o desactivar notificaciones
	public void Activar_Desactivar_notificaciones(int idUsuario) {
		try {
			registrados.Activar_Desactivar_notificaciones(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Activar o desactivar notificaciones por correo
	public void Activar_Desactivar_por_correo(int idUsuario) {
		try {
			registrados.Activar_Desactivar_por_correo(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Perfil oculto
	public void perfil_oculto(int idUsuario) {
		try {
			registrados.perfil_oculto(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar mensajes usuario identificado
	public List<MensajeDB> consultar_M_UI(int idTema) {
		try {
			return mensajes.consultar_M_UI(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Cambiar la contrasenia
	public boolean cambiar_contrasenia(int idUsuario, String contrasenia) {
		try {
			return registrados.cambiar_contrasenia(idUsuario, contrasenia);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Consultar un amigo
	public Usuario_DB consultar_Amigo(int idUsuarioAmigo) {
		try {
			return registrados.consultar_Amigo(idUsuarioAmigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar notificaciones
	public List<NotificacionDB> consultar_N(int idUsuario) {
		try {
			return notificaciones.consultar_N(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Eliminar Notificacion
	public boolean eliminar_notificacion(int idUsuario, int idNotificacion) {
		try {
			return notificaciones.eliminar_notificacion(idUsuario, idNotificacion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Agregar amigo
	public boolean agregar_amigo(int idUsuario, int idAmigo) {
		try {
			return registrados.agregar_amigo(idUsuario, idAmigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void enviar_solicitud(int idUsuario, int idUsuarioAmigo) {
		try {
			notificaciones.crear_notificacion(idUsuario, idUsuarioAmigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Usuario registrado **/

	// Reportar mensaje
	public void reportar_mensaje(int idUsuario, int idUsuarior, int idMensaje) {
		try {
			mensajes.reportar_mensaje(idUsuario, idUsuarior, idMensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Modificar nombre
	public boolean modificar_nombre(int idUsuario, String newNombreUsuario) {
		try {
			return registrados.modificar_nombre(idUsuario, newNombreUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Eliminar perfil
	public boolean eliminar_perfil(int idUsuario) {
		try {
			return registrados.eliminar_perfil(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/** Moderador **/

	// Consultar mensajes moderador
	public List<MensajeDB> consultar_M_Mo(int idTema) {
		try {
			return mensajes.consultar_M_Mo(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Notificar usuario
	public void notificar(int idUsuario, String motivo) {
		try {
			registrados.notificar(idUsuario, motivo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Ocultar mensaje
	public void ocultar_mensaje(int idMensaje) {
		try {
			mensajes.ocultar_mensaje(idMensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Ocultar tema
	public void ocultar_tema(int idTema) {
		try {
			temas.ocultar_tema(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar usuarios reportados
	public List<Usuario_registradoDB> consultar_UR() {
		try {
			return registrados.consultar_UR();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Eliminar reporte
	public void eliminar_reporte(int idUsuario) {
		try {
			registrados.eliminar_reporte(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Administrador **/

	// Consultar secciones fijas administrador
	public List<SeccionDB> consultar_SF_A() {
		try {
			return secciones.consultar_SF_A();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar ultimas secciones administrador
	public List<SeccionDB> consultar_US_A() {
		try {
			return secciones.consultar_US_A();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Quitar seccion fija
	public void quitar_seccion_fija(int idSeccion) {
		try {
			secciones.quitar_seccion_fija(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Crear seccion
	public boolean crear_seccion(String tituloSeccion, String icono, boolean fijarSeccion) {
		try {
			return secciones.crear_seccion(tituloSeccion, icono, fijarSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Eliminar seccion
	public boolean eliminar_seccion(int idSeccion) {
		try {
			return secciones.eliminar_seccion(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Consultar temas administrador
	public List<TemaDB> consultar_T_A(int idSeccion) {
		try {
			return temas.consultar_T_A(idSeccion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Eliminar tema administrador
	public boolean eliminar_tema(int idTema) {
		try {
			return temas.eliminar_tema(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Eliminar mensaje administrador
	public boolean eliminar_mensaje(int idMensaje) {
		try {
			return mensajes.eliminar_mensaje(idMensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Consultar mensajes administrador
	public List<MensajeDB> consultar_M_A(int idTema) {
		try {
			return mensajes.consultar_M_A(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Banear usuario
	public void banear_usuario(int idUsuario) {
		try {
			registrados.banear_usuario(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar mensajes administrador
	public List<MensajeDB> consultar_MA(int idAmigo) {
		try {
			return mensajes.consultar_MA(idAmigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Consultar moderadores
	public List<Usuario_DB> consultar_Mo() {
		try {
			return registrados.consultar_Moderador();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Quitar moderador
	public void quitar_moderador(int idUsuario) {
		try {
			registrados.quitar_moderador(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar temas ocultos
	public List<TemaDB> consultar_TO() {
		try {
			return temas.consultar_TO();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Mostrar tema oculto
	public void mostrar_tema(int idTema) {
		try {
			temas.mostrar_tema(idTema);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar mensajes ocultos
	public List<MensajeDB> consultar_MO() {
		try {
			return mensajes.consultar_MO();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Mostrar mensaje oculto
	public void mostrar_mensaje(int idMensaje) {
		try {
			mensajes.mostrar_mensaje(idMensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Consultar usuarios notificados
	public List<Usuario_registradoDB> consultar_UN() {
		try {
			return registrados.consultar_UN();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Cambiar estado moderador
	public void Asignar_Desasignar_moderador(int idUsuario) {
		try {
			registrados.Asignar_Desasignar_moderador(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Otros metodos no utilizados **/

//	public Usuario_registradoDB get_Correo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public Usuario_registradoDB get_Usuario_identificado() {
//		throw new UnsupportedOperationException();
//	}
//
//	public Usuario_registradoDB get_Moderador() {
//		throw new UnsupportedOperationException();
//	}
//
//	public Usuario_registradoDB get_Usuario_registrado() {
//		throw new UnsupportedOperationException();
//	}
//
//	public AdministradorDB get_Administrador() {
//		throw new UnsupportedOperationException();
//	}

}