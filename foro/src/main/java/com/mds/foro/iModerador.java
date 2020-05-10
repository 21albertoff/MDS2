package com.mds.foro;

public interface iModerador extends iUsuario_identificado {

	public Usuario_reportado[] consultar_UR();

	public Mensaje_no_propietario__Moderador_[] consultar_M_Mo();

	public Mensaje_usuario[] consultar_MU();

	public boolean eliminar_perfil(String aNombreUsuario);

	public boolean modificar_nombre(boolean aNombreUsuario, String aNewNombreUsuario);

	public void notificar(String aNombreUsuario, String aMotivo);

	public void eliminar_reporte(String aNombreUsuario);

	public void ocultar_tema(int aIdTema);

	public void ocultar_mensaje(int aIdMensaje);
}