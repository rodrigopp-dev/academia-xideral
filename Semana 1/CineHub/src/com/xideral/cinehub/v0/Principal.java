package com.xideral.cinehub.v0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Principal {

	public static void main(String[] args) {
		// Patrón Singleton
		Configuracion.getInstance();
		// Se crea una serie y se le setean episodios
		Serie serie1 = new Serie("Game Of Thrones", "Serie de dragones", 2012, 9.0, "Drama");
		serie1.setEpisodio(new Episodio("Winter is Coming", 40));
		serie1.setEpisodio(new Episodio("The Kingsroad", 46));

		Pelicula pelicula1 = new Pelicula("Titanic", "Se hunde un barco", 1997, 8.9, 194, "Romance");
		Pelicula pelicula2 = new Pelicula("Terminator", "Un robot del futuro", 2019, 9.7, 128, "Acción");
		Pelicula pelicula3 = new Pelicula("Kung Fu Panda", "Un panda sabe Kung Fu", 2018, 8.0, 92, "Comedia");

		Catalogo favoritos = new Catalogo("Favoritos");
		favoritos.setContenido(pelicula1);
		favoritos.setContenido(serie1);

		Catalogo verDespues = new Catalogo("Ver Despues");
		verDespues.setContenido(pelicula2);
		verDespues.setContenido(pelicula3);

		Usuario usuario = new Usuario("Rodrigo", 45);
		usuario.setCatalogo(favoritos);
		usuario.setCatalogo(verDespues);
		usuario.setMetodoPago(new PagoTarjeta());
		usuario.setSubscripcionActiva(false);
		usuario.activarSubscripcion();

		Usuario usuario2 = new Usuario("Juan", 25);
		Usuario usuario3 = new Usuario("Pedro", 28);
		Usuario usuario4 = new Usuario("Mario", 19);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		ordenarUsuarios(usuarios);

		Contenido cont = usuario.getListaCatalogo().getFirst().getListaContenido().getFirst();

		if (cont instanceof Pelicula)
			// Polismorfismo y Casting
			((Pelicula) cont).reproducir();
		else
			// Polismorfismo y Casting
			((Serie) cont).reproducir();

		// Polimorfismo
//		pelicula1.reproducir();
//		serie1.reproducir();

	}

	public static void ordenarUsuarios(List<Usuario> usuarios) {
		System.out.println("\nComparable por nombre");
		Collections.sort(usuarios);

		for (Usuario u : usuarios) {
			System.out.println(u);
		}
		
		System.out.println("\nComparator por edad");
		Comparator<Usuario> comparator = Comparator.comparingInt(Usuario::getEdad).reversed();

		Collections.sort(usuarios, comparator);

		for (Usuario u : usuarios) {
			System.out.println(u);
		}
		
		System.out.println("\nComparator por nombre y clase anomina");
		Comparator<Usuario> comparator2 = new Comparator<Usuario>() {
			
			@Override
			public int compare(Usuario o1, Usuario o2) {
				return o1.getNombre().compareToIgnoreCase(o2.getNombre());
			}
		};
		
		Collections.sort(usuarios, comparator2);
		for (Usuario u : usuarios) {
			System.out.println(u);
		}
	}

}
