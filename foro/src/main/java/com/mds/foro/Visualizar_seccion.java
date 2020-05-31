package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_seccion extends Visualizar_seccion_Ventana {

	// Declaraciones
	iUsuario usuario;
	iElementos_fijos Elementos_fijos;
	private int idSeccion;
	private String tituloSeccion;
	private String iconoSeccion;

	// Inicializador
	public void inicializar() {
		usuario = new DB_Main();
		Elementos_fijos = new DB_Main();
		idSeccion = Parametros.getIdSeccion();
		tituloSeccion = Parametros.getTituloSeccion();
		iconoSeccion = Parametros.getIconoSeccion();
		crearTema.setVisible(false);
		menuUsuarioNoIdentifado.setVisible(true);
		menuUsuarioIdentificado.setVisible(false);
		menuUsuarioModerador.setVisible(false);
		menuUsuarioAdministrador.setVisible(false);
	}

	// Constructor
	public Visualizar_seccion() {
		inicializar();
		iconoS.setSource(new ExternalResource(iconoSeccion));
		tituloS.setValue(tituloSeccion);
		cargarSeccionesDestacadas();
		consultarTemas();
		
		if (!(Parametros.getTipoUsuario() == 1 || Parametros.getTipoUsuario() == 2
				|| Parametros.getTipoUsuario() == 3)) {

			menuIniciarSesion.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Iniciar_sesion());
				}
			});

			menuRegistrarse.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Registrarse());
				}
			});

			nombreForo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Usuario_no_identificado());
				}
			});
		}
	}

	// consultarTemas
	private void consultarTemas() {
		List<TemaDB> T = usuario.consultar_T(idSeccion);
		ordenarPor.setItems("Mensajes", "Me gusta", "Fecha");
		ordenarPor.addValueChangeListener(event -> {
		    if (event.getValue() == "Mensajes" ) {
				Notification.show("Mensajes", "", Notification.Type.WARNING_MESSAGE);
		    			    	
		    }else if (event.getValue() == "Me gusta") {
				Notification.show("Me gusta", "", Notification.Type.WARNING_MESSAGE);

		    } else {
				Notification.show("Fecha", "", Notification.Type.WARNING_MESSAGE);
		    }
		});
		
		int idT = T.size() - 1;
		while (idT >= 0) {
			if (T.get(idT).getEliminado() == false) {
				if(T.get(idT).getOculto() == false) {
				Tema tema = new Tema();
				tema.imagenTema.setSource(new ExternalResource(Parametros.getIconoSeccion()));
				tema.nombreTema.setCaption(T.get(idT).getTema());
				int cantidadLike = T.get(idT).getCantidadLike();
				String cantidadLikeTexto = "" + cantidadLike;
				tema.cantidadMeGustas.setValue(cantidadLikeTexto);
				tema.botonEliminarTema.setVisible(false);
				tema.botonEliminarOculto.setVisible(false);

				verticalTemas.addComponent(tema);

				final int id = idT;
				tema.nombreTema.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdTema(T.get(id).getORMID());
						Parametros.setTituloTema(T.get(id).getTema());
						Parametros.setIconoTema(Parametros.getIconoSeccion());
						addComponent(new Visualizar_tema_y_mensajes());
					}
				});
			}
			}
			idT--;
		}
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

				Seccion_destacada seccion = new Seccion_destacada();
				seccion.tituloSeccion.setCaption(SD.get(idSD).getSeccion());
				seccion.iconoSeccion.setSource(new ExternalResource(SD.get(idSD).getIcono()));
				verticalSeccionesDestacadas.addComponent(seccion);

				final int id = idSD;
				seccion.tituloSeccion.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdSeccion(SD.get(id).getORMID());
						Parametros.setTituloSeccion(SD.get(id).getSeccion());
						Parametros.setIconoSeccion(SD.get(id).getIcono());
						
						addComponent(new Visualizar_seccion());
						
					}
				});

				cuatro++;
			}

			idSD--;
		}
	}
}