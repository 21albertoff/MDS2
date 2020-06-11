package com.mds.foro;

@SuppressWarnings("serial")
public class Usuario_identificado extends Usuario {
	
	// Constructor
	public Usuario_identificado() {
		crearSeccion.setVisible(false);
		menuUsuarioNoIdentifado.setVisible(false);
		menuUsuarioIdentificado.setVisible(false);
		menuUsuarioModerador.setVisible(false);
		menuUsuarioAdministrador.setVisible(false);
	}
	
}