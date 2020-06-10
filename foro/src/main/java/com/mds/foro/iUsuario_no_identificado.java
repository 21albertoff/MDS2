package com.mds.foro;

public interface iUsuario_no_identificado extends iUsuario {

	/** REGISTRARSE **/
	// Registrarse
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario,
			String passwordUsuario, String descripcionUsuario, String fotoUsuario);

	/** INICIAR SESION **/
	// Iniciar sesion
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario);

	/** RECUPERAR CONTRASEÑA **/
	// Recuperar contraseña
	public boolean recuperarContrasenia(String nombreUsuario, String correoElectronico);
}