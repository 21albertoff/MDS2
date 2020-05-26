package com.mds.foro;

public class Usuario extends Elementos_fijos {
	/*public iUsuario _iUsuario;
	public Secciones_fijas _verSeccionesFijas;
	public Ultimas_secciones _verUltimasSecciones;
	*/
	
	public void inicializar() {
	    crearSeccion.setVisible(false);
	    menuUsuarioNoIdentifado.setVisible(true);
	    menuUsuarioIdentificado.setVisible(false);
	    menuUsuarioModerador.setVisible(false);
	    menuUsuarioAdministrador.setVisible(false); 
	}

	public Usuario() {
		inicializar();
		
	}
	
}