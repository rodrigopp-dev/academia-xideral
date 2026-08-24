package com.xideral.crudpeliculasjwt.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.xideral.crudpeliculasjwt.exception.PeliculaException;
import com.xideral.crudpeliculasjwt.model.Pelicula;
import com.xideral.crudpeliculasjwt.repository.PeliculaRepository;

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
		try {
			// Copia propiedades ignorando el ID para no alterarlo
			BeanUtils.copyProperties(pelicula, peliculaExistente, "id");
		} catch (BeansException e) {
			throw new PeliculaException(e.getMessage(), HttpStatus.CONFLICT);
		}

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
		// int idOriginal = peliculaExistente.getId();
		try {
			peliculaExistente = jsonMapper.updateValue(peliculaExistente, camposActualizar);
		} catch (JacksonException e) {
			throw new PeliculaException(e.getMessage(), HttpStatus.CONFLICT);
		}
		// peliculaExistente.setId(idOriginal);
		Pelicula peliculaActualizada = save(peliculaExistente);
		return peliculaActualizada;

	}

	@Override
	public void deleteById(int id) {
		peliculaRepository.deleteById(id);
	}

}
