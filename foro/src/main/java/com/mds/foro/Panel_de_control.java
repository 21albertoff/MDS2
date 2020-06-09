package com.mds.foro;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
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

		//Menu superior 
		
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
				addComponent(new Visualizar_seccion__Administrador_());
			}
		});
		
		// Ocultar
		tituloModeradores.setVisible(true);
		tituloTemas.setVisible(false);
		tituloMensajes.setVisible(false);
		tituloNotificados.setVisible(false);

		panelTemasOcultos.setVisible(false);
		panelMensajesOcultos.setVisible(false);
		panelUsuariosNotificados.setVisible(false);
		panelModeradores.setVisible(true);

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

	//Consultar lista de moderadores
	private void consultarListaModeradores() {
		List<Usuario_DB> mod = admin.consultar_Mo();
		int idMod = 0;
		while (idMod < mod.size()) {
			ModeradorE moderador = new ModeradorE();
			
			moderador.imagenUsuario.setSource(new ExternalResource(mod.get(idMod).getFoto()));
			moderador.nombreUsuario.setValue(mod.get(idMod).getNombreUsuario());
			
			verticalModeradores.addComponent(moderador);
			
			//Consultas
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

	//Eliminar moderador 
	private void eliminarModerador() {
		admin.quitar_moderador(idModerador);
		addComponent(new Panel_de_control());
	}
	//Consultar temas ocultos
	private void consultarTemasOcultos() {
		List<TemaDB> t = admin.consultar_TO();
		int idT = 0;
		while (idT< t.size()) {
			Tema_oculto tema = new Tema_oculto();
			
			tema.fotoUsuario.setSource(new ExternalResource(t.get(idT).getCreado_por().getFoto()));
			tema.nombreTema.setValue(t.get(idT).getTema());
			
			verticalTemasOcultos.addComponent(tema);
			
			//Consultas
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
	
	//Mostrar temas ocultos
	private void mostrarTemaOculto() {
		admin.mostrar_tema(idTemaOculto);
		addComponent(new Panel_de_control());
	}

	//Consultar mensajes ocultos
	private void consultarMensajesOcultos() {
		List<MensajeDB> m = admin.consultar_MO();
		int idM = 0;
		while (idM< m.size()) {
			Mensaje_oculto mensaje = new Mensaje_oculto();
			
			mensaje.imagenUsuario.setSource(new ExternalResource(m.get(idM).getCreado_por().getFoto()));			
			mensaje.mensajeUsuario.setValue(m.get(idM).getMensaje());
			
			verticalMensajesOcultos.addComponent(mensaje);
			
			//Consultas
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
	
	//Mostrar mensajes ocultos
	private void mostrarMensajeOculto() {
		admin.mostrar_mensaje(idMensajeOculto);
		addComponent(new Panel_de_control());
	}

	//Consultar usuarios notificados
	private void consultarUsuariosNotificados() {
		List<Usuario_registradoDB> u = admin.consultar_UN();
		int idU = 0;
		while (idU< u.size()) {
			String motivo = u.get(idU).getMotivo();
			if(!(motivo.contains("-"))) {
			Usuario_notificado usuario = new Usuario_notificado();
			
			usuario.imagenUsuario.setSource(new ExternalResource(u.get(idU).getFoto()));			
			usuario.nombreUsuario.setValue(u.get(idU).getNombreUsuario());
			usuario.motivoBaneo.setValue(u.get(idU).getMotivo());

			verticalUsuariosNotificados.addComponent(usuario);
			
			//Consultas
			final int id = idU;
			usuario.banearUsuario.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					Parametros.setVolverBaneo(2);
					Parametros.setIdBaneado(u.get(id).getIdUsuario());
					addComponent(new Banear_usuario());
				}
			});
			idU++;
			}
		}
	}
	

}