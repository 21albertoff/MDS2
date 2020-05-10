package com.mds.foro;

public class DB_Main implements iUsuario_no_identificado, iCorreo, iElementos_fijos, iUsuario, iUsuario_identificado, iModerador, iUsuario_registrado, iAdministrador {
	public DB_Temas _bd_temas;
	public DB_Administradores _bd_administradores;
	public DB_UsuariosNotificados _bd_usuarios_notificados;
	public DB_Secciones _bd_secciones;
	public DB_Notificaciones _bd_notificaciones;
	public DB_Mensajes _bd_mensajes;
	public DB_UsuariosRegistrados _bd_usuarios_registrados;


	//Usuario no identificado
	
	public boolean registrarse(String aNombreUsuario, String aNombreCompleto, String aCorreo, String aContrasenia, String aDescripcion, String aFoto){ 
		throw new UnsupportedOperationException(); 
	}

	public boolean iniciar_sesion(String aNombreUsuario, String aContrasenia){ 
		throw new UnsupportedOperationException(); 
	}

	public boolean recuperarContrasenia(String aCorreoElectronico){ 
		throw new UnsupportedOperationException(); 
	}
	
	//Correo
	
	public void enviar_Mensaje(String aPassword){ 
		throw new UnsupportedOperationException(); 
	}
	
	//Elementos fijos
	
    public Seccion_destacada[] consultar_SD(){ 
    	throw new UnsupportedOperationException(); 
    }
	
	//Usuario
	
	public Seccion_fija[] consultar_SF(){ 
		throw new UnsupportedOperationException(); 
	}

	public Ultima_seccion[] consultar_US(){
		throw new UnsupportedOperationException(); 
	}

	public Tema consultar_T(){
		throw new UnsupportedOperationException(); 
	}

	public Mensaje consultar_M(){
		throw new UnsupportedOperationException(); 
	}
	
	//Usuario identificado
	
	public Tema__Usuario_identificado_[] consultar_T_UI(){
		throw new UnsupportedOperationException(); 
	}

	public Mensaje__Usuario_identificado_[] consultar_M_UI(){
		throw new UnsupportedOperationException(); 
	}

	public Mensaje_amigo[] consultar_MA(){
		throw new UnsupportedOperationException(); 
	}

	public Notificacion[] consultar_N(){
		throw new UnsupportedOperationException(); 
	}

	public Amigo[] consultar_A(){
		throw new UnsupportedOperationException(); 
	}

	public Mi_mensaje[] consultar_MisM(){
		throw new UnsupportedOperationException(); 
	}

	public boolean guardar_tema(String aTituloTema, String aSubtituloTema){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_propio_tema(int aIdTema){
		throw new UnsupportedOperationException(); 
	}

	public boolean agregar_fotos(String aFotos){
		throw new UnsupportedOperationException(); 
	}

	public boolean agregar_video(String aVideo){
		throw new UnsupportedOperationException();
		}

	public boolean agregar_amigo(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_amigoP(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_amigo(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public boolean modificar_foto(String aFoto){
		throw new UnsupportedOperationException(); 
	}

	public boolean modificar_descripcion(String aDescripcion){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_notificacion(int aIdNotificacion){
		throw new UnsupportedOperationException(); 
	}

	public boolean cambiar_contrasenia(String aContrasenia){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_mi_mensaje(int aIdMensaje){
		throw new UnsupportedOperationException(); 
	}

	public boolean crear_mensaje(String aMensaje, String aFotos, String aVideo){
		throw new UnsupportedOperationException(); 
	}

	public void valorar_tema(){
		throw new UnsupportedOperationException(); 
	}

	public void valorar_mensaje(){
		throw new UnsupportedOperationException(); 
	}

	public boolean citar_tema(String aMensaje, String aFotos, String aVideo, String aTema){
		throw new UnsupportedOperationException(); 
	}

	public boolean citar_mensaje(String aMensaje, String aFotos, String aVideo, String aMensajeCitado){
		throw new UnsupportedOperationException(); 
	}

	public void Activar_Desactivar_notificaciones(){
		throw new UnsupportedOperationException(); 
	}

	public void Activar_Desactivar_por_correo(){
		throw new UnsupportedOperationException(); 
	}

	public void perfil_oculto(){
		throw new UnsupportedOperationException(); 
	}
	
	//Usuario registrado
	
    public Mensaje_no_propietario__Usuario_registrado_[] consulta_M_UR(){
    	throw new UnsupportedOperationException(); 
    }

	public void reportar_mensaje(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_perfil(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public boolean modificar_nombre(String aNombreUsuario, String aNewNombreUsuario){
		throw new UnsupportedOperationException(); 
	}
	
	//Moderador
	
	public Usuario_reportado[] consultar_UR(){
		throw new UnsupportedOperationException(); 
	}

	public Mensaje_no_propietario__Moderador_[] consultar_M_Mo(){
		throw new UnsupportedOperationException(); 
	}

	public Mensaje_usuario[] consultar_MU(){
		throw new UnsupportedOperationException(); 
	}

	public boolean modificar_nombre(boolean aNombreUsuario, String aNewNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public void notificar(String aNombreUsuario, String aMotivo){
		throw new UnsupportedOperationException(); 
	}

	public void eliminar_reporte(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public void ocultar_tema(int aIdTema){
		throw new UnsupportedOperationException(); 
		}

	public void ocultar_mensaje(int aIdMensaje){
		throw new UnsupportedOperationException(); 
	}
	
	//Administrador

	public Mensaje__Administrador_[] consultar_M_A(){
		throw new UnsupportedOperationException(); 
	}

	public Tema__Administrador_[] consultar_T_A(){
		throw new UnsupportedOperationException(); 
	}

	public Seccion_fija__Administrador_[] consultar_SF_A(){
		throw new UnsupportedOperationException(); 
	}

	public Ultima_seccion__Administrador_[] consultar_US_A(){
		throw new UnsupportedOperationException(); 
	}

	public ModeradorE[] consultar_Mo(){
		throw new UnsupportedOperationException();
	}

	public Tema_oculto[] consultar_TO(){
		throw new UnsupportedOperationException(); 
	}

	public Mensaje_oculto[] consultar_MO(){
		throw new UnsupportedOperationException(); 
	}

	public Usuario_notificado[] consultar_UN(){
		throw new UnsupportedOperationException();
	}

	public void Asignar_Desasignar_moderador(){
		throw new UnsupportedOperationException(); 
	}

	public void cambiar_num_mensajes(int aCantidad){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_mensaje(int aIdMensaje){
		throw new UnsupportedOperationException(); 
	}

	public void cambiar_estado_tema(int aIdTema){
		throw new UnsupportedOperationException(); 
	}

	public void cerrar_tema(int aIdTema){
		throw new UnsupportedOperationException(); 
	}

	public boolean eliminar_tema(int aIdTema){
		throw new UnsupportedOperationException(); 
	}

	public void banear_usuario(String aTiempo){
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_seccion(int aIdSeccion){
		throw new UnsupportedOperationException(); 
	}

	public void quitar_seccion_fija(Object aIdSeccion){
		throw new UnsupportedOperationException(); 
	}

	public boolean crear_seccion(String aTituloSeccion, String aIcono, boolean aFijarSeccion){
		throw new UnsupportedOperationException(); 
	}

	public void quitar_moderador(String aNombreUsuario){
		throw new UnsupportedOperationException(); 
	}

	public void mostrar_tema(int aIdTema){
		throw new UnsupportedOperationException(); 
	}

	public void mostrar_mensaje(int aIdMensaje){
		throw new UnsupportedOperationException();
	}
}