package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_seccion__Administrador_ extends Visualizar_seccion_Ventana {

	// Declaracion de variables
	iElementos_fijos Elementos_fijos;
	iAdministrador admin;
	private int idSeccion;
	private String tituloSeccion;
	private String iconoSeccion;

	// Inicializacion
	public void inicializar() {
		admin = new DB_Main();
		Elementos_fijos = new DB_Main();
		idSeccion = Parametros.getIdSeccion();
		tituloSeccion = Parametros.getTituloSeccion();
		iconoSeccion = Parametros.getIconoSeccion();
		crearTema.setVisible(true);
		menuUsuarioAdministrador.setVisible(true);
		menuUsuarioNoIdentifado.setVisible(false);
	}

	public Visualizar_seccion__Administrador_() {
		inicializar();
		iconoS.setSource(new ExternalResource(iconoSeccion));
		tituloS.setValue(tituloSeccion);
		cargarSeccionesDestacadas();
		consultarTemas();

		menuCerrarSesionUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Cerrar_sesion());

			}
		});

		menuMiPerfilUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_mi_perfil());

			}
		});

		menuNotificacionesUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Notificaciones());

			}
		});

		crearTema.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Crear_tema());
			}
		});

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Administrador());
			}
		});
	}
	
	// consultarTemas
	private void consultarTemas() {
		List<TemaDB> T = admin.consultar_T_A(idSeccion);
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
				
				tema.botonEliminarTema.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						eliminarTema(T.get(id).getORMID());
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

						addComponent(new Visualizar_seccion__Administrador_());

					}
				});

				cuatro++;
			}
			
			idSD--;
		}
	}
	
	//Eliminar tema
	private void eliminarTema(int idTema) {
		if(admin.eliminar_tema(idTema)) {
			addComponent(new Visualizar_seccion__Administrador_());
			Notification.show("El tema ha sido eliminado con exito","", Notification.Type.WARNING_MESSAGE);
		}	
	}
}