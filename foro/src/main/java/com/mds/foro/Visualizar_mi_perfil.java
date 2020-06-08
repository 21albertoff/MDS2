package com.mds.foro;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.TextArea;

@SuppressWarnings("serial")
public class Visualizar_mi_perfil extends Visualizar_mi_perfil_ventana {
	
	/**Declaracion de variables
	private Image _fotoPerfil;
	private Button _modificarFoto;
	private TextArea _modificarDescripcion;
	private Button _guardarCambios;
	private Button _listaAmigosB;
	private Label _ultimosMensajes;
	public Mis_mensajes _misMensajes;
	private Label _datosPersonales;
	private CheckBox _activarNotificaciones;
	private CheckBox _perfilOculto;
	private Link _cambiarPasswordL;**/
	
	iUsuario_identificado usuarioidentificado;
	private String nombreUsuario;
	private String nombreCompleto;
	private String descripcion;
	private String fotoPerfil;
	private boolean perfilOculto;
	private boolean notificaciones;
	
	//Inicializacion
	public void inicializar() {
		usuarioidentificado = new DB_Main();
		
		nombreUsuario = Parametros.getNombreUsuario();
		nombreCompleto = Parametros.getNombreCompleto();
		descripcion = Parametros.getDescripcionUsuario();
		fotoPerfil = Parametros.getFotoPerfil();
		perfilOculto = Parametros.getPerfilOculto();
		notificaciones = Parametros.getActivar_Desactivar_Notificacion();
		
		textoUltimosMensajes.setVisible(true);
		verticalUltimosMensajes.setVisible(true);
		textoMisAmigos.setVisible(false);
		verticalMisAmigos.setVisible(false);
		
		if (Parametros.getTipoUsuario() == 1) {
			menuUsuarioIdentificado.setVisible(true);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioAdministrador.setVisible(false);
			menuUsuarioModerador.setVisible(false);
			eliminarCuenta.setVisible(true);
			nombreUsuarioCompleto.setVisible(true);

		} else if (Parametros.getTipoUsuario() == 2) {
			menuUsuarioModerador.setVisible(true);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioIdentificado.setVisible(false);
			menuUsuarioAdministrador.setVisible(false);
			eliminarCuenta.setVisible(true);
			nombreUsuarioCompleto.setVisible(true);
			
		} else if (Parametros.getTipoUsuario() == 3) {
			menuUsuarioModerador.setVisible(false);
			menuUsuarioNoIdentifado.setVisible(false);
			menuUsuarioIdentificado.setVisible(false);
			menuUsuarioAdministrador.setVisible(true);
			eliminarCuenta.setVisible(false);
			nombreUsuarioCompleto.setVisible(false);
		}
	}
	
	//Constructor
	public Visualizar_mi_perfil() {
		inicializar();
		
		imagenPerfil.setSource(new ExternalResource(fotoPerfil));
		nickUsuario.setValue(nombreUsuario);
		descripcionUsuario.setValue(descripcion);
		nombreUsuarioCompleto.setValue(nombreCompleto);
		
	}

	public void modificar_foto() {
		throw new UnsupportedOperationException();
	}

	public void modificar_descripcion() {
		throw new UnsupportedOperationException();
	}

	public void Activar_Desactivar_notificaciones() {
		throw new UnsupportedOperationException();
	}

	public void Activar_Desactivar_notificaciones_por_correo() {
		throw new UnsupportedOperationException();
	}

	public void perfil_oculto() {
		throw new UnsupportedOperationException();
	}
}