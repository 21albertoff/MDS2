package com.mds.foro;

public class Parametros {
	private static int idUsuario=1;
	private static String nombreUsuario="";
	private static String passwordUsuario="";
	private static String correoUsuario="";
	private static int perfilUsuario=1;


	private static int idSeccion=1;
	private static String tituloSeccion="";
	private static String iconoSeccion="";
	
	private static int idTema=1;
	private static String tituloTema="";
	private static String iconoTema="";
	private static String usuarioTema="";
	private static String descripcionTema="";
	private static int numMensajesTema=0;

	private static int idMensaje=1;

	private static boolean baneado=false;
	
	private static int privilegioUsuario=0;
	
	private static String ordenarPor="";
	private static int idUsuarioTema;
	private static int likeTema;
	private static int likesTemas;
	private static boolean citado = false;
	private static int idCitado;
	private static int permisoTema;
	private static int idBaneado;
	private static int likesMensaje;
	private static int idNotificado;
	

	public static int getTipoUsuario() {
		return privilegioUsuario;
	}
	public static void setTipoUsuario(int privilegioUsuario) {
		Parametros.privilegioUsuario = privilegioUsuario;
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
}
