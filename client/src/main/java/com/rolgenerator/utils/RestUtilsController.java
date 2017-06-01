/**
 * 
 */
package com.rolgenerator.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.DatosMailDTO;
import com.rolgenerator.dto.UserDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class RestUtilsController.
 *
 */
@RestController
@CrossOrigin
public class RestUtilsController {

	/** The phrase retriever. */
	@Autowired
	private PhraseUtilsRetriever phraseRetriever;

	/**
	 * Send mail.
	 *
	 * @param datosMail the datos mail
	 * @return the string
	 */
	@RequestMapping(value = "/utils/mailer")
	public String sendMail(@RequestBody DatosMailDTO datosMail) {
		return phraseRetriever.sendMail(datosMail);
	}

	/**
	 * New user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 */
	@RequestMapping(value = "/utils/registration")
	public String newUser(@RequestBody UserDTO userDTO) {
		return phraseRetriever.newUser(userDTO);
	}
}
