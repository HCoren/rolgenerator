package com.rolgenerator;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.UserDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class RestHomeController.
 */
@RestController
public class RestHomeController {

	/** The phrase retriever. */
	@Autowired
	private PhraseRetriever phraseRetriever;

	/**
	 * New user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json")
	String newUser(@RequestBody UserDTO userDTO) throws JSONException {
		return phraseRetriever.newUser(userDTO);
	}
}
