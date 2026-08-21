package com.xideral.crudpeliculasmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xideral.crudpeliculasmysql.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
