package com.mds.foro;

import java.io.Serializable;
import org.orm.PersistentException;

public class DB_Main implements iUsuario_no_identificado, iCorreo, iElementos_fijos, iUsuario, iUsuario_identificado, iModerador, iUsuario_registrado, iAdministrador {
	public DB_Temas temas = new DB_Temas();
	public DB_Administradores administradores = new DB_Administradores();
	public DB_UsuariosNotificados usuarios_notificados = new DB_UsuariosNotificados();
	public DB_Secciones secciones = new DB_Secciones();
	public DB_Notificaciones notificaciones = new DB_Notificaciones();
	public DB_Mensajes mensajes = new DB_Mensajes();
	public DB_UsuariosRegistrados registrados = new DB_UsuariosRegistrados();

	//Usuario no identificado 
	
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario, String passwordUsuario, String descripcionUsuario, String fotoUsuario) {
		try {
			return  registrados.registrarse(nombreUsuario, nombreCompleto, correoUsuario, passwordUsuario, descripcionUsuario, fotoUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario) {
		try {
			return  registrados.iniciar_sesion(nombreUsuario, passwordUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean recuperarContrasenia(int aIdUsuario, String aCorreoElectronico) {
		throw new UnsupportedOperationException();
	}

	//Usuario
	
	public Seccion_fija[] consultar_SF() {
		throw new UnsupportedOperationException();
	}

	public Ultima_seccion[] consultar_US() {
		throw new UnsupportedOperationException();
	}
	
	public Tema[] consultar_T(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] consultar_M(int aIdTema) {
		throw new UnsupportedOperationException();
	}
	
	//Elementos fijos
	
	public Seccion_destacada[] consultar_SD() {
		throw new UnsupportedOperationException();
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

	public Tema__Usuario_identificado_[] consultar_T_UI(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Usuario_identificado_[] consultar_M_UI(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_amigo[] consultar_MA(int aIdAmigo) {
		throw new UnsupportedOperationException();
	}

	public Notificacion[] consultar_N(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Amigo[] consultar_A(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mi_mensaje[] consultar_MisM(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_no_propietario__Usuario_registrado_[] consulta_M_UR(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Usuario_reportado[] consultar_UR() {
		throw new UnsupportedOperationException();
	}

	public Mensaje_no_propietario__Moderador_[] consultar_M_Mo(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Mensaje_usuario[] consultar_MU(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje__Administrador_[] consultar_M_A(int aIdTema) {
		throw new UnsupportedOperationException();
	}

	public Tema__Administrador_[] consultar_T_A(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Seccion_fija__Administrador_[] consultar_SF_A() {
		throw new UnsupportedOperationException();
	}

	public Ultima_seccion__Administrador_[] consultar_US_A() {
		throw new UnsupportedOperationException();
	}

	public Tema_oculto[] consultar_TO() {
		throw new UnsupportedOperationException();
	}

	public Mensaje_oculto[] consultar_MO() {
		throw new UnsupportedOperationException();
	}

	public Usuario_notificado[] consultar_UN() {
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

	public boolean eliminar_seccion(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public void quitar_seccion_fija(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_seccion(String TituloSeccion, String Icono, boolean FijarSeccion) {
		try {
			return  secciones.crear_seccion(TituloSeccion, Icono, FijarSeccion);
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

	public ModeradorE[] consultar_Mo() {
		throw new UnsupportedOperationException();
	}
}