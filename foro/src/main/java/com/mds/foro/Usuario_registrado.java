package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial") 
public class Usuario_registrado extends Usuario_identificado {
	//public iUsuario_registrado _iUsuario_registrado;
	//public Mensajes__Usuario_registrado_ _verMensajes;
	//public Visualizar_mi_perfil__Usuario_registrado_ _visualizaPerfil;
	//public Escribir_ticket__Usuario_registrado_ _escribeTicket;
	
	iUsuario usuario;

	public Usuario_registrado() {
		
		usuario = new DB_Main();
		cargarUltimasSecciones();
		cargarSeccionesFijas();
		
		crearSeccion.addClickListener(new Button.ClickListener()
		{
			public void buttonClick(ClickEvent event) 
			{ 
				guardar_seccion();
			} 
		}
	);
	}
	

	@SuppressWarnings("unchecked")
	private void cargarUltimasSecciones() {
		List<SeccionDB> US = usuario.consultar_US();
		int idUS = US.size()-1;
		while(idUS>=0) {
			Ultima_seccion seccion = new Ultima_seccion();
			seccion.tituloSeccion.setCaption(US.get(idUS).getSeccion());
			seccion.iconoSeccion.setSource(new ExternalResource(US.get(idUS).getIcono()));
			verticalUltimasSecciones.addComponent(seccion);
			
			final int id = idUS;
			seccion.tituloSeccion.addClickListener(new Button.ClickListener() 
				{
					public void buttonClick(ClickEvent event) 
					{ 
						Parametros.setIdSeccion(US.get(id).getORMID());
						Parametros.setTituloSeccion(US.get(id).getSeccion());
						Parametros.setIconoSeccion(US.get(id).getIcono());
						addComponent(new Visualizar_seccion__Usuario_identificado_());
					} 
				}
			);
			idUS--;
		}
	}
	
	@SuppressWarnings("unchecked")
	private void cargarSeccionesFijas() {
		List<SeccionDB> SF = usuario.consultar_SF();
		int idSF = SF.size()-1;
		while(idSF>=0) {
			Ultima_seccion seccion = new Ultima_seccion();
			seccion.tituloSeccion.setCaption(SF.get(idSF).getSeccion());
			seccion.iconoSeccion.setSource(new ExternalResource(SF.get(idSF).getIcono()));
			verticalUltimasSecciones.addComponent(seccion);
			
			final int id = idSF;
			seccion.tituloSeccion.addClickListener(new Button.ClickListener() 
				{
					public void buttonClick(ClickEvent event) 
					{ 
						Parametros.setIdSeccion(SF.get(id).getORMID());
						Parametros.setTituloSeccion(SF.get(id).getSeccion());
						Parametros.setIconoSeccion(SF.get(id).getIcono());
						addComponent(new Visualizar_seccion__Usuario_identificado_());
					} 
				}
			);
			idSF--;
		}
	}
	
	
	private void guardar_seccion() {
		Crear_seccion nuevaSeccion = new Crear_seccion();
		addComponent(nuevaSeccion);
	}
}