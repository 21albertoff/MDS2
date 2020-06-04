package com.mds.foro;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class Visualizar_seccion__Usuario_identificado_ extends Visualizar_seccion_Ventana implements View {

	// Declaracion de variables
	iElementos_fijos Elementos_fijos;
	iUsuario_identificado usuarioidentificado;
	private int idSeccion;
	private String tituloSeccion;
	private String iconoSeccion;

	// Inicializacion
	public void inicializar() {
		usuarioidentificado = new DB_Main();
		Elementos_fijos = new DB_Main();
		idSeccion = Parametros.getIdSeccion();
		tituloSeccion = Parametros.getTituloSeccion();
		iconoSeccion = Parametros.getIconoSeccion();
		crearTema.setVisible(true);
		menuUsuarioIdentificado.setVisible(true);
		menuUsuarioNoIdentifado.setVisible(false);
	}

	public Visualizar_seccion__Usuario_identificado_() {
		inicializar();
		iconoS.setSource(new ExternalResource(iconoSeccion));
		tituloS.setValue(tituloSeccion);
		cargarSeccionesDestacadas();
		ordenarPor.setItems("Titulo", "Me gustas", "Fecha");
		consultarTemas();

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

		crearTema.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Crear_tema());
			}
		});

		nombreForo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				addComponent(new Usuario_registrado());
			}
		});
		
		ordenarPor.addValueChangeListener(event -> {
		    if (event.getValue() == "Titulo" ) {
		        Parametros.setOrdenarPor("Titulo");
		        addComponent(new Visualizar_seccion__Usuario_identificado_());
		        
		    }else if (event.getValue() == "Me gustas") {
		        Parametros.setOrdenarPor("Me gustas");
		        addComponent(new Visualizar_seccion__Usuario_identificado_());
		    }else {
		    	Parametros.setOrdenarPor("");
		        addComponent(new Visualizar_seccion__Usuario_identificado_());
		    }
		});
	}

	// consultarTemas
	private void consultarTemas() {
		List<TemaDB> T = usuarioidentificado.consultar_T_UI(idSeccion);
		if (Parametros.getOrdenarPor()=="Titulo") {
			Comparador com;
			com = new Comparador("Titulo");
			 T.sort(com);
		}
		if (Parametros.getOrdenarPor()=="Me gustas") {
			Comparador com;
			com = new Comparador("Me gustas");
			T.sort(com);
		}
		int idT = T.size() - 1;
		while (idT >= 0) {
			if (T.get(idT).getEliminado() == false) {
				if(T.get(idT).getOculto() == false) {
			
				Tema tema = new Tema();
				tema.imagenTema.setSource(new ExternalResource(Parametros.getIconoSeccion()));
				tema.nombreTema.setCaption(T.get(idT).getTema());
				Usuario_DB Usuario = (T.get(idT).getCreado_por());
				tema.imagenUsuario.setSource(new ExternalResource(Usuario.getFoto()));
				tema.nombreUsuario.setValue(Usuario.getNombreUsuario());
				int cantidadLike = T.get(idT).getCantidadLike();
				String cantidadLikeTexto = "" + cantidadLike;
				tema.cantidadMeGustas.setValue(cantidadLikeTexto);
				Usuario_DB usuario = T.get(idT).getCreado_por();
				
				int idUsuario = usuario.getORMID();
				
				if(!(idUsuario == Parametros.getIdUsuario())) {
					tema.botonEliminarTema.setVisible(false);
					tema.botonEliminarOculto.setVisible(true);

				} else {
					tema.botonEliminarOculto.setVisible(false);
					tema.botonEliminarTema.setVisible(true);
				}
				verticalTemas.addComponent(tema);

				final int id = idT;
				tema.nombreTema.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdTema(T.get(id).getORMID());
						Parametros.setTituloTema(T.get(id).getTema());
						Parametros.setIconoTema(Usuario.getFoto());
						Parametros.setNombreUsuarioTema(Usuario.getNombreUsuario());
						Parametros.setDescripcionTema(T.get(id).getDescripcion());
						Parametros.setUsuarioTema(idUsuario);
						Parametros.setLikeTema(T.get(id).getCantidadLike());
						Parametros.setTipoPermiso(T.get(id).getCreado_por().getPermiso());
						
						if(Parametros.getTipoUsuario()==1)
						addComponent(new Visualizar_tema_y_mensajes__Usuario_identificado_());
						
						if(Parametros.getTipoUsuario()==2)
							addComponent(new Visualizar_tema_y_mensajes__Moderador_());
						
					}
				});
				
				tema.botonEliminarTema.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						Parametros.setIdTema(T.get(id).getORMID());
						addComponent(new Eliminar_tema());
					}
				});

			}
			
			}
			idT--;
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
						
						addComponent(new Visualizar_seccion__Usuario_identificado_());
						
					}
				});

				cuatro++;
			}

			idSD--;
		}
	}
}