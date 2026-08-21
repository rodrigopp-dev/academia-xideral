package com.xideral.crudpeliculasmongo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.xideral.crudpeliculasmongo.model.Pelicula;

public interface PeliculaService {

	List<Pelicula> findAll();

	Optional<Pelicula> findById(String id);

	Pelicula save(Pelicula pelicula);
	
	Pelicula update(String id, Pelicula pelicula);
	
	Pelicula updatePatch(String id, Map<String, Object> camposActualizar);

	void deleteById(String id);

}
