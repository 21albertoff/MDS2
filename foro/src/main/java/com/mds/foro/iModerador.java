package com.mds.foro;

import java.util.List;

public interface iModerador extends iUsuario_identificado {

	//Consultar usuarios reportados
	public List<Usuario_registradoDB> consultar_UR();

	//Consultar mensajes usuario moderador
	public List<MensajeDB> consultar_M_Mo(int idTema);

	public List consultar_MU(int aIdUsuario);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);

	//Notificar usuarios
	public void notificar(int idUsuario, String motivo);

	//Eliminar reporte
	public void eliminar_reporte(int idUsuario);

	public void ocultar_tema(int aIdTema);

	public void ocultar_mensaje(int aIdMensaje);
}