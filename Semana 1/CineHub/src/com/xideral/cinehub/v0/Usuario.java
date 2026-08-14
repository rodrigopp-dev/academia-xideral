package com.xideral.cinehub.v0;

import java.util.List;

public class Usuario {
	private String nombre;
	private int edad;
	private List<Catalogo> listaCatalogo;
	private MetodoPago metodoPago;
	
	public Usuario(String nombre, int edad, List<Catalogo> listaCatalogo, MetodoPago metodoPago) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaCatalogo = listaCatalogo;
		this.metodoPago = metodoPago;
	}
	

	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.metodoPago = new PagoEfectivo(); 
	}

	public void activarSubscripcion() {
		metodoPago.pagar();
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

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}
	
}
