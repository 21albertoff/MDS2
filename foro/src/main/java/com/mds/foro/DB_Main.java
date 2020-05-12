package com.mds.foro;

public class DB_Main implements iUsuario_no_identificado, iCorreo, iElementos_fijos, iUsuario, iUsuario_identificado, iModerador, iUsuario_registrado, iAdministrador {
	public DB_Temas _bd_temas;
	public DB_Administradores _bd_administradores;
	public DB_UsuariosNotificados _bd_usuarios_notificados;
	public DB_Secciones _bd_secciones;
	public DB_Notificaciones _bd_notificaciones;
	public DB_Mensajes _bd_mensajes;
	public DB_UsuariosRegistrados _bd_usuarios_registrados;

	public boolean registrarse(String aNombreUsuario, String aNombreCompleto, String aCorreo, String aContrasenia, String aDescripcion, String aFoto) {
		throw new UnsupportedOperationException();
	}

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

	public boolean iniciar_sesion(String aNombreUsuario, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean recuperarContrasenia(int aIdUsuario, String aCorreoElectronico) {
		throw new UnsupportedOperationException();
	}

	public Seccion_fija[] consultar_SF() {
		throw new UnsupportedOperationException();
	}

	public Ultima_seccion[] consultar_US() {
		throw new UnsupportedOperationException();
	}

	public Seccion_destacada[] consultar_SD() {
		throw new UnsupportedOperationException();
	}

	public Tema[] consultar_T(int aIdSeccion) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] consultar_M(int aIdTema) {
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

	public boolean crear_seccion(String aTituloSeccion, String aIcono, boolean aFijarSeccion) {
		throw new UnsupportedOperationException();
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

	public void enviar_Mensaje(int aIdUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public ModeradorE[] consultar_Mo() {
		throw new UnsupportedOperationException();
	}
}