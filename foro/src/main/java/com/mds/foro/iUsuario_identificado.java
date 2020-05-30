package com.mds.foro;

import java.util.List;

public interface iUsuario_identificado extends iUsuario {

	//Consultar temas
	public List<TemaDB> consultar_T_UI(int idSeccion);

	public List consultar_M_UI(int aIdTema);

	public List consultar_MA(int aIdAmigo);

	public List consultar_N(int aIdUsuario);

	public List consultar_A(int aIdUsuario);

	public List consultar_MisM(int aIdUsuario);

	//Crear tema
	public boolean guardar_tema(int idSeccion,int idUsuario, String tituloTema, String subtituloTema);

	//Eliminar propio tema
	public boolean eliminar_propio_tema(int idTema);

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