package com.mds.foro;

import java.util.Comparator;

public class Comparador implements Comparator<TemaDB> {
	// Declaraciones
	String orden;

	// Constructor
	public Comparador(String tipo) {
		orden = tipo;
	}

	// Metodo compare
	@Override
	public int compare(TemaDB t1, TemaDB t2) {

		if (orden.equals("Me gustas")) {
			int tema1 = t1.getCantidadLike();
			int tema2 = t2.getCantidadLike();
			if (tema1 < tema2)
				return -1;
			if (tema1 > tema2)
				return 1;
			return 0;
		} else if (orden.equals("Titulo")) {
			return t2.getTema().compareTo(t1.getTema());
		}
		return 0;
	}

}