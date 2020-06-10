package com.mds.foro;

import java.util.List;

public interface iModerador extends iUsuario_identificado {

	/** PANEL DE CONTROL **/
	// Consultar usuarios reportados
	public List<Usuario_registradoDB> consultar_UR();

	// Eliminar reporte
	public void eliminar_reporte(int idUsuario);

	/** OCULTAR TEMA **/
	// Ocultar tema
	public void ocultar_tema(int idTema);

	/** MENSAJES **/
	// Consultar mensajes usuario moderador
	public List<MensajeDB> consultar_M_Mo(int idTema);

	// Ocultar mensaje
	public void ocultar_mensaje(int idMensaje);

	// Notificar usuarios
	public void notificar(int idUsuario, String motivo);

	/** PERFIL USUARIO **/
	// Eliminar perfil
	public boolean eliminar_perfil(int idUsuario);

	// Modificar nombre
	public boolean modificar_nombre(int idUsuario, String newNombreUsuario);
}