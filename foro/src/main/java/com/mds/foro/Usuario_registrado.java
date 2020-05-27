package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial") 
public class Usuario_registrado extends Usuario_identificado {
	
	//Declaraciones
	iUsuario usuarioUR;
	
	//Inicializacion
	public void inicializar() {
		usuarioUR = new DB_Main();
	    menuUsuarioIdentificado.setVisible(true);
	}

	//Constructor
	public Usuario_registrado() {
		inicializar();
		cargarUltimasSeccionesUR();
		cargarSeccionesFijasUR();
		
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
		
	}
	
	//Metodo cargar ultimas secciones
	@SuppressWarnings("unchecked")
	private void cargarUltimasSeccionesUR() {
		List<SeccionDB> US = usuarioUR.consultar_US();
		int idUS = US.size()-1;
		while(idUS>=0) {
			if (US.get(idUS).getEliminado()==false) {

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
			}
			idUS--;
			
		}
	}
	
	//Metodo cargar secciones fijas
	@SuppressWarnings("unchecked")
	private void cargarSeccionesFijasUR() {
		List<SeccionDB> SF = usuarioUR.consultar_SF();
        int idSF = SF.size()-1;
        int tres = 0;
        while(idSF>=0 && tres<3) {
            if(tres == 3) {
                break;
            }
            if(SF.get(idSF).getSeccionFija()) {
    			if (SF.get(idSF).getEliminado()==false) {

    			Seccion_fija seccion = new Seccion_fija();
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
    			
                tres++;
    			}
            }
            idSF--;
        }
	}
	
}