package com.mds.foro;

public interface iUsuario_registrado extends iUsuario_identificado {

	public Mensaje_no_propietario__Usuario_registrado_[] consulta_M_UR();

	public void reportar_mensaje(String aNombreUsuario);

	public boolean eliminar_perfil(String aNombreUsuario);

	public boolean modificar_nombre(String aNombreUsuario, String aNewNombreUsuario);
}