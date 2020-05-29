package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Visualizar_seccion__Administrador_ extends Visualizar_seccion_Ventana {
	
		//Declaracion de variables
		iElementos_fijos Elementos_fijos;
		private int idSeccion;
		private String tituloSeccion;
		private String iconoSeccion;
		
		//Inicializacion
		public void inicializar() {
			Elementos_fijos = new DB_Main();
			idSeccion = Parametros.getIdSeccion();
			tituloSeccion = Parametros.getTituloSeccion();
			iconoSeccion = Parametros.getIconoSeccion();
			crearTema.setVisible(true);
		    menuUsuarioAdministrador.setVisible(true);
		    menuUsuarioNoIdentifado.setVisible(false);
		}
		
		@SuppressWarnings("serial")
		public Visualizar_seccion__Administrador_() {
			inicializar();
			iconoS.setSource(new ExternalResource(iconoSeccion));
			tituloS.setValue(tituloSeccion);
			cargarSeccionesDestacadas();

			
			menuCerrarSesionUsuario.addClickListener(new Button.ClickListener(){
				public void buttonClick(ClickEvent event) { 
					addComponent(new Cerrar_sesion());

				} 
			});
			
			menuMiPerfilUsuario.addClickListener(new Button.ClickListener(){
				public void buttonClick(ClickEvent event) { 
					addComponent(new Visualizar_mi_perfil());

				} 
			});
			
			menuNotificacionesUsuario.addClickListener(new Button.ClickListener(){
				public void buttonClick(ClickEvent event) { 
					addComponent(new Notificaciones());

				} 
			});
			
			crearTema.addClickListener(new Button.ClickListener(){
				public void buttonClick(ClickEvent event) { 
					addComponent(new Crear_tema());
				} 
			});
			
			nombreForo.addClickListener(new Button.ClickListener(){
				public void buttonClick(ClickEvent event) { 
					addComponent(new Administrador());
				} 
			});
		}
		
		//cargarSeccionesDestacadas
		private void cargarSeccionesDestacadas() {
			List<SeccionDB> SD = Elementos_fijos.consultar_SD();
			int idSD = SD.size()-1;
			int cuatro = 0;
			while(idSD>=0 && cuatro<4) {
				if(cuatro == 4) {
					break;
				}
					if (SD.get(idSD).getEliminado()==false) {

						Seccion_destacada seccion = new Seccion_destacada();
						seccion.tituloSeccion.setCaption(SD.get(idSD).getSeccion());
						seccion.iconoSeccion.setSource(new ExternalResource(SD.get(idSD).getIcono()));
						verticalSeccionesDestacadas.addComponent(seccion);

						final int id = idSD;
						seccion.tituloSeccion.addClickListener(new Button.ClickListener() 
						{
							public void buttonClick(ClickEvent event) 
							{ 
								Parametros.setIdSeccion(SD.get(id).getORMID());
								Parametros.setTituloSeccion(SD.get(id).getSeccion());
			                    Parametros.setIconoSeccion(SD.get(id).getIcono());
			                    
			                    //Usuario registrado
								if(Parametros.getTipoUsuario()==1) {
							        addComponent(new Visualizar_seccion__Usuario_identificado_());
								}
								
								//Moderador
								else if(Parametros.getTipoUsuario()==2) {
							        addComponent(new Visualizar_seccion__Usuario_identificado_());
								}
								
								//Administrador
								else if(Parametros.getTipoUsuario()==3) {
							        addComponent(new Visualizar_seccion__Administrador_());
								}
								
								else {
							        addComponent(new Visualizar_seccion());
								}
							} 
						}
			        	);
			    			
						cuatro++;
						}
		     	
				idSD--;
		      	}
		}	
}