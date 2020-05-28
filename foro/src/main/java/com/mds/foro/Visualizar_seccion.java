package com.mds.foro;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;

public class Visualizar_seccion extends Visualizar_seccion_Ventana{
	
	public void inicializar() {
	    crearTema.setVisible(false);
	    menuUsuarioNoIdentifado.setVisible(false);
	    menuUsuarioIdentificado.setVisible(false);
	    menuUsuarioModerador.setVisible(false);
	    menuUsuarioAdministrador.setVisible(false); 
	}

	public Visualizar_seccion() {
		inicializar();
	}
}