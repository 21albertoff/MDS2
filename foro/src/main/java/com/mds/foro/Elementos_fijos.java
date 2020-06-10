package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Elementos_fijos extends Seccion_Ventana {

	// Declaraciones
	iElementos_fijos Elementos_fijos;

	// Constructor
	public Elementos_fijos() {
		Elementos_fijos = new DB_Main();
		cargarSeccionesDestacadas();
	}

	// cargarSeccionesDestacadas
	private void cargarSeccionesDestacadas() {
		List<SeccionDB> SD = Elementos_fijos.consultar_SD();
		int idSD = SD.size() - 1;
		int cuatro = 0;
		while (idSD >= 0 && cuatro < 4) {
			if (cuatro == 4) {
				break;
			}
			if (SD.get(idSD).getEliminado() == false) {

				// Creacion del componente
				Seccion_destacada seccion = new Seccion_destacada();

				// Elementos del compoentne
				seccion.tituloSeccion.setCaption(SD.get(idSD).getSeccion());
				seccion.iconoSeccion.setSource(new ExternalResource(SD.get(idSD).getIcono()));

				// Añadiendo el componente
				verticalSeccionesDestacadas.addComponent(seccion);

				// Botones del componente
				final int id = idSD;
				seccion.tituloSeccion.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdSeccion(SD.get(id).getORMID());
						Parametros.setTituloSeccion(SD.get(id).getSeccion());
						Parametros.setIconoSeccion(SD.get(id).getIcono());

						// Usuario registrado
						if (Parametros.getTipoUsuario() == 1) {
							addComponent(new Visualizar_seccion__Usuario_identificado_());
						}

						// Moderador
						else if (Parametros.getTipoUsuario() == 2) {
							addComponent(new Visualizar_seccion__Usuario_identificado_());
						}

						// Administrador
						else if (Parametros.getTipoUsuario() == 3) {
							addComponent(new Visualizar_seccion__Administrador_());
						}

						else {
							addComponent(new Visualizar_seccion());
						}
					}
				});
				cuatro++;
			}
			idSD--;
		}
	}
}