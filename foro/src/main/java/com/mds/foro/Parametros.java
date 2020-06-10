package com.mds.foro;

public class Parametros {
	
	/**DECLARACIONES**/
	//Vista actual
	private static int privilegioUsuario=0;
	private static int idUsuario=1;

	//Usuario
	private static String nombreUsuario="";
	private static String passwordUsuario="";
	private static String correoUsuario="";
	private static int perfilUsuario=1;
	private static String nombreCompleto;
	private static String fotoPerfil;
	private static String descripcionUsuario;
	private static boolean activar_desactivar_notificacion;
	private static boolean perfilOculto;
	private static boolean baneado=false;
	private static int idBaneado;
	private static int idNotificado;
	private static int idAmigo;
	private static boolean recibir_por_correo;

	//Tema
	private static int idTema=1;
	private static String tituloTema="";
	private static String iconoTema="";
	private static String usuarioTema="";
	private static String descripcionTema="";
	private static int numMensajesTema=0;
	private static int idUsuarioTema;
	private static int likeTema;
	private static int likesTemas;
	private static String ordenarPor="";
	private static int permisoTema;
	
	//Mensaje
	private static int idMensaje=1;
	private static int likesMensaje;
	private static boolean citado = false;
	private static int idCitado;
	
	//Seccion
	private static int idSeccion=1;
	private static String tituloSeccion="";
	private static String iconoSeccion="";
	
	//Otros
	private static int webVolverBaneo=0;
	
	
	/**GETTER Y SETTER**/

	public static int getTipoUsuario() {
		return privilegioUsuario;
	}
	public static void setTipoUsuario(int privilegioUsuario) {
		Parametros.privilegioUsuario = privilegioUsuario;
	}
	
	public static int getVolverBaneo() {
		return webVolverBaneo;
	}
	public static void setVolverBaneo(int webVolverBaneo) {
		Parametros.webVolverBaneo = webVolverBaneo;
	}
	
	public static boolean getBaneado() {
		return baneado;
	}
	public static void setBaneado(boolean baneado) {
		Parametros.baneado = baneado;
	}
	
	public static int getIdUsuario() {
		return idUsuario;
	}
	public static void setIdUsuario(int idUsuario) {
		Parametros.idUsuario = idUsuario;
	}
	
	public static int getIdSeccion() {
		return idSeccion;
	}
	public static void setIdSeccion(int idSeccion) {
		Parametros.idSeccion = idSeccion;
	}
	
	public static int getIdSeccionEliminar() {
		return idSeccion;
	}
	public static void setIdSeccionEliminar(int idSeccion) {
		Parametros.idSeccion = idSeccion;
	}
	
	public static String getTituloSeccion() {
		return tituloSeccion;
	}
	public static void setTituloSeccion(String tituloSeccion) {
		Parametros.tituloSeccion = tituloSeccion;
	}
	
	public static String getIconoSeccion() {
		return iconoSeccion;
	}
	public static void setIconoSeccion(String iconoSeccion) {
		Parametros.iconoSeccion = iconoSeccion;
	}
	
	public static String getNombreUsuario() {
		return nombreUsuario;
	}
	public static void setNombreUsuario(String nombreUsuario) {
		Parametros.nombreUsuario = nombreUsuario;
	}
	
	public static String getPasswordUsuario() {
		return passwordUsuario;
	}
	public static void setPasswordUsuario(String passwordUsuario) {
		Parametros.passwordUsuario = passwordUsuario;
	}
	
	public static String getCorreoUsuario() {
		return correoUsuario;
	}
	public static void setCorreoUsuario(String correoUsuario) {
		Parametros.correoUsuario = correoUsuario;
	}
	
	public static int getIdTema() {
		return idTema;
	}
	public static void setIdTema(int idTema) {
		Parametros.idTema = idTema;
	}
		
	public static String getTituloTema() {
		return tituloTema;
	}
	public static void setTituloTema(String tituloTema) {
		Parametros.tituloTema = tituloTema;
	}
	
	public static String getIconoTema() {
		return iconoTema;
	}
	public static void setIconoTema(String iconoTema) {
		Parametros.iconoTema = iconoTema;
	}
	public static String getOrdenarPor() {
		return ordenarPor;
	}
	public static void setOrdenarPor(String ordenarPor) {
		Parametros.ordenarPor = ordenarPor;
	}
	public static void setNombreUsuarioTema(String usuarioTema) {
		Parametros.usuarioTema = usuarioTema;
	}
	
