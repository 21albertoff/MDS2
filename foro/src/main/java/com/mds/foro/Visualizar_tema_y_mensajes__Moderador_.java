package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_tema_y_mensajes__Moderador_ extends Visualizar_tema_y_mensajes_Moderador_Ventana {

	// Declaracion de variables
	iElementos_fijos Elementos_fijos;
	iModerador moderador;
	iUsuario_identificado usuarioI;
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
		moderador = new DB_Main();
		usuarioI = new DB_Main();
		idTema = Parametros.getIdTema();
		tituloT = Parametros.getTituloTema();
		iconoTema = Parametros.getIconoTema();
		nombreUsuarioTema = Parametros.getNombreUsuarioTema();
		descripcionT = Parametros.getDescripcionTema();
		menuUsuarioAdministrador.setVisible(false);
		menuUsuarioNoIdentifado.setVisible(false);
		menuUsuarioIdentificado.setVisible(false);
		menuUsuarioModerador.setVisible(true);
	}

	// Visualizar tema y mensajes
	public Visualizar_tema_y_mensajes__Moderador_() {
		inicializar();
		cargarSeccionesDestacadas();
		consultarMensajes();
		fotoPerfil.setSource(new ExternalResource(iconoTema));
		tituloTema2.setValue(tituloT);
		nombreUsuario.setValue(nombreUsuarioTema);
		descripcionTema.setValue(descripcionT);
		numMensajes = Parametros.getNumMensajes();
		cantidadMensajes = ("" + numMensajes);
		numeroMensajes.setValue(cantidadMensajes);
		String cantidadLikes = ("" + Parametros.getLikeTema());
		numeroMeGusta.setValue(cantidadLikes);
		reportarUsuario.setVisible(false);
		botonOcultarTema.setVisible(true);

		int propietario = Parametros.getIdUsuario();
		int tema = Parametros.getUsuarioTema();
		if (tema == propietario) {
			eliminarTema.setVisible(true);
			reportarUsuario.setVisible(false);
		} else {
			if (Parametros.getPermiso() != 3)
				reportarUsuario.setVisible(true);
			eliminarTema.setVisible(false);
		}

		// Botones Moderador
		menuCerrarSesionModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Cerrar_sesion());

			}
		});

		menuMiPerfilModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_mi_perfil__Moderador_());

			}
		});

		menuNotificacionesModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Notificaciones());

			}
		});

		menuPanelControlModerador.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Panel_de_control_del_moderador());

			}
		});

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Visualizar_seccion__Usuario_identificado_());
			}
		});

		eliminarTema.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Parametros.setIdTema(idTema);
				addComponent(new Eliminar_tema());
			}
		});

		botonMeGusta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Parametros.setIdTema(idTema);
				valorarTema();
			}
		});

		escribirMensaje.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Parametros.setIdTema(idTema);
				Parametros.setCitado(false);
				Parametros.setTipoUsuario(2);
				addComponent(new Escribir_mensaje());
			}
		});

		reportarUsuario.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Parametros.setIdNotificado(tema);
				Parametros.setVolverBaneo(1);
				addComponent(new Notificar_usuario());
			}
		});

		botonOcultarTema.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Parametros.setIdTema(idTema);
				ocultarTema();
			}
		});
	}

	// Ocultar tema
	private void ocultarTema() {
		int idTema = Parametros.getIdTema();
		moderador.ocultar_tema(idTema);
		addComponent(new Visualizar_seccion__Usuario_identificado_());

	}

	// Valorar tema
	private void valorarTema() {
		int idUsuario = Parametros.getIdUsuario();
		int idTema = Parametros.getIdTema();
		usuarioI.valorar_tema(idUsuario, idTema);
		String likes = ("" + Parametros.getLikesTema());
		numeroMeGusta.setValue(likes);
	}

	// Ocultar mensaje
	private void ocultarMensaje() {
		int idMensaje = Parametros.getIdMensaje();
		moderador.ocultar_mensaje(idMensaje);
		addComponent(new Visualizar_tema_y_mensajes__Moderador_());
	}

	// Consultar Mensajes Moderador
	private void consultarMensajes() {
		List<MensajeDB> M = moderador.consultar_M_Mo(idTema);
		int numMensajes = 0;
		int idM = 0;
		while (idM < M.size()) {
			if (M.get(idM).getEliminado() == false) {
				if (M.get(idM).getOculto() == false) {

					Parametros.setIdMensaje(M.get(idM).getORMID());
					numMensajes++;
					Parametros.setNumMensajes(numMensajes);
					Mensaje_propietario mensaje = new Mensaje_propietario();

					// Ocultar elementos
					mensaje.botonBanear.setVisible(false);
					mensaje.reportar.setVisible(false);
					mensaje.botonEliminar.setVisible(false);

					// Citar mensaje
					if (!(M.get(idM).getEsta_en() == null)) {
						MensajeDB cita = M.get(idM).getEsta_en();
						mensaje.citarMen.setValue(cita.getMensaje());
					} else {
						mensaje.citarMen.setVisible(false);
						mensaje.citado.setVisible(false);
					}

					// Mensaje propietario
					int propietario = Parametros.getIdUsuario();
					Usuario_DB user = M.get(idM).getCreado_por();
					if (user.getIdUsuario() == propietario) {
						mensaje.botonEliminar.setVisible(true);
						mensaje.botonNotificar.setVisible(false);
						Parametros.setIdMensaje(M.get(idM).getIdMensaje());
					}

					// Mensaje de un admin
					if (user.getPermiso() == 3) {
						mensaje.botonNotificar.setVisible(false);
					}

					// Datos mensaje
					mensaje.fotoPerfil.setSource(new ExternalResource(user.getFoto()));
					mensaje.nickUsuario.setCaption(user.getNombreUsuario());
					mensaje.mensaje.setValue(M.get(idM).getMensaje());
					String gusta = ("" + M.get(idM).getCantidadLike());
					mensaje.cantidadMeGusta.setValue(gusta);

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
							mensaje.imagen.setVisible(false);
						} else {
							mensaje.imagen1.setSource(new ExternalResource(foto1));
							if (foto2 == null) {
								mensaje.imagen2.setVisible(false);
							} else {
								mensaje.imagen2.setSource(new ExternalResource(foto2));
								if (foto3 == null) {
									mensaje.imagen3.setVisible(false);
								} else {
									mensaje.imagen3.setSource(new ExternalResource(foto3));
								}
							}
						}
					} else {
						mensaje.linkVideo.setCaption(video);
						mensaje.linkVideo.setResource(new ExternalResource(video));
						mensaje.videos.setVisible(true);
						mensaje.linkVideo.setVisible(true);
						mensaje.imagen.setVisible(false);
					}

					// Añadir mensaje
					verticalMensajes.addComponent(mensaje);

					// Metodos de cada boton
					final int id = idM;
					mensaje.nickUsuario.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setPerfilUsuario(M.get(id).getCreado_por().getORMID());
							if (Parametros.getPerfilUsuario() == Parametros.getIdUsuario()) {
								addComponent(new Visualizar_mi_perfil__Moderador_());
							} else {
								Parametros.setIdMiAmigo(M.get(id).getCreado_por().getORMID());
								addComponent(new Visualizar_perfil__Moderador_());
							}
						}
					});
					mensaje.botonEliminar.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdMensaje(M.get(id).getIdMensaje());
							addComponent(new Eliminar_mensaje());
						}
					});
					mensaje.botonNotificar.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdNotificado(M.get(id).getCreado_por().getORMID());
							Parametros.setVolverBaneo(1);
							addComponent(new Notificar_usuario());
						}
					});
					mensaje.botonMeGusta.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							valorarMensaje();
							String likes = ("" + Parametros.getLikesMensaje());
							mensaje.cantidadMeGusta.setValue(likes);
						}
					});

					mensaje.botonOcultar.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdMensaje(M.get(id).getIdMensaje());
							ocultarMensaje();
						}
					});

					mensaje.responderMensaje.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdTema(idTema);
							Parametros.setCitado(true);
							Parametros.setIdCitado(M.get(id).getORMID());
							Parametros.setTipoUsuario(2);
							addComponent(new Escribir_mensaje());
						}
					});

				}
			}
			idM++;
		}
	}

	// Valorar mensaje
	private void valorarMensaje() {
		int idUsuario = Parametros.getIdUsuario();
		int idMensaje = Parametros.getIdMensaje();
		usuarioI.valorar_mensaje(idUsuario, idMensaje);
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

				final int id = idSD;
				seccion.tituloSeccion.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdSeccion(SD.get(id).getORMID());
						Parametros.setTituloSeccion(SD.get(id).getSeccion());
						Parametros.setIconoSeccion(SD.get(id).getIcono());

						addComponent(new Visualizar_seccion__Usuario_identificado_());

					}
				});

				cuatro++;
			}

			idSD--;
		}
	}
}