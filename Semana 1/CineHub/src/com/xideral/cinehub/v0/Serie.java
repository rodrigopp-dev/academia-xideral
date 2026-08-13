package com.xideral.cinehub.v0;

import java.util.List;

public class Serie extends Contenido {
	
	private String genero;
	private List<Episodio> episodios;
	private int numEpisodios;
	
	public Serie(String titulo, String descripcion, int anio, double calificacion, String genero,
			List<Episodio> episodios) {
		super(titulo, descripcion, anio, calificacion);
		this.genero = genero;
		this.episodios = episodios;
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
