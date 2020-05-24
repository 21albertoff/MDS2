package com.mds.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Usuario_identificado extends Seccion_Ventana {
	/**public iUsuario_identificado _iUsuario_identificado;
	public Visualizar_seccion__Usuario_identificado_ _visualizarSeccion_UI_;
	public Visualizar_mi_perfil _visualizaMiPerfil;
	public Notificaciones _verListaNotificaciones;
	public Cerrar_sesion _cerrarSesionPropia;**/
	
	public Usuario_identificado(){
		Ultima_seccion seccion = new Ultima_seccion();
		verticalUltimasSecciones.addComponent(seccion);
		crearSeccion.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				guardar_seccion();
			} 
		}
	);
	}
	
	private void guardar_seccion() {
		Crear_seccion nuevaSeccion = new Crear_seccion();
		addComponent(nuevaSeccion);
	}
}