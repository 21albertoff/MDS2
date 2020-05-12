package com.mds.foro;

public interface iUsuario_identificado extends iUsuario {

	public Tema__Usuario_identificado_[] consultar_T_UI(int aIdSeccion);

	public Mensaje__Usuario_identificado_[] consultar_M_UI(int aIdTema);

	public Mensaje_amigo[] consultar_MA(int aIdAmigo);

	public Notificacion[] consultar_N(int aIdUsuario);

	public Amigo[] consultar_A(int aIdUsuario);

	public Mi_mensaje[] consultar_MisM(int aIdUsuario);

	public boolean guardar_tema(int aIdSeccion, String aTituloTema, String aSubtituloTema);

	public boolean eliminar_propio_tema(int aIdTema);

	public boolean agregar_fotos(int aIdMensaje, String aFoto1, String aFoto2, String aFoto3);

	public boolean agregar_video(int aIdMensaje, String aVideo);

	public boolean agregar_amigo(int aIdUsuario, int aIdAmigo);

	public boolean eliminar_amigoP(int aIdUsuario, int aIdAmigo);

	public boolean eliminar_amigo(int aIdUsuario, int aIdAmigo);

	public boolean modificar_foto(int aIdUsuario, String aFoto);

	public boolean modificar_descripcion(int aIdUsuario, String aDescripcion);

	public boolean eliminar_notificacion(int aIdUsuario, int aIdNotificacion);

	public boolean cambiar_contrasenia(int aIdUsuario, String aContrasenia);

	public boolean eliminar_mi_mensaje(int aIdUsuario, int aIdMensaje);

	public boolean crear_mensaje(int aIdUsuario, int aIdTema, String aMensaje, String aFotos, String aVideo);

	public void valorar_tema(int aIdUsuario, int aIdTema);

	public void valorar_mensaje(int aIdUsuario, int aIdMensaje);

	public boolean citar_tema(String aMensaje, String aFotos, String aVideo, int aIdTema);

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, int aIdMensaje);

	public void Activar_Desactivar_notificaciones(int aIdUsuario);

	public void Activar_Desactivar_por_correo(int aIdUsuario);

	public void perfil_oculto(int aIdUsuario);
}