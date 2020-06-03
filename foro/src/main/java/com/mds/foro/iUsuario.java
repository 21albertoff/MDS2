package com.mds.foro;

import java.util.List;

public interface iUsuario extends iElementos_fijos {

	/**SECCIONES**/
	//Consultar secciones fijas
	public List<SeccionDB> consultar_SF();

	//Consultar ultimas secciones
	public List<SeccionDB> consultar_US();
	
	/**TEMAS**/
	//Consultar temas
	public List<TemaDB> consultar_T(int idSeccion);

	/**MENSAJES**/
	//Consultar mensajes
	public List<MensajeDB> consultar_M(int idTema);
}