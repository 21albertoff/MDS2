package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_tema_y_mensajes extends Visualizar_tema_y_mensajes_Ventana {

	// Declaracion de variables
	iElementos_fijos Elementos_fijos;
	iUsuario usuario;
	private int idTema;
	private String tituloT;
	private String iconoTema;
	private String nombreUsuarioTema;
	private String descripcionT;
	private int numMensajes;
	private String cantidadMensajes;

	// Inicializador
	public void inicializar() {
		Elementos_fijos = new DB_Main();
		usuario = new DB_Main();
		idTema = Parametros.getIdTema();
		tituloT = Parametros.getTituloTema();
		iconoTema = Parametros.getIconoTema();
		nombreUsuarioTema = Parametros.getNombreUsuarioTema();
		descripcionT = Parametros.getDescripcionTema();
		menuUsuarioAdministrador.setVisible(false);
		menuUsuarioNoIdentifado.setVisible(true);
		menuUsuarioIdentificado.setVisible(false);
		menuUsuarioModerador.setVisible(false);
	}

	// Constructor
	public Visualizar_tema_y_mensajes() {
		inicializar();
		cargarSeccionesDestacadas();
		consultarMensajes();
		imagenPerfil.setSource(new ExternalResource(iconoTema));
		tituloTemaMensaje.setValue(tituloT);
		nombreUsuario.setValue(nombreUsuarioTema);
		descripcionTema.setValue(descripcionT);
		numMensajes = Parametros.getNumMensajes();
		cantidadMensajes = ("" + numMensajes);
		numeroMensajes.setValue(cantidadMensajes);

		// Usuario no identificado
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
					addComponent(new Visualizar_seccion());
				}
			});
		}

	}

	// Consultar Mensajes usuario no identificado
	private void consultarMensajes() {
		List<MensajeDB> M = usuario.consultar_M(idTema);
		int numMensajes = 0;
		int idM = 0;
		while (idM < M.size()) {
			if (M.get(idM).getEliminado() == false) {
				if (M.get(idM).getOculto() == false) {

					numMensajes++;
					Parametros.setNumMensajes(numMensajes);
					Mensaje mensaje = new Mensaje();
					mensaje.imagen.setVisible(false);

					// Citar mensaje
					if (!(M.get(idM).getEsta_en() == null)) {
						MensajeDB cita = M.get(idM).getEsta_en();
						mensaje.citarMen.setValue(cita.getMensaje());
					} else {
						mensaje.citarMen.setVisible(false);
						mensaje.citado.setVisible(false);
					}

					// Datos mensaje
					Usuario_DB user = M.get(idM).getCreado_por();
					mensaje.fotoUsuario.setSource(new ExternalResource(user.getFoto()));
					mensaje.nickUsuario.setCaption(user.getNombreUsuario());
					mensaje.mensaje.setValue(M.get(idM).getMensaje());

					// Videos e imagenes
					String video = M.get(idM).getVideo();
					String foto1 = M.get(idM).getFoto1();
					String foto2 = M.get(idM).getFoto2();
					String foto3 = M.get(idM).getFoto3();

					if (video == null) {
						mensaje.linkVideo.setVisible(false);
						mensaje.videos.setVisible(false);

						if (foto1 == null) {
							mensaje.imagen1.setVisible(false);
						} else {
							mensaje.imagen1.setSource(new ExternalResource(foto1));
							mensaje.imagen.setVisible(true);
							if (foto2 == null) {
								mensaje.imagen2.setVisible(false);
							} else {
								mensaje.imagen.setVisible(true);
								mensaje.imagen2.setSource(new ExternalResource(foto2));
								if (foto3 == null) {
									mensaje.imagen3.setVisible(false);
								} else {
									mensaje.imagen.setVisible(true);
									mensaje.imagen3.setSource(new ExternalResource(foto3));
								}
							}
						}
					} else {
						mensaje.linkVideo.setCaption(video);
						mensaje.linkVideo.setResource(new ExternalResource(video));
						mensaje.videos.setVisible(true);
						mensaje.linkVideo.setVisible(true);
					}

					// Añadir mensaje
					verticalMensajes.addComponent(mensaje);

					mensaje.nickUsuario.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Notification.show("Lo siento, debes registrarte para poder ver el perfil del usuario.", Notification.Type.ERROR_MESSAGE);
						}
					});
				}
			}
			idM++;
		}
	}

	// Cargar secciones destacadas
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

				// Visualizar seccion
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