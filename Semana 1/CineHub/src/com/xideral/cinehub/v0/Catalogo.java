package com.xideral.cinehub.v0;

import java.util.List;

public class Catalogo {

	private String nombre;
	private List<Contenido> listaContenido;
	
	public Catalogo(String nombre, List<Contenido> listaContenido) {
		super();
		this.nombre = nombre;
		this.listaContenido = listaContenido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Contenido> getListaContenido() {
		return listaContenido;
	}

	public void setListaContenido(List<Contenido> listaContenido) {
		this.listaContenido = listaContenido;
	}
	
	
	
}
