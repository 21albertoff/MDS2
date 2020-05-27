package com.mds.foro;

public interface iUsuario_no_identificado extends iUsuario {

	public boolean registrarse(String nombreUsuario, String nombreCompleto, String correoUsuario, String passwordUsuario, String descripcionUsuario, String fotoUsuario);

	public boolean iniciar_sesion(String nombreUsuario, String passwordUsuario);

	public boolean recuperarContrasenia(String nombreUsuario, String correoElectronico);
}