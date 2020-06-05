package com.mds.foro;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

public class Visualizar_tema_y_mensajes__Usuario_identificado_ extends Visualizar_tema_y_mensajes_Usuario_identificado_Ventana {
	// Declaracion de variables
	iElementos_fijos Elementos_fijos;
	iUsuario_identificado usuarioI;
	iUsuario_registrado usuarioR;
	private int idTema;
	private String tituloT;
	private String iconoTema;
	private String nombreUsuarioTema;
	private String descripcionT;
	private int numMensajes;
	private String cantidadMensajes;

	// Inicializacion
	public void inicializar() {
		Elementos_fijos = new DB_Main();
		usuarioI = new DB_Main();
		usuarioR = new DB_Main();
		idTema = Parametros.getIdTema();
		tituloT = Parametros.getTituloTema();
		iconoTema = Parametros.getIconoTema();
		nombreUsuarioTema = Parametros.getNombreUsuarioTema();
		descripcionT = Parametros.getDescripcionTema();
		menuUsuarioAdministrador.setVisible(false);
		menuUsuarioNoIdentifado.setVisible(false);
		menuUsuarioIdentificado.setVisible(true);
		menuUsuarioModerador.setVisible(false);
	}

	@SuppressWarnings("serial")
	public Visualizar_tema_y_mensajes__Usuario_identificado_() {
		inicializar();
		cargarSeccionesDestacadas();
		consultarMensajes();
		fotoPerfil.setSource(new ExternalResource(iconoTema));
		tituloTema.setValue(tituloT);
		tituloTema2.setValue(tituloT);
		nombreUsuario.setValue(nombreUsuarioTema);
		descripcionTema.setValue(descripcionT);
		numMensajes = Parametros.getNumMensajes();
		cantidadMensajes = ("" + numMensajes);
		numeroMensajes.setValue(cantidadMensajes);
		String cantidadLikes = ("" + Parametros.getLikeTema());
		numeroMeGusta.setValue(cantidadLikes);
		
		int propietario = Parametros.getIdUsuario();
		int tema = Parametros.getUsuarioTema();
		if (tema == propietario) {
			eliminarTema.setVisible(true);
		} else {
			if (Parametros.getTipoPermiso() != 3)
				reportarUsuario.setVisible(true);
			eliminarTema.setVisible(false);
		}
		
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
				addComponent(new Escribir_mensaje());
			}
		});
	}
	
	//Valorar tema
	private void valorarTema() {
		int idUsuario = Parametros.getIdUsuario();
		int idTema = Parametros.getIdTema();
		usuarioI.valorar_tema(idUsuario, idTema);
		String likes = (""+Parametros.getLikesTema());
		numeroMeGusta.setValue(likes);
	}

	//Consultar Mensajes usuario identificado
	@SuppressWarnings({ "serial", "unchecked" })
	private void consultarMensajes() {
		List<MensajeDB> M = usuarioI.consultar_M_UI(idTema);
		int numMensajes = 0;
		int idM = 0;
		while (idM < M.size()) {
			if (M.get(idM).getEliminado() == false) {
				if (M.get(idM).getOculto() == false) {
					numMensajes++;
					Parametros.setNumMensajes(numMensajes);
					Mensaje_propietario mensaje = new Mensaje_propietario();
					if (!(M.get(idM).getEsta_en() == null)) {
						MensajeDB cita = M.get(idM).getEsta_en();
						mensaje.citarMen.setValue(cita.getMensaje());
					} else {
						mensaje.citarMen.setVisible(false);
						mensaje.citado.setVisible(false);
					}

					mensaje.botonBanear.setVisible(false);
					mensaje.botonNotificar.setVisible(false);

					int propietario = Parametros.getIdUsuario();
					Usuario_DB user = M.get(idM).getCreado_por();
					if (user.getIdUsuario() == propietario) {
						mensaje.botonEliminar.setVisible(true);
						Parametros.setMensaje(M.get(idM).getIdMensaje());
					} else {
						mensaje.botonEliminar.setVisible(false);
					}
					mensaje.fotoPerfil.setSource(new ExternalResource(user.getFoto()));
					mensaje.nickUsuario.setCaption(user.getNombreUsuario());
					mensaje.mensaje.setValue(M.get(idM).getMensaje());
					String gusta = ("" + M.get(idM).getCantidadLike());
					mensaje.cantidadMeGusta.setValue(gusta);
					mensaje.botonMeGusta.setVisible(true);

					if (!(M.get(idM).getVideo() == null || M.get(idM).getVideo() == "")) {
						String linkVideo = M.get(idM).getVideo();
						mensaje.linkVideo.setCaption(linkVideo);
						mensaje.linkVideo.setResource(new ExternalResource(M.get(idM).getVideo()));
						mensaje.imagen.setVisible(false);
					} else {
						mensaje.videos.setVisible(false);
						if (!(M.get(idM).getFoto1() == null || M.get(idM).getFoto1() == "")) {
							mensaje.imagen1.setSource(new ExternalResource(M.get(idM).getFoto1()));
						}
						if (!(M.get(idM).getFoto2() == null || M.get(idM).getFoto2() == "")) {
							mensaje.imagen2.setSource(new ExternalResource(M.get(idM).getFoto2()));
						}

						if (!(M.get(idM).getFoto3() == null || M.get(idM).getFoto3() == "")) {
							mensaje.imagen3.setSource(new ExternalResource(M.get(idM).getFoto3()));
						}

						else {
							mensaje.imagen.setVisible(false);
						}
					}

					verticalMensajes.addComponent(mensaje);

					final int id = idM;
					mensaje.nickUsuario.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setPerfilUsuario(M.get(id).getCreado_por().getORMID());
							addComponent(new Visualizar_perfil());
						}
					});
					mensaje.botonEliminar.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							int idMensaje = Parametros.getMensaje();
							usuarioI.eliminar_mi_mensaje(Parametros.getIdUsuario(), idMensaje);
							addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
						}
					});
					mensaje.reportar.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							int idMensaje = Parametros.getMensaje();
							usuarioR.reportar_mensaje(M.get(id).getCreado_por().getIdUsuario(), idMensaje);
							addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
						}
					});
					mensaje.botonMeGusta.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							int idMensaje = Parametros.getMensaje();
							usuarioI.valorar_mensaje(Parametros.getIdUsuario(), idMensaje);
							addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
						}
					});
					
					mensaje.responderMensaje.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdTema(idTema);
							Parametros.setCitado(true);
							Parametros.setIdCitado(M.get(id).getORMID());
							addComponent(new Escribir_mensaje());
						}
					});
					
					
				}
			}
			idM++;
		}
	}

	// cargarSeccionesDestacadas
	@SuppressWarnings("serial")
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