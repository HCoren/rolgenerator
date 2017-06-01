package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Habilidades;

@Repository
public interface HabilidadesRepository extends CrudRepository<Habilidades, String> {
	Habilidades findOne(String habilidad);
}
