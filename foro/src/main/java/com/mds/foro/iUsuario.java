package com.mds.foro;

public interface iUsuario extends iElementos_fijos {

	public Seccion_fija[] consultar_SF();

	public Ultima_seccion[] consultar_US();

	public Tema[] consultar_T(int aIdSeccion);

	public Mensaje[] consultar_M(int aIdTema);
}