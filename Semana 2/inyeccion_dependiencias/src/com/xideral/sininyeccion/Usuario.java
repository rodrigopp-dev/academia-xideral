package com.xideral.sininyeccion;

public class Usuario {

	private String nombre;
	private Whatsapp whatsapp;

	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public void enviarMensaje(String mensaje) {
		whatsapp = new Whatsapp();
		whatsapp.enviarMensaje(mensaje);
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
