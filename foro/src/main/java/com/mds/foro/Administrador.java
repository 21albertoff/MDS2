package com.mds.foro;


import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public class Administrador extends Usuario_identificado {
	/*
	public iAdministrador _iAdministrador;
	public Secciones_fijas__Administrador_ _unnamed_Secciones_fijas__Administrador__;
	public Ultimas_secciones__Administrador_ _unnamed_Ultimas_secciones__Administrador__;
	public Panel_de_control _unnamed_Panel_de_control_;
	public Crear_seccion _creaSeccion;
	*/
	
	iAdministrador usuario;
	public void inicializar() {
		usuario = new DB_Main();
	    crearSeccion.setVisible(true);
	    menuUsuarioNoIdentifado.setVisible(false);
	    menuUsuarioIdentificado.setVisible(false);
	    menuUsuarioModerador.setVisible(false);
	    menuUsuarioAdministrador.setVisible(true); 
	}

	public Administrador() {
		inicializar();
		cargarUltimasSecciones();
		cargarSeccionesFijas();
		
		crearSeccion.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				guardar_seccion();
			} 
		});
	}
	
	@SuppressWarnings("unchecked")
	private void cargarUltimasSecciones() {
		List<SeccionDB> US = usuario.consultar_US_A();
		int idUS = US.size()-1;
		while(idUS>=0) {
			if (US.get(idUS).getEliminado()==false) {
			Ultima_seccion__Administrador_ seccion = new Ultima_seccion__Administrador_();
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
			

			
			seccion.eliminarSeccion.addClickListener(new Button.ClickListener() 
			{
					public void buttonClick(ClickEvent event) 
					{ 
						eliminarSeccion(US.get(id).getORMID());					
					} 
				}
			);
			}
			idUS--;
        	
        }
	}
	
	@SuppressWarnings("unchecked")
	private void cargarSeccionesFijas() {
		List<SeccionDB> SF = usuario.consultar_SF_A();
        int idSF = SF.size()-1;
        int tres = 0;
        while(idSF>=0 && tres<3) {
            if(tres == 3) {
                break;
            }
            if(SF.get(idSF).getSeccionFija()) {
    			if (SF.get(idSF).getEliminado()==false) {
	    			Seccion_fija__Administrador_ seccion = new Seccion_fija__Administrador_();
	    			seccion.tituloSeccion.setCaption(SF.get(idSF).getSeccion());
	    			seccion.iconoSeccion.setSource(new ExternalResource(SF.get(idSF).getIcono()));
	                verticalSeccionesFijas.addComponent(seccion);
	
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
	                
	                seccion.quitarFijo.addClickListener(new Button.ClickListener() 
	    				{
	                		public void buttonClick(ClickEvent event) 
	    					{ 
	    						quitarSeccionFija(SF.get(id).getORMID());					
	    					} 
	    				}
	                );
    			
                tres++;
    			}
            }
            idSF--;
        }
	}
	
	private void guardar_seccion() {
		Crear_seccion nuevaSeccion = new Crear_seccion();
		addComponent(nuevaSeccion);
	}
	
	private void eliminarSeccion(int idSeccion) {
		if(usuario.eliminar_seccion(idSeccion)) {
			addComponent(new Administrador());
			Notification.show("La seccion a sido eliminado con exito","", Notification.Type.WARNING_MESSAGE);
		}	
	}
	
	private void quitarSeccionFija(int idSeccion) {
		usuario.quitar_seccion_fija(idSeccion); 
		addComponent(new Administrador());
		Notification.show("La seccion se ha quitado de la seccion fija exitosamente","", Notification.Type.WARNING_MESSAGE);
	}

}