package com.rolgenerator.cthulhu;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.IndexDTO;

@Component
public class PhraseCthulhuRetriever {

	@Autowired
	private CthulhuClient client;

	@HystrixCommand(fallbackMethod = "retrieveFallbackArmas")
	public String getArmasCthulhu(@RequestBody IndexDTO index) {
		return client.getArmasCthulhu(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackProfesiones")
	public String getProfesionesCthulhu(@RequestBody IndexDTO index) {
		return client.getProfesionesCthulhu(index);
	}

	public String retrieveFallbackArmas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("arma", "Arma");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackProfesiones(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("profesion", "Profesion");
		return new JSONObject(map).toString();
	}

}
