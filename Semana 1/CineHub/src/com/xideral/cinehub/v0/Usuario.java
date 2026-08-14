package com.xideral.cinehub.v0;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Comparable<Usuario> {
	private String nombre;
	private int edad;
	private List<Catalogo> listaCatalogo = new ArrayList<>();
	private MetodoPago metodoPago;
	private boolean subscripcionActiva = false;
	
	public Usuario(String nombre, int edad, MetodoPago metodoPago) {
		this.nombre = nombre;
		this.edad = edad;
		this.metodoPago = metodoPago;
	}
	

	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.metodoPago = new PagoEfectivo();
	}
	
	public void setCatalogo(Catalogo c) {
		this.listaCatalogo.add(c);
	}

	public void activarSubscripcion() {
		if(metodoPago.pagar())
			subscripcionActiva = true;
		else
			System.out.println("No se pudo realizar el pago");
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

	public boolean isSubscripcionActiva() {
		return subscripcionActiva;
	}

	public void setSubscripcionActiva(boolean subscripcionActiva) {
		this.subscripcionActiva = subscripcionActiva;
	}


	@Override
	public int compareTo(Usuario o) {
		return getNombre().compareToIgnoreCase(o.getNombre());
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", subscripcionActiva=" + subscripcionActiva + "]";
	}
	
	
	
	
	
}
