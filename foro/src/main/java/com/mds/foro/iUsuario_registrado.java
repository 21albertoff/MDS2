package com.mds.foro;

import java.util.List;

public interface iUsuario_registrado extends iUsuario_identificado {

	//Reportar mensaje usuario
	public void reportar_mensaje(int idUsuario, int idUsuarior, int idMensaje);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);
}