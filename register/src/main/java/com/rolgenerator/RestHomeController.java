package com.rolgenerator;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.UserDTO;

@RestController
public class RestHomeController {

	@Autowired
	private PhraseRetriever phraseRetriever;

	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json")
	String newUser(@RequestBody UserDTO userDTO) throws JSONException {
		return phraseRetriever.newUser(userDTO);
	}
}
