package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.DatosEscuela;

@Repository
public interface DatosEscuelaRepository extends CrudRepository<DatosEscuela, String> {
	DatosEscuela findOne(String escuela);
}
