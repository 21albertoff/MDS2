package com.mds.foro;

import java.util.List;

public interface iModerador extends iUsuario_identificado {

	public List consultar_UR();

	//Consultar mensajes usuario moderador
	public List<MensajeDB> consultar_M_Mo(int idTema);

	public List consultar_MU(int aIdUsuario);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);

	//Notificar usuarios
	public void notificar(int idUsuario, String motivo);

	public void eliminar_reporte(int aIdUsuario);

	public void ocultar_tema(int aIdTema);

	public void ocultar_mensaje(int aIdMensaje);
}