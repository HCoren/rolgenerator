package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Armaduras;

@Repository
public interface ArmadurasRepository extends CrudRepository<Armaduras, String> {
	Armaduras findOne(String armadura);
}
