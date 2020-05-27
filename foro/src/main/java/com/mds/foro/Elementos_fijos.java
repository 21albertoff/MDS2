package com.mds.foro;

import java.util.List;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Elementos_fijos extends Seccion_Ventana{
	//public iElementos_fijos _iElementos_fijos;
	//public Vector<Visualizar_anuncios> _anuncios = new Vector<Visualizar_anuncios>();
	//public Secciones_destacadas _verSeccionesDestacadas;
	
	//Declaraciones
	iElementos_fijos Elementos_fijos;

			//Inicializar
			public void inicializar() {
				Elementos_fijos = new DB_Main();
			}
			
			//Constructor
			public Elementos_fijos() {
				inicializar();
				//cargarSeccionesDestacadas();
			}
			
			//cargarSeccionesFijas
			@SuppressWarnings("unchecked")
			private void cargarSeccionesDestacadas() {
				List<SeccionDB> SD = Elementos_fijos.consultar_SD();
		        int idSF = 0;
		        while(idSF<=SD.size()-1 || idSF<=5) {
		            if(idSF == 5) {
		                break;
		            }
		    		if (SD.get(idSF).getEliminado()==false) {

		    			Seccion_destacada seccion = new Seccion_destacada();
		    			seccion.tituloSeccionDestacada.setCaption(SD.get(idSF).getSeccion());
		    			seccion.iconoSeccionDestacada.setSource(new ExternalResource(SD.get(idSF).getIcono()));
		                verticalSeccionesDestacadas.addComponent(seccion);

		                final int id = idSF;
		                seccion.tituloSeccionDestacada.addClickListener(new Button.ClickListener() 
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
		    			}
		            idSF++;
		        }
			}
}