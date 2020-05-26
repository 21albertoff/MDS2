package com.mds.foro;

@SuppressWarnings("serial")
public class Usuario_identificado extends Seccion_Ventana {
	/**public iUsuario_identificado _iUsuario_identificado;
	public Visualizar_seccion__Usuario_identificado_ _visualizarSeccion_UI_;
	public Visualizar_mi_perfil _visualizaMiPerfil;
	public Notificaciones _verListaNotificaciones;
	public Cerrar_sesion _cerrarSesionPropia;**/
	
	public void inicializar() {
	    crearSeccion.setVisible(false);
	    menuUsuarioNoIdentifado.setVisible(false);
	    menuUsuarioIdentificado.setVisible(true);
	    menuUsuarioModerador.setVisible(false);
	    menuUsuarioAdministrador.setVisible(false); 
	}

	public Usuario_identificado() {
		inicializar();
	}
	
}