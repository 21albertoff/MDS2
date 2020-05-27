package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Moderador extends Usuario_identificado {
	
	//Declaraciones
	iUsuario moderador;
	iElementos_fijos Elementos_fijos;

	//Inicializacion
	public void inicializar() {
		moderador = new DB_Main();
		Elementos_fijos = new DB_Main();
	    menuUsuarioModerador.setVisible(true);
	}

	//Constructor
	public Moderador() {
		inicializar();
		cargarUltimasSeccionesM();
		cargarSeccionesFijasM();
		cargarSeccionesDestacadasM();
		
		menuCerrarSesionModerador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Cerrar_sesion());

			} 
		});
		
		menuMiPerfilModerador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Visualizar_mi_perfil());

			} 
		});
		
		menuNotificacionesModerador.addClickListener(new Button.ClickListener(){
			public void buttonClick(ClickEvent event) { 
				addComponent(new Notificaciones());

			} 
		});
	}
	
	//Metodo cargar ultimas secciones
	@SuppressWarnings("unchecked")
	private void cargarUltimasSeccionesM() {
		List<SeccionDB> US = moderador.consultar_US();
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
	private void cargarSeccionesFijasM() {
		List<SeccionDB> SF = moderador.consultar_SF();
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
	
	//cargarSeccionesDestacadas
			private void cargarSeccionesDestacadasM() {
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
				                    addComponent(new Visualizar_seccion__Usuario_identificado_());
								} 
							}
				        	);
				    			
							cuatro++;
							}
			     	
					idSD--;
			      	}
			}

	
}