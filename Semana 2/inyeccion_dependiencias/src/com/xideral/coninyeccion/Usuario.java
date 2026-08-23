package com.xideral.coninyeccion;

public class Usuario {

	private String nombre;
	private Mensajeria mensajeria;

	public Usuario(String nombre, Mensajeria mensajeria) {
		this.nombre = nombre;
		this.mensajeria =  mensajeria;
	}
	
	public void enviarMensaje(String mensaje) {
		mensajeria.enviarMensaje(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + "]";
	}

}
