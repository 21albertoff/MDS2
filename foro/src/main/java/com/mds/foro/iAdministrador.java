package com.mds.foro;

public interface iAdministrador extends iUsuario_identificado {

	public Mensaje_usuario[] consultar_MU();

	public Mensaje__Administrador_[] consultar_M_A();

	public Tema__Administrador_[] consultar_T_A();

	public Seccion_fija__Administrador_[] consultar_SF_A();

	public Ultima_seccion__Administrador_[] consultar_US_A();

	public ModeradorE[] consultar_Mo();

	public Tema_oculto[] consultar_TO();

	public Mensaje_oculto[] consultar_MO();

	public Usuario_notificado[] consultar_UN();

	public void Asignar_Desasignar_moderador();

	public void cambiar_num_mensajes(int aCantidad);

	public boolean eliminar_mensaje(int aIdMensaje);

	public void cambiar_estado_tema(int aIdTema);

	public void cerrar_tema(int aIdTema);

	public boolean eliminar_tema(int aIdTema);

	public void banear_usuario(String aTiempo);

	public boolean eliminar_seccion(int aIdSeccion);

	public void quitar_seccion_fija(Object aIdSeccion);

	public boolean crear_seccion(String aTituloSeccion, String aIcono, boolean aFijarSeccion);

	public void quitar_moderador(String aNombreUsuario);

	public void mostrar_tema(int aIdTema);

	public void mostrar_mensaje(int aIdMensaje);
}