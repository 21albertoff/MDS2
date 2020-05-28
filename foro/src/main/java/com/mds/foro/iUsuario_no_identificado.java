package com.mds.foro;

public interface iUsuario_no_identificado extends iUsuario {

	/**REGISTRARSE**/
	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario, String passwordUsuario, String descripcionUsuario, String fotoUsuario);

	/**INICIAR SESION**/
	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario);

	/**RECUPERAR CONTRASEÑA**/
	public boolean recuperarContrasenia(String nombreUsuario, String correoElectronico);
}