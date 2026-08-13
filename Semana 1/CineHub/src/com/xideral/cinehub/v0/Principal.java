package com.xideral.cinehub.v0;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Episodio episodio1 = new Episodio("Episodio 1",40);
		Episodio episodio2 = new Episodio("Episodio 2",46);
		
		List<Episodio> listaEpisodios = new ArrayList<>();
		listaEpisodios.add(episodio1);
		listaEpisodios.add(episodio2);
		
		Serie serie1 = new Serie("Serie 1", "Descripcion", 2020, 9.0, "Accion", listaEpisodios);
		
		Pelicula pelicula1 = new Pelicula("Pelicula 1", "Descripcion", 2023, 8.9, 124, "Terror");
		Pelicula pelicula2 = new Pelicula("Pelicula 2", "Descripcion", 2021, 9.7, 112, "Accion");
		Pelicula pelicula3 = new Pelicula("Pelicula 3", "Descripcion", 2010, 8.0, 98, "Comedia");
		
		List<Contenido> listaContenido1 = new ArrayList<>();
		listaContenido1.add(pelicula1);
		listaContenido1.add(serie1);
		
		List<Contenido> listaContenido2 = new ArrayList<>();
		listaContenido2.add(pelicula2);
		listaContenido2.add(pelicula3);
		
		
		Catalogo favoritos = new Catalogo("Favoritos", listaContenido1);
		Catalogo verDespues = new Catalogo("Ver Despues", listaContenido2);
		
		List<Catalogo> listaCatalogo = new ArrayList<>();
		listaCatalogo.add(favoritos);
		listaCatalogo.add(verDespues);
		
		Usuario usuario = new Usuario("Rodrigo", 50, listaCatalogo);
		
		
		
	}

}
