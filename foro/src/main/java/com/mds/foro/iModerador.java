package com.mds.foro;

public interface iModerador extends iUsuario_identificado {

	public Usuario_reportado[] consultar_UR();

	public Mensaje_no_propietario__Moderador_[] consultar_M_Mo(int aIdTema);

	public Mensaje_usuario[] consultar_MU(int aIdUsuario);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);

	public void notificar(int aIdUsuario, String aMotivo);

	public void eliminar_reporte(int aIdUsuario);

	public void ocultar_tema(int aIdTema);

	public void ocultar_mensaje(int aIdMensaje);
}