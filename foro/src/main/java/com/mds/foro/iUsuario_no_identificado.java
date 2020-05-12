package com.mds.foro;

public interface iUsuario_no_identificado extends iUsuario {

	public boolean registrarse(String aNombreUsuario, String aNombreCompleto, String aCorreo, String aContrasenia, String aDescripcion, String aFoto);

	public boolean iniciar_sesion(String aNombreUsuario, String aContrasenia);

	public boolean recuperarContrasenia(int aIdUsuario, String aCorreoElectronico);
}