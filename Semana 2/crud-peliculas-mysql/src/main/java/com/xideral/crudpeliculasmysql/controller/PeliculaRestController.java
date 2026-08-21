package com.xideral.crudpeliculasmysql.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xideral.crudpeliculasmysql.model.Pelicula;
import com.xideral.crudpeliculasmysql.service.PeliculaService;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaRestController {

	final PeliculaService service;

	PeliculaRestController(PeliculaService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Pelicula>> findAll() {
		List<Pelicula> productos = service.findAll();
		return new ResponseEntity<>(productos, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pelicula> getPelicula(@PathVariable int id) {
		Optional<Pelicula> pelicula = service.findById(id);
		if (pelicula.isPresent()) {
			return new ResponseEntity<Pelicula>(pelicula.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Pelicula>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public ResponseEntity<Pelicula> addPelicula(@RequestBody Pelicula pelicula) {
		pelicula.setId(0);
		Pelicula nuevaPelicula = service.save(pelicula);
		return new ResponseEntity<Pelicula>(nuevaPelicula, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pelicula> updatePalicula(@PathVariable int id, @RequestBody Pelicula pelicula) {

		Pelicula peliculaActualizada = service.update(id, pelicula);
		return new ResponseEntity<Pelicula>(peliculaActualizada, HttpStatus.OK);

	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Pelicula> updateParcialPalicula(@PathVariable int id, @RequestBody Map<String, Object> camposActualizar) {

		Pelicula peliculaActualizada = service.updatePatch(id, camposActualizar);
		return new ResponseEntity<Pelicula>(peliculaActualizada, HttpStatus.OK);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePelicula(@PathVariable int id) {
		Optional<Pelicula> pelicula = service.findById(id);
		if (pelicula.isPresent()) {
			service.deleteById(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}
}
