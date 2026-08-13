package com.xideral.cinehub.v0;

public class Pelicula extends Contenido {

	private int minDuracion;
	private String genero;
	
	public Pelicula(String titulo, String descripcion, int anio, double calificacion, int minDuracion, String genero) {
		super(titulo, descripcion, anio, calificacion);
		this.minDuracion = minDuracion;
		this.genero = genero;
	}

	public int getMinDuracion() {
		return minDuracion;
	}

	public void setMinDuracion(int minDuracion) {
		this.minDuracion = minDuracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
