package com.rolgenerator;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.UserDTO;
import com.rolgenerator.entities.UserRoles;
import com.rolgenerator.entities.Users;
import com.rolgenerator.repositories.UserRolesRepository;
import com.rolgenerator.repositories.UsersRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseRetriever.
 */
@Component
public class PhraseRetriever {

	/** The users. */
	@Autowired
	UsersRepository users;
	
	/** The user roles. */
	@Autowired
	UserRolesRepository userRoles;

	/**
	 * New user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackNewUser")
	public String newUser(UserDTO userDTO) throws JSONException {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		HashMap <String, String> map = new HashMap <String, String>();
		
		if (users.exists((userDTO.getNick()))) {
			map.put("resultado", "El usuario ya existe");
		} else if (users.findByMail(userDTO.getEmail()).size() > 0) {
			map.put("resultado", "Ya existe un usuario con el mismo email");
		} else {
			String hashedPassword = passwordEncoder.encode(userDTO.getPassword());
			Users user = new Users(userDTO.getNick(), hashedPassword, 1, userDTO.getName(), userDTO.getLastName(), userDTO.getEmail());
			users.save(user);

			UserRoles userRol = new UserRoles(userDTO.getName(), "ROLE_USER");
			userRoles.save(userRol);
			map.put("resultado", "El usuario se ha dado de alta");
		}
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback new user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 */
	public String retrieveFallbackNewUser(UserDTO userDTO) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}
}
