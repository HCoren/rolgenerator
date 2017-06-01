package com.rolgenerator.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, String> {
	Users findOne(String username);
	
	List <Users> findByMail (String email);
	
	boolean exists(String username);
}
