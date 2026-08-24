package com.xideral.crudpeliculasjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xideral.crudpeliculasjwt.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
