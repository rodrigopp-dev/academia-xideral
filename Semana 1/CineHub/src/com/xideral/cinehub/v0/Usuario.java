package com.xideral.cinehub.v0;

import java.util.List;

public class Usuario {
	private String nombre;
	private int edad;
	private List<Catalogo> listaCatalogo;
	
	public Usuario(String nombre, int edad, List<Catalogo> listaCatalogo) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaCatalogo = listaCatalogo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Catalogo> getListaCatalogo() {
		return listaCatalogo;
	}

	public void setListaCatalogo(List<Catalogo> listaCatalogo) {
		this.listaCatalogo = listaCatalogo;
	}

	
}
