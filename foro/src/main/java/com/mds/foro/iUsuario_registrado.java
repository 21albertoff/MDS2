package com.mds.foro;

public interface iUsuario_registrado extends iUsuario_identificado {

	public Mensaje_no_propietario__Usuario_registrado_[] consulta_M_UR(int aIdTema);

	public void reportar_mensaje(int aIdUsuario, int aIdMensaje);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);
}