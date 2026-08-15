package com.xideral.cinehub.v0;

public interface Calificable {

	default void calificar() {
		// Object valor = this.getClass().getMethod("getTitulo").invoke(this);
		System.out.println("Calificando " + this.getClass().getSimpleName());
	}
}
