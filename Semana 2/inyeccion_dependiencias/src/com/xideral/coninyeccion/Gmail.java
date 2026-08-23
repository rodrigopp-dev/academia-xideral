package com.xideral.coninyeccion;

public class Gmail implements Mensajeria {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mensaje por Gmail: " + mensaje);
	}

}
