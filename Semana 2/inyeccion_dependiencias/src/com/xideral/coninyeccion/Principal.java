package com.xideral.coninyeccion;

public class Principal {

	public static void main(String[] args) {
		
		Mensajeria whatsapp = new Whatsapp();
		Mensajeria gmail = new Gmail();
		
		Usuario usuario1 = new Usuario("Rodrigo", gmail);
		usuario1.enviarMensaje("Hola");
		
		Usuario usuario2 = new Usuario("Juan", whatsapp);
		usuario2.enviarMensaje("Hola");
		
	}
}
