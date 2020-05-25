package com.mds.foro;

public class Parametros {
	private static int idUsuario=1;
	
	private static int idSeccion=1;
	private static String tituloSeccion="";
	private static String iconoSeccion="";
	
	private static boolean baneado=false;
	
	private static int privilegioUsuario=1;
	

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
	
	
	
}
