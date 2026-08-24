package com.xideral.crudpeliculashttpbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xideral.crudpeliculashttpbasic.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
