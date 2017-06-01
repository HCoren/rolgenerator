package com.rolgenerator.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Users;

// TODO: Auto-generated Javadoc
/**
 * The Interface UsersRepository.
 */
@Repository
public interface UsersRepository extends CrudRepository<Users, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Users findOne(String username);
	
	/**
	 * Find by mail.
	 *
	 * @param email the email
	 * @return the list
	 */
	List <Users> findByMail (String email);
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#exists(java.io.Serializable)
	 */
	boolean exists(String username);
}
