package com.mds.foro;

import java.util.List;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_perfil_amigo extends Visualizar_perfil_amigo_Ventana {
	
	/**Declaracion de variables
	private Button _eliminarAmigo;
	private Image _fotoPerfil;
	private Label _nombreUsuarioL;
	private Label _descripcionL;
	public Mensaje_no_propietario _unnamed_Mensaje_no_propietario_;
	public Amigo _unnamed_Amigo_;
	public Mensajes_amigo _verMensajesAmigo;**/

	iUsuario_identificado usuarioidentificado;
	iUsuario_registrado registrado;
	iModerador moderador;
	iAdministrador Admin;
	private int idUsuario;
	private int idUsuarioAmigo;
	private int permiso;
	Usuario_DB amigo;
	
	//Inicializacion
	public void inicializar() {
		usuarioidentificado = new DB_Main();
		registrado = new DB_Main();
		Admin = new DB_Main();
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
		
		if(!amigos.contains(amigo)) {
			eliminarAmigo.setVisible(false);
			agregarAmigo.setVisible(true);
		}
		
		if (Parametros.getTipoUsuario() == 1) {
			menuUsuarioIdentificado.setVisible(true);
		} else if (Parametros.getTipoUsuario() == 2) {
			menuUsuarioModerador.setVisible(true);
			notificarUsuario.setVisible(true);
			
		} else if (Parametros.getTipoUsuario() == 3) {
			banearUsuario.setVisible(true);
			ponerModerador.setVisible(true);
			guardarCambios.setVisible(true);
			menuUsuarioAdministrador.setVisible(true);
		}
	}
	@SuppressWarnings("unchecked")
	private List<Usuario_DB> consultar_si_es_amigo() {
		List<Usuario_DB> amigos = usuarioidentificado.consultar_A(idUsuario);
		return amigos;
	}

	//Constructor
	public Visualizar_perfil_amigo() {
		inicializar();
		
		
		consultar_MA();
		
		imagenPerfil.setSource(new ExternalResource(amigo.getFoto()));
		nickUsuario.setValue(amigo.getNombreUsuario());
		descripcionUsuario.setValue(amigo.getDescripcion());
		ponerModerador.setValue(amigo.getPermiso()==2);
		tituloMensajesUsuario.setValue("ULTIMOS MENSAJE DE "+amigo.getNombreUsuario());
		
		eliminarAmigo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				eliminar_amigo();
				if (Parametros.getTipoUsuario() == 1) {
					addComponent(new Visualizar_perfil());
				}
				if (Parametros.getTipoUsuario() == 2) {
					addComponent(new Visualizar_perfil_amigo());
				}
				if (Parametros.getTipoUsuario() == 3) {
					addComponent(new Visualizar_perfil_amigo());
				}
			}
		});
		
		agregarAmigo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				agregar_amigo();
				if (Parametros.getTipoUsuario() == 2) {
					addComponent(new Visualizar_perfil_amigo());
				}
				if (Parametros.getTipoUsuario() == 3) {
					addComponent(new Visualizar_perfil_amigo());
				}
			}
		});

		//Usuario registrado
		if (Parametros.getTipoUsuario() == 1) {
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
					addComponent(new Usuario_registrado());
				}
			});
		}
		
		
		//Administrador
		if (Parametros.getTipoUsuario() == 3) {
			banearUsuario.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					Parametros.setIdBaneado(idUsuarioAmigo);
					Parametros.setVolverBaneo(3);
					addComponent(new Banear_usuario());

				}
			});
			guardarCambios.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					if(ponerModerador.getValue()) {
						permiso = 2;
					} else {
						permiso = 1;
					}
					if(permiso != amigo.getPermiso()) {
						cambiar_moderador();
					}
					addComponent(new Visualizar_perfil_amigo());

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
		
			nombreForo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					addComponent(new Administrador());
				}
			});
		}
		
		//Moderador
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
					addComponent(new Visualizar_mi_perfil());

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
	
	private Usuario_DB consultar_Amigo() {
		return usuarioidentificado.consultar_Amigo(idUsuarioAmigo);
	}
	
	private void cambiar_moderador() {
		Admin.Asignar_Desasignar_moderador(idUsuarioAmigo);		
	}

	//Eliminar amiguito
	private void eliminar_amigo() {
		usuarioidentificado.eliminar_amigoP(idUsuario, idUsuarioAmigo);
		addComponent(new Visualizar_mi_perfil());
	}
	
	private void agregar_amigo() {
		usuarioidentificado.agregar_amigo(idUsuario, idUsuarioAmigo);		
	}

	@SuppressWarnings("unchecked")
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