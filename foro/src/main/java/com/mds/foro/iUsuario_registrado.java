package com.mds.foro;

import java.util.List;

public interface iUsuario_registrado extends iUsuario_identificado {

	public List<MensajeDB> consulta_M_UR(int aIdTema);

	public void reportar_mensaje(int aIdUsuario, int aIdMensaje);

	public boolean eliminar_perfil(int aIdUsuario);

	public boolean modificar_nombre(int aIdUsuario, String aNewNombreUsuario);
}