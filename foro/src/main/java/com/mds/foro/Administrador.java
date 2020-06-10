package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public class Administrador extends Usuario_identificado {

	// Declaraciones
	iAdministrador admin;

	// Inicializador
	public void inicializarA() {
		admin = new DB_Main();
		crearSeccion.setVisible(true);
		menuUsuarioAdministrador.setVisible(true);
	}

	// Constructor
	public Administrador() {
		inicializarA();
		cargarUltimasSeccionesA();
		cargarSeccionesFijasA();

		crearSeccion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Crear_seccion());
			}
		});

		menuCerrarSesionAdministrador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Cerrar_sesion());

			}
		});

		menuMiPerfilAdministrador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_mi_perfil());

			}
		});

		menuNotificacionesAdministrador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Notificaciones());

			}
		});
		
		menuPanelControlAdministrador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Panel_de_control());

			}
		});
	}

	// Cargar ultimas secciones administrador
	private void cargarUltimasSeccionesA() {
		List<SeccionDB> US = admin.consultar_US_A();
		int idUS = US.size() - 1;
		while (idUS >= 0) {
			if (US.get(idUS).getEliminado() == false) {

				// Creacion del componente
				Ultima_seccion__Administrador_ seccion = new Ultima_seccion__Administrador_();

				// Elementos del componente
				seccion.tituloSeccion.setCaption(US.get(idUS).getSeccion());
				seccion.iconoSeccion.setSource(new ExternalResource(US.get(idUS).getIcono()));

				// Añadimos el componente
				verticalUltimasSecciones.addComponent(seccion);

				// Botones del componente
				final int id = idUS;
				seccion.tituloSeccion.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdSeccion(US.get(id).getORMID());
						Parametros.setTituloSeccion(US.get(id).getSeccion());
						Parametros.setIconoSeccion(US.get(id).getIcono());
						addComponent(new Visualizar_seccion__Administrador_());
					}
				});

				seccion.eliminarSeccion.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdSeccion(US.get(id).getORMID());
						addComponent(new Eliminar_seccion());
					}
				});
			}
			idUS--;

		}
	}

	// Cargar secciones fijas administrador
	private void cargarSeccionesFijasA() {
		List<SeccionDB> SF = admin.consultar_SF_A();
		int idSF = SF.size() - 1;
		int tres = 0;
		while (idSF >= 0 && tres < 3) {
			if (tres == 3) {
				break;
			}
			if (SF.get(idSF).getSeccionFija()) {
				if (SF.get(idSF).getEliminado() == false) {

					// Creacion del componente
					Seccion_fija__Administrador_ seccion = new Seccion_fija__Administrador_();

					// Elementos del componente
					seccion.tituloSeccion.setCaption(SF.get(idSF).getSeccion());
					seccion.iconoSeccion.setSource(new ExternalResource(SF.get(idSF).getIcono()));

					// Añadimos el componente
					verticalSeccionesFijas.addComponent(seccion);

					// Botones del componente
					final int id = idSF;
					seccion.tituloSeccion.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdSeccion(SF.get(id).getORMID());
							Parametros.setTituloSeccion(SF.get(id).getSeccion());
							Parametros.setIconoSeccion(SF.get(id).getIcono());
							addComponent(new Visualizar_seccion__Administrador_());
						}
					});

					seccion.quitarFijo.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							quitarSeccionFija(SF.get(id).getORMID());
						}
					});

					tres++;
				}
			}
			idSF--;
		}
	}

	// Metodo quitar seccion fija
	private void quitarSeccionFija(int idSeccion) {
		admin.quitar_seccion_fija(idSeccion);
		addComponent(new Administrador());
		Notification.show("La seccion se ha quitado de la seccion fija exitosamente", "",
				Notification.Type.WARNING_MESSAGE);
	}

}