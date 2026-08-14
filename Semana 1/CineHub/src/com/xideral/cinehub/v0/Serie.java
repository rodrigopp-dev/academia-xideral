package com.xideral.cinehub.v0;

import java.util.List;

public class Serie extends Contenido implements Reproducible {
	
	private String genero;//Has-A
	private List<Episodio> episodios; //Has-A
	private int numEpisodios; //Has-A
	
	public Serie(String titulo, String descripcion, int anio, double calificacion, String genero,
			List<Episodio> episodios) {
		super(titulo, descripcion, anio, calificacion);
		this.genero = genero;
		this.episodios = episodios;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo serie: " + getTitulo());

	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	public int getNumEpisodios() {
		return numEpisodios;
	}

	public void setNumEpisodios(int numEpisodios) {
		this.numEpisodios = numEpisodios;
	}

}
