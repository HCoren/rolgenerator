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

/**
 * @author pretonik
 *
 */
@RestController
@CrossOrigin
public class RestUtilsController {

	@Autowired
	private PhraseUtilsRetriever phraseRetriever;

	@RequestMapping(value = "/utils/mailer")
	public String sendMail(@RequestBody DatosMailDTO datosMail) {
		return phraseRetriever.sendMail(datosMail);
	}

	@RequestMapping(value = "/utils/registration")
	public String newUser(@RequestBody UserDTO userDTO) {
		return phraseRetriever.newUser(userDTO);
	}
}
