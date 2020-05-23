package com.mds.foro;

public class Parametros {
	private static int idUsuario=-1;
	private static int idVideo=-1;
	private static int idLista=-1;
	private static boolean baneado=false;
	
	private static int privilegioUsuario=1;
	
	private static String busqueda="";
	private static String filtro="";
	private static String filtroOrdenar="";
	private static String campo_recup_contrasenia="";
	private static int admin_usuario_seleccionado=-1;
	private static int admin_categoria_seleccionada=-1;
	private static int admin_video_seleccionado=-1;
	private static int idUsuarioNavega=-1;
	private static int usuarioActual=-1;
	private static int idComentarioAEliminar = -1;
	private static String contraseniaGenerada="";
	
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
	
	
	
}
