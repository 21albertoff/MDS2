package com.mds.foro;

import java.util.List;

public interface iUsuario_identificado extends iUsuario {

	/** TEMAS **/
	// Consultar temas
	public List<TemaDB> consultar_T_UI(int idSeccion);

	// Crear tema
	public boolean guardar_tema(int idSeccion, int idUsuario, String tituloTema, String subtituloTema);

	// Eliminar propio tema
	public boolean eliminar_propio_tema(int idTema);

	// Valorar tema
	public void valorar_tema(int idUsuario, int idTema);

	/** MENSAJES **/
	// Consultar mensajes usuario identificado
	public List<MensajeDB> consultar_M_UI(int idTema);

	// Consultar mensajes amigo
	public List<MensajeDB> consultar_MA(int idAmigo);

	// Eliminar mensaje propietario
	public boolean eliminar_mi_mensaje(int idMensaje);

	// Crear mensaje
	public boolean crear_mensaje(int idTema, int idUsuario, String mensaje, String foto1, String foto2, String foto3,
			String video);

	// Valorar mensaje
	public void valorar_mensaje(int idUsuario, int idMensaje);

	// Citar mensaje
	public boolean citar_mensaje(int idTema, int idUsuario, int idCitado, String mensaje, String foto1, String foto2,
			String foto3, String video);

	/** NOTIFICACIONES **/
	// Consultar notificaciones
	public List<NotificacionDB> consultar_N(int idUsuario);

	// Eliminar notificacion
	public boolean eliminar_notificacion(int idUsuario, int idNotificacion);

	/** PERFIL USUARIO **/
	// Consultar amigo
	public List<Usuario_DB> consultar_A(int idUsuario);

	// Consultar mis mensajes
	public List<MensajeDB> consultar_MisM(int idUsuario);

	// Agregar amigo
	public boolean agregar_amigo(int idUsuario, int idAmigo);

	// Eliminar amigo perfil
	public boolean eliminar_amigoP(int idUsuario, int idAmigo);

	// Eliminar amgio
	public boolean eliminar_amigo(int idUsuario, int idAmigo);

	// Modificar foto
	public boolean modificar_foto(int idUsuario, String foto);

	// Modificar descripcion
	public boolean modificar_descripcion(int idUsuario, String descripcion);

	// Cambiar contraseña
	public boolean cambiar_contrasenia(int idUsuario, String contrasenia);

	// Activar desactivar por notificaciones
	public void Activar_Desactivar_notificaciones(int idUsuario);

	// Activar desactivar por correo
	public void Activar_Desactivar_por_correo(int idUsuario);

	// Perfil oculto
	public void perfil_oculto(int idUsuario);

	// Consultar amigo
	public Usuario_DB consultar_Amigo(int idUsuarioAmigo);

	// Enviar solicitud
	public void enviar_solicitud(int idUsuario, int idUsuarioAmigo);
}