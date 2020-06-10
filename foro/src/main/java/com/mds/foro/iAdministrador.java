package com.mds.foro;

import java.util.List;

public interface iAdministrador extends iUsuario_identificado {

	/** MENSAJES **/
	// Consultar mensajes administrador
	public List<MensajeDB> consultar_M_A(int idTema);

	// Eliminar mensaje
	public boolean eliminar_mensaje(int idMensaje);

	// Banear usuario
	public void banear_usuario(int idUsuario);

	/** TEMAS **/
	// Consultar temas Administrador
	public List<TemaDB> consultar_T_A(int idSeccion);

	// Eliminar tema
	public boolean eliminar_tema(int idTema);

	/** SECCIONES **/
	// Consultar secciones fijas Administrador
	public List<SeccionDB> consultar_SF_A();

	// Consultar ultimas secciones administrador
	public List<SeccionDB> consultar_US_A();

	// Eliminar seccion
	public boolean eliminar_seccion(int idSeccion);

	// Quitar seccion fija
	public void quitar_seccion_fija(int idSeccion);

	// Crear seccion
	public boolean crear_seccion(String tituloSeccion, String icono, boolean fijarSeccion);

	/** PANEL DE CONTROL **/
	// Consultar moderadores
	public List<Usuario_DB> consultar_Mo();

	// Quitar moderador
	public void quitar_moderador(int idUsuario);

	// Consultar temas ocultos
	public List<TemaDB> consultar_TO();

	// Mostrar tema
	public void mostrar_tema(int idTema);

	// Consultar mensajes ocultos
	public List<MensajeDB> consultar_MO();

	// Mostrar mensajes ocultos
	public void mostrar_mensaje(int idMensaje);

	// Consultar usuarios notificados
	public List<Usuario_registradoDB> consultar_UN();

	/** PERFIL USUARIO **/
	// Asignar deasignar moderador
	public void Asignar_Desasignar_moderador(int idUsuario);
}