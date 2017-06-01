package com.rolgenerator.utils;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.DatosMailDTO;
import com.rolgenerator.dto.UserDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseUtilsRetriever.
 */
@Component
public class PhraseUtilsRetriever {

	/** The client. */
	@Autowired
	private UtilsClient client;

	/**
	 * Send mail.
	 *
	 * @param datosMail the datos mail
	 * @return the string
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackMailer")
	public String sendMail(@RequestBody DatosMailDTO datosMail) {
		return client.sendMail(datosMail);
	}

	/**
	 * New user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackNewUser")
	public String newUser(@RequestBody UserDTO userDTO) {
		return client.newUser(userDTO);
	}

	/**
	 * Retrieve fallback mailer.
	 *
	 * @param datosMail the datos mail
	 * @return the string
	 */
	public String retrieveFallbackMailer(DatosMailDTO datosMail) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback new user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 */
	public String retrieveFallbackNewUser(UserDTO userDTO) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}
}
