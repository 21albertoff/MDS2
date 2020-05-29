package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class Visualizar_seccion extends Visualizar_seccion_Ventana{
	
	//Declaraciones 
	iElementos_fijos Elementos_fijos;
	public void inicializar() {
		Elementos_fijos = new DB_Main();
	    crearTema.setVisible(false);
	    menuUsuarioNoIdentifado.setVisible(false);
	    menuUsuarioIdentificado.setVisible(false);
	    menuUsuarioModerador.setVisible(false);
	    menuUsuarioAdministrador.setVisible(false); 
	}

	public Visualizar_seccion() {
		inicializar();
		if(!(Parametros.getTipoUsuario()==1 || Parametros.getTipoUsuario()==2 || Parametros.getTipoUsuario()==3)) {
			cargarSeccionesDestacadas();
		}
			
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