package com.xideral.crudpeliculasmysql.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.xideral.crudpeliculasmysql.exception.PeliculaException;
import com.xideral.crudpeliculasmysql.model.Pelicula;
import com.xideral.crudpeliculasmysql.repository.PeliculaRepository;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.json.JsonMapper;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	private final JsonMapper jsonMapper;

	private final PeliculaRepository peliculaRepository;

	PeliculaServiceImpl(PeliculaRepository peliculaRepository, JsonMapper jsonMapper) {
		this.peliculaRepository = peliculaRepository;
		this.jsonMapper = jsonMapper;
	}

	@Override
	public List<Pelicula> findAll() {
		return peliculaRepository.findAll();
	}

	@Override
	public Optional<Pelicula> findById(int id) {
		return peliculaRepository.findById(id);
	}

	@Override
	public Pelicula save(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}

	@Override
	public Pelicula update(int id, Pelicula pelicula) {
		Pelicula peliculaExistente = findById(id)
				.orElseThrow(() -> new PeliculaException("Película no encontrada con id: " + id, HttpStatus.NOT_FOUND));
		peliculaExistente.setTitulo(pelicula.getTitulo());
		peliculaExistente.setDescripcion(pelicula.getDescripcion());
		peliculaExistente.setFechaEstreno(pelicula.getFechaEstreno());
		peliculaExistente.setDuracion(pelicula.getDuracion());
		peliculaExistente.setGenero(pelicula.getGenero());
		peliculaExistente.setDirector(pelicula.getDirector());
		peliculaExistente.setCalificacion(pelicula.getCalificacion());
		peliculaExistente.setIdiomaOriginal(pelicula.getIdiomaOriginal());
		peliculaExistente.setPaisOrigen(pelicula.getPaisOrigen());
		Pelicula peliculaActualizada = save(peliculaExistente);
		return peliculaActualizada;

	}

	@Override
	public Pelicula updatePatch(int id, Map<String, Object> camposActualizar) {
		Pelicula peliculaExistente = findById(id)
				.orElseThrow(() -> new PeliculaException("Película no encontrada con id: " + id, HttpStatus.NOT_FOUND));
		if (camposActualizar.containsKey("id")) {
			throw new PeliculaException("'id' de Pelicula no puede ser modificado. Elimine 'id' del JSON",
					HttpStatus.BAD_REQUEST);
		}
		//int idOriginal = peliculaExistente.getId();
		try {
			peliculaExistente = jsonMapper.updateValue(peliculaExistente, camposActualizar);
		} catch (JacksonException e) {
			throw new PeliculaException("Error al actualizar la película parcialmente: " + e.getMessage(),
					HttpStatus.BAD_REQUEST);
		}
		//peliculaExistente.setId(idOriginal);
		Pelicula peliculaActualizada = save(peliculaExistente);
		return peliculaActualizada;

	}

	@Override
	public void deleteById(int id) {
		peliculaRepository.deleteById(id);
	}

}
