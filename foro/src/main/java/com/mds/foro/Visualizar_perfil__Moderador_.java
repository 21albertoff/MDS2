package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_perfil__Moderador_ extends Visualizar_perfil_amigo_Ventana {
	// Declaracion de variables
		iUsuario_identificado usuarioidentificado;
		iUsuario_registrado registrado;
		iModerador moderador;
		private int idUsuario;
		private int idUsuarioAmigo;
		Usuario_DB amigo;

		// Inicializador
		public void inicializar() {
			usuarioidentificado = new DB_Main();
			registrado = new DB_Main();
			moderador = new DB_Main();

			idUsuario = Parametros.getIdUsuario();
			idUsuarioAmigo = Parametros.getIdMiAmigo();

			menuUsuarioIdentificado.setVisible(false);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioAdministrador.setVisible(false);
			menuUsuarioModerador.setVisible(false);
			banearUsuario.setVisible(false);
			ponerModerador.setVisible(false);
			guardarCambios.setVisible(false);
			notificarUsuario.setVisible(false);

			List<Usuario_DB> amigos = consultar_si_es_amigo();

			amigo = consultar_Amigo();

			if (!amigos.contains(amigo)) {
				eliminarAmigo.setVisible(false);
				if(amigo.getPerfil_oculto()) {
					agregarAmigo.setVisible(false);
				} else {
					agregarAmigo.setVisible(true);
				}
			}

			if (Parametros.getTipoUsuario() == 2) { 
				menuUsuarioModerador.setVisible(true);
				notificarUsuario.setVisible(true);
			}
		}

		//Consultar si es amigo
		private List<Usuario_DB> consultar_si_es_amigo() {
			List<Usuario_DB> amigos = usuarioidentificado.consultar_A(idUsuario);
			return amigos;
		}

		// Constructor
		public Visualizar_perfil__Moderador_() {
			inicializar();

			consultar_MA();

			imagenPerfil.setSource(new ExternalResource(amigo.getFoto()));
			nickUsuario.setValue(amigo.getNombreUsuario());
			descripcionUsuario.setValue(amigo.getDescripcion());
			ponerModerador.setValue(amigo.getPermiso() == 2);
			tituloMensajesUsuario.setValue("ULTIMOS MENSAJE DE " + amigo.getNombreUsuario());

			// Eliminar amigo
			eliminarAmigo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					eliminar_amigo();
					Parametros.setPerfilUsuario(idUsuarioAmigo);
					if (Parametros.getTipoUsuario() == 2) {
						addComponent(new Visualizar_perfil__Moderador_());
					}
				}
			});

			// Enviar solicitud de amistad
			agregarAmigo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					agregar_amigo();
					agregarAmigo.setEnabled(false);
					Parametros.setPerfilUsuario(amigo.getIdUsuario());
					Notification.show("Se ha enviado una solicitud al usuario " + amigo.getNombreUsuario() + ".", "",Notification.Type.WARNING_MESSAGE);
				}
			});

			// Menu Moderador
			if (Parametros.getTipoUsuario() == 2) {
				notificarUsuario.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdNotificado(idUsuarioAmigo);
						Parametros.setVolverBaneo(3);
						addComponent(new Notificar_usuario());
					}
				});
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
						addComponent(new Moderador());
					}
				});
			}

		}

		// Consultar usuario del perfil
		private Usuario_DB consultar_Amigo() {
			return usuarioidentificado.consultar_Amigo(idUsuarioAmigo);
		}

		// Eliminar amiguito
		private void eliminar_amigo() {
			usuarioidentificado.eliminar_amigoP(idUsuario, idUsuarioAmigo);
			addComponent(new Visualizar_mi_perfil__Moderador_());
		}

		// Enviar solicitud de amistad
		private void agregar_amigo() {
			usuarioidentificado.enviar_solicitud(Parametros.getIdUsuario(), Parametros.getPerfilUsuario());
		}

		// Consultar los mensaje de mi amiguito
		private void consultar_MA() {
			List<MensajeDB> MisM = usuarioidentificado.consultar_MisM(idUsuarioAmigo);
			int idM = MisM.size() - 1;
			int cuatro = 0;
			while (idM >= 0 && cuatro < 4) {
				if (cuatro == 4) {
					break;
				}
				if (MisM.get(idM).getEliminado() == false) {
					if (MisM.get(idM).getOculto() == false) {

						Mi_mensaje mensaje = new Mi_mensaje();
						mensaje.imagenTema.setSource(new ExternalResource(MisM.get(idM).getCreado_por().getFoto()));
						mensaje.mensaje.setValue(MisM.get(idM).getMensaje());
						mensaje.temaMensaje.setValue(MisM.get(idM).getContieneM().getTema());
						verticalMensajesAmigos.addComponent(mensaje);

						cuatro++;
					}
				}

				idM--;
			}
		}
}