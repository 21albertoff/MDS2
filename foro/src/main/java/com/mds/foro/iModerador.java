package com.mds.foro;

import java.util.List;

public interface iModerador extends iUsuario_identificado {

	public List consultar_UR();

	public List consultar_M_Mo(int aIdTema);

	public List consultar_MU(int aIdUsuario);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);

	public void notificar(int aIdUsuario, String aMotivo);

	public void eliminar_reporte(int aIdUsuario);

	public void ocultar_tema(int aIdTema);

	public void ocultar_mensaje(int aIdMensaje);
}