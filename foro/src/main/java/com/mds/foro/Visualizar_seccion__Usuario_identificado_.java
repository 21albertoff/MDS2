package com.mds.foro;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

public class Visualizar_seccion__Usuario_identificado_ extends Visualizar_seccion_Ventana{
	/**private Label _crearTemaL;
	private Button _crearTemaB;
	public Temas__Usuario_identificado_ _verTemas;
	public Crear_tema _creaTema;**/
	
	private int idSeccion;
	private String tituloSeccion;
	private String iconoSeccion;
	
	
	public Visualizar_seccion__Usuario_identificado_() {
		idSeccion = Parametros.getIdSeccion();
		tituloSeccion = Parametros.getTituloSeccion();
		iconoSeccion = Parametros.getIconoSeccion();
		
		iconoS.setSource(new ExternalResource(iconoSeccion));
		tituloS.setValue(tituloSeccion);
	}
}