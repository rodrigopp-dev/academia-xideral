package com.xideral.crudpeliculashttpbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "fecha_estreno")
	private String fechaEstreno;
	@Column(name = "duracion")
	private int duracion;
	@Column(name = "genero")
	private String genero;
	@Column(name = "director")
	private String director;
	@Column(name = "calificacion")
	private double calificacion;
	@Column(name = "idioma_original")
	private String idiomaOriginal;
	@Column(name = "pais_origen")
	private String paisOrigen;
}
