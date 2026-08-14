package com.xideral.cinehub.v0;

public abstract class Contenido {
	
	protected String titulo;
	private String descripcion;
	private int anio;
	private double calificacion;
	
	public Contenido(String titulo, String descripcion, int anio, double calificacion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.anio = anio;
		this.calificacion = calificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
}
