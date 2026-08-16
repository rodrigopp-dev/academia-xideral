package com.xideral.cinehub.v0;

public class Configuracion {

	private static Configuracion config;  //Static: le pertenece a la clase

	private Configuracion() {
		System.out.println("Instancia creada");
	}
	
	public void cargarConfiguracion() {
		System.out.println("Configuración cargada");
	}
	
	public static Configuracion getInstance() {
		if(config==null)
			config = new Configuracion();
		else
			System.out.println("Ya existe una instancia creada");
		return config;
	}
	
}
