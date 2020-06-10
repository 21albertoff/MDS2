package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Panel_de_control extends Panel_de_control_ventana {

	// Declaraciones
	iAdministrador admin;
	private int idModerador;
	private int idTemaOculto;
	private int idMensajeOculto;

	// Inicializacion
	public void inicializar() {
		admin = new DB_Main();
	}

	// Constructor
	public Panel_de_control() {
		inicializar();
		consultarListaModeradores();
		consultarTemasOcultos();
		consultarMensajesOcultos();
		consultarUsuariosNotificados();

		// Ocultar
		tituloModeradores.setVisible(true);
		tituloTemas.setVisible(false);
		tituloMensajes.setVisible(false);
		tituloNotificados.setVisible(false);

		panelTemasOcultos.setVisible(false);
		panelMensajesOcultos.setVisible(false);
		panelUsuariosNotificados.setVisible(false);
		panelModeradores.setVisible(true);

		// Botones del constructor
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

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Administrador());
			}
		});

		moderadores.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Mostrar panel
				panelTemasOcultos.setVisible(false);
				panelMensajesOcultos.setVisible(false);
				panelUsuariosNotificados.setVisible(false);
				panelModeradores.setVisible(true);

				// Mostrar titulo
				tituloModeradores.setVisible(true);
				tituloTemas.setVisible(false);
				tituloMensajes.setVisible(false);
				tituloNotificados.setVisible(false);

			}
		});

		temaOculto.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Mostrar panel
				panelTemasOcultos.setVisible(true);
				panelMensajesOcultos.setVisible(false);
				panelUsuariosNotificados.setVisible(false);
				panelModeradores.setVisible(false);

				// Mostrar titulo
				tituloModeradores.setVisible(false);
				tituloTemas.setVisible(true);
				tituloMensajes.setVisible(false);
				tituloNotificados.setVisible(false);

			}
		});

		mensajeOculto.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Mostrar panel
				panelTemasOcultos.setVisible(false);
				panelMensajesOcultos.setVisible(true);
				panelUsuariosNotificados.setVisible(false);
				panelModeradores.setVisible(false);

				// Mostrar titulo
				tituloModeradores.setVisible(false);
				tituloTemas.setVisible(false);
				tituloMensajes.setVisible(true);
				tituloNotificados.setVisible(false);
			}
		});

		usuarioNotificado.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// Mostrar panel
				panelTemasOcultos.setVisible(false);
				panelMensajesOcultos.setVisible(false);
				panelUsuariosNotificados.setVisible(true);
				panelModeradores.setVisible(false);

				// Mostrar titulo
				tituloModeradores.setVisible(false);
				tituloTemas.setVisible(false);
				tituloMensajes.setVisible(false);
				tituloNotificados.setVisible(true);

			}
		});
	}

	// Consultar lista de moderadores
	private void consultarListaModeradores() {
		List<Usuario_DB> mod = admin.consultar_Mo();
		int idMod = 0;
		while (idMod < mod.size()) {

			// Creacion del componente
			ModeradorE moderador = new ModeradorE();

			// Elementos del componente
			moderador.imagenUsuario.setSource(new ExternalResource(mod.get(idMod).getFoto()));
			moderador.nombreUsuario.setValue(mod.get(idMod).getNombreUsuario());

			// Añadir el componente
			verticalModeradores.addComponent(moderador);

			// Botones del componente
			final int id = idMod;
			moderador.eliminarModerador.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					idModerador = mod.get(id).getIdUsuario();
					eliminarModerador();
				}
			});
			idMod++;
		}
	}

	// Eliminar moderador
	private void eliminarModerador() {
		admin.quitar_moderador(idModerador);
		addComponent(new Panel_de_control());
		Notification.show("El usuario ya no es moderador", "", Notification.Type.WARNING_MESSAGE);

	}

	// Consultar temas ocultos
	private void consultarTemasOcultos() {
		List<TemaDB> t = admin.consultar_TO();
		int idT = 0;
		while (idT < t.size()) {

			// Creacion del componente
			Tema_oculto tema = new Tema_oculto();

			// Elementos del componente
			tema.fotoUsuario.setSource(new ExternalResource(t.get(idT).getCreado_por().getFoto()));
			tema.nombreTema.setValue(t.get(idT).getTema());

			// Añadir el componente
			verticalTemasOcultos.addComponent(tema);

			// Botones del componente
			final int id = idT;
			tema.mostrarTema.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					idTemaOculto = t.get(id).getORMID();
					mostrarTemaOculto();
				}
			});
			idT++;
		}
	}

	// Mostrar temas ocultos
	private void mostrarTemaOculto() {
		admin.mostrar_tema(idTemaOculto);
		addComponent(new Panel_de_control());
		Notification.show("El tema ha dejado de ser oculto", "", Notification.Type.WARNING_MESSAGE);

	}

	// Consultar mensajes ocultos
	private void consultarMensajesOcultos() {
		List<MensajeDB> m = admin.consultar_MO();
		int idM = 0;
		while (idM < m.size()) {

			// Creacion del componente
			Mensaje_oculto mensaje = new Mensaje_oculto();

			// Elementos del componente
			mensaje.imagenUsuario.setSource(new ExternalResource(m.get(idM).getCreado_por().getFoto()));
			mensaje.mensajeUsuario.setValue(m.get(idM).getMensaje());

			// Añadir el componente
			verticalMensajesOcultos.addComponent(mensaje);

			// Botones del componente
			final int id = idM;
			mensaje.mostrarMensaje.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					idMensajeOculto = m.get(id).getORMID();
					mostrarMensajeOculto();
				}
			});
			idM++;
		}
	}

	// Mostrar mensajes ocultos
	private void mostrarMensajeOculto() {
		admin.mostrar_mensaje(idMensajeOculto);
		addComponent(new Panel_de_control());
		Notification.show("El mensaje ha dejado de ser oculto", "", Notification.Type.WARNING_MESSAGE);

	}

	// Consultar usuarios notificados
	private void consultarUsuariosNotificados() {
		List<Usuario_registradoDB> u = admin.consultar_UN();
		int idU = 0;
		while (idU < u.size()) {
			String motivo = u.get(idU).getMotivo();
			if (!(motivo.contains("-"))) {

				// Creacion del componente
				Usuario_notificado usuario = new Usuario_notificado();

				// Elementos del componente
				usuario.imagenUsuario.setSource(new ExternalResource(u.get(idU).getFoto()));
				usuario.nombreUsuario.setValue(u.get(idU).getNombreUsuario());
				usuario.motivoBaneo.setValue(u.get(idU).getMotivo());

				// Añadir el componente
				verticalUsuariosNotificados.addComponent(usuario);

				// Botones del componente
				final int id = idU;
				usuario.banearUsuario.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setVolverBaneo(2);
						Parametros.setIdBaneado(u.get(id).getIdUsuario());
						addComponent(new Banear_usuario());
					}
				});
			}
			idU++;

		}
	}

}