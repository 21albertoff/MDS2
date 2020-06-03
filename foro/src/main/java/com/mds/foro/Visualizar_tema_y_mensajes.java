package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

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


	// Inicializacion
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

	public Visualizar_tema_y_mensajes() {
		inicializar();
		cargarSeccionesDestacadas();
		consultarMensajes();
		imagenPerfil.setSource(new ExternalResource(iconoTema));
		tituloTema.setValue(tituloT);
		tituloTemaMensaje.setValue(tituloT);
		nombreUsuario.setValue(nombreUsuarioTema);
		descripcionTema.setValue(descripcionT);
		numMensajes = Parametros.getNumMensajes();
		cantidadMensajes = (""+numMensajes);
		numeroMensajes.setValue(cantidadMensajes);

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
				addComponent(new Visualizar_seccion());
			}
		});

	}
	
	private void consultarMensajes() {
		List<MensajeDB> M = usuario.consultar_M(idTema);
		int numMensajes = Parametros.getNumMensajes();
		int idM = 0;
		while (idM < M.size()) {
			if (M.get(idM).getEliminado() == false) {
				if(M.get(idM).getOculto() == false) {
					numMensajes++;
					Parametros.setNumMensajes(numMensajes);
					Mensaje mensaje = new Mensaje();
					if(!(M.get(idM).getEsta_en() == null)) {
						MensajeDB cita = M.get(idM).getEsta_en();
						mensaje.citarMen.setValue(cita.getMensaje());
					} else {
						mensaje.citarMen.setVisible(false);
						mensaje.citado.setVisible(false);
					}
					Usuario_DB user = M.get(idM).getCreado_por();
					mensaje.fotoUsuario.setSource(new ExternalResource(user.getFoto()));
					mensaje.nickUsuario.setCaption(user.getNombreUsuario());
					mensaje.mensaje.setValue(M.get(idM).getMensaje());
					
					if(!(M.get(idM).getVideo() == null)) {
						String linkVideo = M.get(idM).getVideo();
						mensaje.linkVideo.setCaption(linkVideo);
						mensaje.linkVideo.setResource(new ExternalResource(M.get(idM).getVideo()));
						mensaje.imagen.setVisible(false);
					} else {
						mensaje.videos.setVisible(false);
						if(!(M.get(idM).getFoto1() == null || M.get(idM).getFoto1() == "")) {
							mensaje.imagen1.setSource(new ExternalResource(M.get(idM).getFoto1()));
						}
						if(!(M.get(idM).getFoto2() == null || M.get(idM).getFoto2() == "")) {
							mensaje.imagen2.setSource(new ExternalResource(M.get(idM).getFoto2()));
						}
							
						if(!(M.get(idM).getFoto3() == null || M.get(idM).getFoto3() == "")) {
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
			}
			}
			idM++;
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