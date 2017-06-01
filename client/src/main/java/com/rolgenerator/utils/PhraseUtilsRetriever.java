package com.rolgenerator.utils;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.DatosMailDTO;
import com.rolgenerator.dto.UserDTO;

@Component
public class PhraseUtilsRetriever {

	@Autowired
	private UtilsClient client;

	@HystrixCommand(fallbackMethod = "retrieveFallbackMailer")
	public String sendMail(@RequestBody DatosMailDTO datosMail) {
		return client.sendMail(datosMail);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackNewUser")
	public String newUser(@RequestBody UserDTO userDTO) {
		return client.newUser(userDTO);
	}

	public String retrieveFallbackMailer(DatosMailDTO datosMail) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackNewUser(UserDTO userDTO) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}
}
