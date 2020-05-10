package com.mds.foro;

public interface iUsuario_identificado extends iUsuario {

	public Tema__Usuario_identificado_[] consultar_T_UI();

	public Mensaje__Usuario_identificado_[] consultar_M_UI();

	public Mensaje_amigo[] consultar_MA();

	public Notificacion[] consultar_N();

	public Amigo[] consultar_A();

	public Mi_mensaje[] consultar_MisM();

	public boolean guardar_tema(String aTituloTema, String aSubtituloTema);

	public boolean eliminar_propio_tema(int aIdTema);

	public boolean agregar_fotos(String aFotos);

	public boolean agregar_video(String aVideo);

	public boolean agregar_amigo(String aNombreUsuario);

	public boolean eliminar_amigoP(String aNombreUsuario);

	public boolean eliminar_amigo(String aNombreUsuario);

	public boolean modificar_foto(String aFoto);

	public boolean modificar_descripcion(String aDescripcion);

	public boolean eliminar_notificacion(int aIdNotificacion);

	public boolean cambiar_contrasenia(String aContrasenia);

	public boolean eliminar_mi_mensaje(int aIdMensaje);

	public boolean crear_mensaje(String aMensaje, String aFotos, String aVideo);

	public void valorar_tema();

	public void valorar_mensaje();

	public boolean citar_tema(String aMensaje, String aFotos, String aVideo, String aTema);

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, String aMensajeCitado);

	public void Activar_Desactivar_notificaciones();

	public void Activar_Desactivar_por_correo();

	public void perfil_oculto();
}