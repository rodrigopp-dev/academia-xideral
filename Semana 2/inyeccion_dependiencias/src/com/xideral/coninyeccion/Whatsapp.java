package com.xideral.coninyeccion;

public class Whatsapp implements Mensajeria {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mensaje por Whatsapp: " + mensaje);
	}

}
