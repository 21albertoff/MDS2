package com.mds.foro;

import java.util.Vector;
import com.mds.foro.Usuario_notificadosDB;

public class DB_UsuariosNotificados {
	public DB_Main _bd_main_usuarios_notificados;
	public Vector<Usuario_notificadosDB> _contiene_usuario_notificados = new Vector<Usuario_notificadosDB>();

	public Usuario_notificado[] consultar_UN() {
		throw new UnsupportedOperationException();
	}

	public void notificar(String aNombreUsuario, String aMotivo) {
		throw new UnsupportedOperationException();
	}
}