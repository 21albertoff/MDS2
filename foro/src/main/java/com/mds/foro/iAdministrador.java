package com.mds.foro;

import java.util.List;

public interface iAdministrador extends iUsuario_identificado {

	public List consultar_MU(int aIdUsuario);

	public List consultar_M_A(int aIdTema);

	public List consultar_T_A(int aIdSeccion);

	public List consultar_SF_A();

	public List consultar_US_A();

	public List consultar_Mo();

	public List consultar_TO();

	public List consultar_MO();

	public List consultar_UN();

	public void Asignar_Desasignar_moderador(int aIdUsuario);

	public void cambiar_num_mensajes(int aIdUsuario, int aCantidad);

	public boolean eliminar_mensaje(int aIdMensaje);

	public void cambiar_estado_tema(int aIdTema);

	public void cerrar_tema(int aIdTema);

	public boolean eliminar_tema(int aIdTema);

	public void banear_usuario(int aIdUsuario, int aTiempo);

	public boolean eliminar_seccion(int aIdSeccion);

	public void quitar_seccion_fija(int aIdSeccion);

	public boolean crear_seccion(String tituloSeccion, String icono, boolean fijarSeccion);

	public void quitar_moderador(int aIdUsuario);

	public void mostrar_tema(int aIdTema);

	public void mostrar_mensaje(int aIdMensaje);
}