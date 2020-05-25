package com.mds.foro;

import java.util.List;

public interface iUsuario extends iElementos_fijos {

	public List consultar_SF();

	public List consultar_US();

	public List consultar_T(int aIdSeccion);

	public List consultar_M(int aIdTema);
}