	public static String getNombreUsuarioTema() {
		return usuarioTema;
	}
	public static void setDescripcionTema(String descripcionTema) {
		Parametros.descripcionTema = descripcionTema;
	}
	
	public static String getDescripcionTema() {
		return descripcionTema;
	}
	public static void setPerfilUsuario(int perfilUsuario) {
		Parametros.perfilUsuario = perfilUsuario;
	}
	
	public static int getPerfilUsuario() {
		return perfilUsuario;
	}
	public static void setNumMensajes(int numMensajesTema) {	
		Parametros.numMensajesTema = numMensajesTema;
	}
	public static int getNumMensajes() {
		return numMensajesTema;
	}
	public static int getIdMensaje() {
		return idMensaje;
	}
	public static void setIdMensaje(int idMensaje) {
		Parametros.idMensaje = idMensaje;
		
	}
	public static int getUsuarioTema() {
		return idUsuarioTema;
	}
	public static void setUsuarioTema(int idUsuarioTema) {
		Parametros.idUsuarioTema = idUsuarioTema;		
	}
	public static int getLikeTema() {
		return likeTema;
	}
	public static void setLikeTema(int likeTema) {
		Parametros.likeTema = likeTema;		
	}
	
	public static int getLikesTema() {
		return likesTemas;
	}
	
	public static void setLikesTema(int likesTemas) {
		Parametros.likesTemas = likesTemas;		
	}
	public static boolean getCitado() {
		return citado;
	}
	public static void setCitado(boolean citado) {
		Parametros.citado = citado;		
	}
	
	public static int getIdCitado() {
		return idCitado;
	}
	public static void setIdCitado(int idCitado) {
		Parametros.idCitado = idCitado;		
	}
	
	public static int getPermiso() {
		return permisoTema;
	}
	public static void setPermiso(int permisoTema) {
		Parametros.permisoTema = permisoTema;		
	}
	
	public static int getIdBaneado() {
		return idBaneado;
	}
	public static void setIdBaneado(int idBaneado) {
		Parametros.idBaneado = idBaneado;		
	}
	
	public static int getLikesMensaje() {
		return likesMensaje;
	}
	
	public static void setLikesMensaje(int likesMensaje) {
		Parametros.likesMensaje = likesMensaje;		
	}
	
	public static int getIdNotificado() {
		return idNotificado;
	}
	public static void setIdNotificado(int idNotificado) {
		Parametros.idNotificado = idNotificado;		
	}
	public static String getNombreCompleto() {
		return nombreCompleto;
	}
	public static void setNombreCompleto(String nombreCompleto) {
		Parametros.nombreCompleto = nombreCompleto;		
	}
	public static String getFotoPerfil() {
		return fotoPerfil;
	}
	public static void setFotoPerfil(String fotoPerfil) {
		Parametros.fotoPerfil = fotoPerfil;		
	}
	public static String getDescripcionUsuario() {
		return descripcionUsuario;
	}
	public static void setDescripcionUsuario(String descripcion) {
		Parametros.descripcionUsuario = descripcion;		
	}
	public static boolean getPerfilOculto() {
		return perfilOculto;
	}
	public static void setPerfilOculto(boolean perfilOculto) {
		Parametros.perfilOculto = perfilOculto;		
	}
	public static boolean getActivar_Desactivar_Notificacion() {
		return activar_desactivar_notificacion;
	}
	public static void setActivar_Desactivar_Notificacion(boolean notificacion) {
		Parametros.activar_desactivar_notificacion = notificacion;		
	}
	
	public static void borrarUsuario() {
		setIdUsuario(0);
		setPerfilUsuario(0);
	}
	
	public static int getIdMiAmigo() {
		return idAmigo;
	}
	
	public static void setIdMiAmigo(int idAmigo) {
		Parametros.idAmigo = idAmigo;		
	}
	
	public static boolean getActivar_Desactivar_Notificacion_por_correo() {
		return recibir_por_correo;
	}
	public static void setActivar_Desactivar_Notificacion_por_correo(boolean recibir_por_correo) {
		Parametros.recibir_por_correo = recibir_por_correo;		
	}
}
