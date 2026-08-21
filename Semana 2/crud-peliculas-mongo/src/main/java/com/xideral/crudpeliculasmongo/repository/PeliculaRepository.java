package com.xideral.crudpeliculasmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xideral.crudpeliculasmongo.model.Pelicula;

public interface PeliculaRepository extends MongoRepository<Pelicula, String> {

}
