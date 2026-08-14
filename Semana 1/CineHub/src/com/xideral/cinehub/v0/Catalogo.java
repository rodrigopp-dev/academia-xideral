package com.xideral.cinehub.v0;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private String nombre;
	private List<Contenido> listaContenido;
	
	public Catalogo(String nombre) {
		this.nombre = nombre;
		this.listaContenido = new ArrayList<>();
	}

	public void setContenido(Contenido c) {
		this.listaContenido.add(c);
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
