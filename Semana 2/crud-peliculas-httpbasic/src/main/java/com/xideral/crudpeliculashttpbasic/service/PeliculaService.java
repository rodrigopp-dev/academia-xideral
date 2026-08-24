package com.xideral.crudpeliculashttpbasic.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.xideral.crudpeliculashttpbasic.model.Pelicula;

public interface PeliculaService {

	List<Pelicula> findAll();

	Optional<Pelicula> findById(int id);

	Pelicula save(Pelicula pelicula);
	
	Pelicula update(int id, Pelicula pelicula);
	
	Pelicula updatePatch(int id, Map<String, Object> camposActualizar);

	void deleteById(int id);

}
