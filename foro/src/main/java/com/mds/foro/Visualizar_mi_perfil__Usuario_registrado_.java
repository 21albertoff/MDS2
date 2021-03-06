package com.mds.foro;

import java.util.List;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_mi_perfil__Usuario_registrado_ extends Visualizar_mi_perfil_ventana {

	// Declaracion de variables
		iUsuario_identificado usuarioidentificado;
		iUsuario_registrado registrado;
		private int idUsuario;
		private String nombreUsuario;
		private String nombreCompleto;
		private String descripcion;
		private String fotoPerfil;
		private boolean ocultarPerfil;
		private boolean notificaciones;

		// Inicializador
		public void inicializar() {
			usuarioidentificado = new DB_Main();
			registrado = new DB_Main();

			idUsuario = Parametros.getIdUsuario();
			nombreUsuario = Parametros.getNombreUsuario();
			nombreCompleto = Parametros.getNombreCompleto();
			descripcion = Parametros.getDescripcionUsuario();
			fotoPerfil = Parametros.getFotoPerfil();
			ocultarPerfil = Parametros.getPerfilOculto();
			notificaciones = Parametros.getActivar_Desactivar_Notificacion();

			textoUltimosMensajes.setVisible(true);
			verticalUltimosMensajes.setVisible(true);
			textoMisAmigos.setVisible(false);
			panelAmigos.setVisible(false);
			cambiarImagen.setVisible(false);

			if (Parametros.getTipoUsuario() == 1) {
				menuUsuarioIdentificado.setVisible(true);
				menuUsuarioNoIdentifado.setVisible(false);
				menuUsuarioAdministrador.setVisible(false);
				menuUsuarioModerador.setVisible(false);
				eliminarCuenta.setVisible(true);
				nombreUsuarioCompleto.setVisible(true);
			}
		}

		// Constructor
		public Visualizar_mi_perfil__Usuario_registrado_() {
			inicializar();

			consultar_MisM();

			imagenPerfil.setSource(new ExternalResource(fotoPerfil));
			cambiarImagen.setValue(fotoPerfil);
			nickUsuario.setValue(nombreUsuario);
			descripcionUsuario.setValue(descripcion);
			nombreUsuarioCompleto.setValue(nombreCompleto);
			perfilOculto.setValue(ocultarPerfil);
			activiarNotificaciones.setValue(notificaciones);

			// Cambiar mi foto de perfil
			cargarImagen.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					cambiarImagen.setVisible(true);
					;
				}
			});

			// Cambiar mi contrasenia
			cambiarPassword.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Cambiar_password());
				}
			});

			// Darse de baja
			eliminarCuenta.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Darse_de_baja());
				}
			});

			// Mostrar mi lista de amigos
			listaAmigos.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					textoUltimosMensajes.setVisible(false);
					verticalUltimosMensajes.setVisible(false);
					listaAmigos.setVisible(false);
					textoMisAmigos.setVisible(true);
					panelAmigos.setVisible(true);
					verticalMisAmigos.setVisible(true);
					listaMensajes.setVisible(true);
					consultar_amigos();

				}
			});

			// Mostrar mi lista de mensajes
			listaMensajes.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					textoUltimosMensajes.setVisible(true);
					verticalUltimosMensajes.setVisible(true);
					listaAmigos.setVisible(true);
					textoMisAmigos.setVisible(false);
					panelAmigos.setVisible(false);
					verticalMisAmigos.setVisible(false);
					listaMensajes.setVisible(false);
				}
			});

			// Guardar los cambios que realizo en mi perfil
			guardarCambios.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					if (cambiarImagen.getValue() != fotoPerfil) {
						fotoPerfil = cambiarImagen.getValue();
						Parametros.setFotoPerfil(fotoPerfil);
						modificar_foto();
					}
					if (descripcionUsuario.getValue() != descripcion) {
						descripcion = descripcionUsuario.getValue();
						Parametros.setDescripcionUsuario(descripcion);
						modificar_descripcion();
					}
					if (perfilOculto.getValue() != ocultarPerfil) {
						ocultarPerfil = perfilOculto.getValue();
						Parametros.setPerfilOculto(ocultarPerfil);
						perfil_oculto();
					}
					if (activiarNotificaciones.getValue() != notificaciones) {
						notificaciones = activiarNotificaciones.getValue();
						Parametros.setActivar_Desactivar_Notificacion(notificaciones);
						Parametros.setActivar_Desactivar_Notificacion_por_correo(notificaciones);
						Activar_Desactivar_notificaciones();
						Activar_Desactivar_notificaciones_por_correo();
					}
					if (nombreUsuarioCompleto.getValue() != nombreCompleto && Parametros.getTipoUsuario() != 3) {
						nombreCompleto = nombreUsuarioCompleto.getValue();
						Parametros.setNombreCompleto(nombreCompleto);
						modificarNombre();
					}
					cambiarImagen.setVisible(false);
					addComponent(new Visualizar_mi_perfil__Usuario_registrado_());
					Notification.show("Se ha cambiado todo con exito.", "", Notification.Type.WARNING_MESSAGE);
				}
			});

			// Menu Usuario registrado
			if (Parametros.getTipoUsuario() == 1) {
				menuCerrarSesionUsuario.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						addComponent(new Cerrar_sesion());

					}
				});

				menuMiPerfilUsuario.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						addComponent(new Visualizar_mi_perfil__Usuario_registrado_());

					}
				});

				menuNotificacionesUsuario.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						addComponent(new Notificaciones());

					}
				});

				nombreForo.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						addComponent(new Usuario_registrado());
					}
				});
			}
		}

		// Consultar la lista de mis amigos
		private void consultar_amigos() {
			List<Usuario_DB> amigos = usuarioidentificado.consultar_A(idUsuario);
			int idM = 0;
			if (!(amigos == null || amigos.size() == 0)) {
				while (idM < amigos.size()) {
					Amigo amigo = new Amigo();
					amigo.imagenAmigo.setSource(new ExternalResource(amigos.get(idM).getFoto()));
					amigo.nombreAmigo.setCaption(amigos.get(idM).getNombreUsuario());
					verticalMisAmigos.addComponent(amigo);

					final int idAmigo = idM;
					amigo.eliminarAmigo.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							eliminar_amigo(amigos.get(idAmigo).getIdUsuario());
						}
					});

					amigo.nombreAmigo.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							Parametros.setIdMiAmigo(amigos.get(idAmigo).getIdUsuario());
							addComponent(new Visualizar_perfil_amigo());
						}
					});
					idM++;
				}
			} else {
				textoUltimosMensajes.setVisible(true);
				verticalUltimosMensajes.setVisible(true);
				textoMisAmigos.setVisible(false);
				panelAmigos.setVisible(false);
				verticalMisAmigos.setVisible(false);
				Notification.show("☹️  Lo siento, no tienes amigos ☹️", Notification.Type.ERROR_MESSAGE);
			}
		}

		// Eliminar amiguito
		private void eliminar_amigo(int idAmigo) {
			usuarioidentificado.eliminar_amigoP(idUsuario, idAmigo);
			addComponent(new Visualizar_mi_perfil__Usuario_registrado_());
		}

		// Consultar la lista de mis mensajes
		private void consultar_MisM() {
			List<MensajeDB> MisM = usuarioidentificado.consultar_MisM(idUsuario);
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
						verticalUltimosMensajes.addComponent(mensaje);

						cuatro++;
					}
				}

				idM--;
			}
		}

		// Modificar mi foto de perfil
		public void modificar_foto() {
			usuarioidentificado.modificar_foto(idUsuario, fotoPerfil);
		}

		// Modificar mi descripcion
		public void modificar_descripcion() {
			usuarioidentificado.modificar_descripcion(idUsuario, descripcion);
		}

		// Cambiar si quiero o no recibir notificaciones
		public void Activar_Desactivar_notificaciones() {
			usuarioidentificado.Activar_Desactivar_notificaciones(idUsuario);
		}

		// Cambiar si quiero o no recibir notificaciones por correo
		public void Activar_Desactivar_notificaciones_por_correo() {
			usuarioidentificado.Activar_Desactivar_por_correo(idUsuario);
		}

		// Cambiar si quiero o no mi perfil oculto
		public void perfil_oculto() {
			usuarioidentificado.perfil_oculto(idUsuario);
		}

		// Modificar mi nombre completo
		public void modificarNombre() {
			registrado.modificar_nombre(idUsuario, nombreUsuario);
		}
}