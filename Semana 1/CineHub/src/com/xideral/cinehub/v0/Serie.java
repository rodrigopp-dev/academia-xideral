package com.xideral.cinehub.v0;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido implements Reproducible {
	
	private String genero;//Has-A
	private List<Episodio> episodios; //Has-A
	private int numEpisodios; //Has-A
	
	public Serie(String titulo, String descripcion, int anio, double calificacion, String genero) {
		super(titulo, descripcion, anio, calificacion);
		this.genero = genero;
		this.episodios = new ArrayList<>();
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo serie: " + getTitulo());

	}

	public void setEpisodio(Episodio e) {
		this.episodios.add(e);
		numEpisodios++;
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

	public int getNumEpisodios() {
		return numEpisodios;
	}

	@Override
	public String toString() {
		return "Serie [genero=" + genero + ", numEpisodios=" + numEpisodios + ", titulo="
				+ titulo + "]";
	}
	
	

}
