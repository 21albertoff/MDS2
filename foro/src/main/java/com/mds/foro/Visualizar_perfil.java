package com.mds.foro;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_perfil extends Visualizar_perfil_ventana{
	
	/**Declaracion de variables
	private Button _addAmigo;
	private Image _imagenUsuario;
	private Label _nombreUsuarioL;
	private Label _descripcionPrivadaL;
	public Mensaje_no_propietario _unnamed_Mensaje_no_propietario_;**/
	
	iUsuario_identificado usuarioidentificado;
	iUsuario_registrado registrado;
	private int idUsuario;
	private int idUsuarioAmigo;
	Usuario_DB amigo;
	Usuario_DB yo;
	
	//Inicializacion
	public void inicializar() {
		usuarioidentificado = new DB_Main();
		registrado = new DB_Main();

		idUsuario = Parametros.getIdUsuario();
		idUsuarioAmigo = Parametros.getPerfilUsuario();

		menuUsuarioIdentificado.setVisible(true);
		menuUsuarioNoIdentifado.setVisible(false);
		menuUsuarioAdministrador.setVisible(false);
		menuUsuarioModerador.setVisible(false);
	}
	
	public Visualizar_perfil() {
		inicializar();
		
		amigo = consultar_Amigo(idUsuarioAmigo);
		yo = consultar_Amigo(idUsuario);
		if(yo.amigo_de.contains(amigo)) {
			addComponent(new Visualizar_perfil_amigo());
		}
		nickUsuario.setValue(amigo.getNombreUsuario());
		descripcionUsuario.setValue(amigo.getDescripcion());
		imagenPerfil.setSource(new ExternalResource(amigo.getFoto()));
		
		addAmigo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addAmigo();
				Parametros.setIdMiAmigo(idUsuarioAmigo);
				addComponent(new Visualizar_perfil());
			}
		});
		
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

	private Usuario_DB consultar_Amigo(int idUsuarioAmigo2) {
		return usuarioidentificado.consultar_Amigo(idUsuarioAmigo2);
	}
		
	public void addAmigo() {
		usuarioidentificado.enviar_solicitud(idUsuario, idUsuarioAmigo);
	}
}