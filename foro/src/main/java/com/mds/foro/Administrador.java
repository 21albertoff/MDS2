package com.mds.foro;


import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public class Administrador extends Usuario_identificado {

	iAdministrador admin;
	public void inicializar() {
		admin = new DB_Main();
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
				addComponent(new Crear_seccion());
			} 
		});
		
		menuCerrarSesionAdministrador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Cerrar_sesion());

			} 
		});
	}
	
	@SuppressWarnings("unchecked")
	private void cargarUltimasSecciones() {
		List<SeccionDB> US = admin.consultar_US_A();
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
		List<SeccionDB> SF = admin.consultar_SF_A();
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
	
	private void eliminarSeccion(int idSeccion) {
		if(admin.eliminar_seccion(idSeccion)) {
			addComponent(new Administrador());
			Notification.show("La seccion a sido eliminado con exito","", Notification.Type.WARNING_MESSAGE);
		}	
	}
	
	private void quitarSeccionFija(int idSeccion) {
		admin.quitar_seccion_fija(idSeccion); 
		addComponent(new Administrador());
		Notification.show("La seccion se ha quitado de la seccion fija exitosamente","", Notification.Type.WARNING_MESSAGE);
	}

}