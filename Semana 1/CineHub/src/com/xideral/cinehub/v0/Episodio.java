package com.xideral.cinehub.v0;

public class Episodio {

	private String nombreEpisodio;
	private int minDuracion;

	public Episodio(String nombreEpisodio, int minDuracion) {
		this.nombreEpisodio = nombreEpisodio;
		this.minDuracion = minDuracion;
	}

	public String getNombreEpisodio() {
		return nombreEpisodio;
	}

	public void setNombreEpisodio(String nombreEpisodio) {
		this.nombreEpisodio = nombreEpisodio;
	}

	public int getMinDuracion() {
		return minDuracion;
	}

	public void setMinDuracion(int minDuracion) {
		this.minDuracion = minDuracion;
	}
}
