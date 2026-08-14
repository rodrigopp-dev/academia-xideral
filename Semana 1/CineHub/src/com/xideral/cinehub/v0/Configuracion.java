package com.xideral.cinehub.v0;

public class Configuracion {

	private static Configuracion config;

	private Configuracion() {
		System.out.println("Cargando configuración inicial...");
	}
	
	public static void getInstance() {
		if(config==null)
			config = new Configuracion();
		else
			System.out.println("Ya se cargó la configuración anteriormente");
	}
	
}
