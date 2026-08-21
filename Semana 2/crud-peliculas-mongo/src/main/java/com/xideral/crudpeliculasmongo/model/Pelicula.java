package com.xideral.crudpeliculasmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "peliculas")
public class Pelicula {

	@Id
	private String id;
	private String titulo;
	private String descripcion;
	private String fechaEstreno;
	private int duracion;
	private String genero;
	private String director;
	private double calificacion;
	private String idiomaOriginal;
	private String paisOrigen;
}
