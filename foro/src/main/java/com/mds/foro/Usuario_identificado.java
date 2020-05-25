package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Usuario_identificado extends Seccion_Ventana {
	/**public iUsuario_identificado _iUsuario_identificado;
	public Visualizar_seccion__Usuario_identificado_ _visualizarSeccion_UI_;
	public Visualizar_mi_perfil _visualizaMiPerfil;
	public Notificaciones _verListaNotificaciones;
	public Cerrar_sesion _cerrarSesionPropia;**/
	
	iUsuario usuario;
	public Usuario_identificado(){
		
		usuario = new DB_Main();
		List<SeccionDB> US = usuario.consultar_US();
		for(int i = US.size()-1; i>=0; i--) {
			Ultima_seccion seccion = new Ultima_seccion();
			seccion.tituloSeccion.setCaption(US.get(i).getSeccion());
			seccion.iconoSeccion.setSource(new ExternalResource(US.get(i).getIcono()));
			verticalUltimasSecciones.addComponent(seccion);
		}

		crearSeccion.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				guardar_seccion();
			} 
		}
	);
	}
	public void cargar_seccion() {
		// TODO Auto-generated method stub
		addComponent(new Visualizar_seccion__Usuario_identificado_());
	}
	private void guardar_seccion() {
		Crear_seccion nuevaSeccion = new Crear_seccion();
		addComponent(nuevaSeccion);
	}
}