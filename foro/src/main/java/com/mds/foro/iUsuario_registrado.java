package com.mds.foro;

public interface iUsuario_registrado extends iUsuario_identificado {

	/** TEMAS Y MENSAJES **/
	// Reportar mensaje usuario
	public void reportar_mensaje(int idUsuario, int idUsuarior, int idMensaje);

	/** PERFIL DE USUARIO **/
	// Eliminar perfil
	public boolean eliminar_perfil(int idUsuario);

	// Modificar nombre
	public boolean modificar_nombre(int idUsuario, String newNombreUsuario);
}