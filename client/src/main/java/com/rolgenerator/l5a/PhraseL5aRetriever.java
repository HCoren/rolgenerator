package com.rolgenerator.l5a;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.IndexDTO;

@Component
public class PhraseL5aRetriever {

	@Autowired
	private L5aClient client;

	@HystrixCommand(fallbackMethod = "retrieveFallbackFamilias")
	public String getFamilias(@RequestBody IndexDTO index) {
		return client.getFamilias(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackEscuelas")
	public String getEscuelas(@RequestBody IndexDTO index) {
		return client.getEscuelas(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackBonificadoresFamilia")
	public String getBonificadoresFamilia(@RequestBody IndexDTO index) {
		return client.getBonificadoresFamilia(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackDatosEscuela")
	public String getDatosEscuela(@RequestBody IndexDTO index) {
		return client.getDatosEscuela(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackHabilidades")
	public String getHabilidades(@RequestBody IndexDTO index) {
		return client.getHabilidades(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackArmaduras")
	public String getArmaduras(@RequestBody IndexDTO index) {
		return client.getArmaduras(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackArmas")
	public String getArmas(@RequestBody IndexDTO index) {
		return client.getArmas(index);
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackFlechas")
	public String getFlechas(@RequestBody IndexDTO index) {
		return client.getFlechas(index);
	}

	public String retrieveFallbackFamilias(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Familia", "Familia");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackEscuelas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Escuela", "Escuela");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackBonificadoresFamilia(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("familia", "Familia");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackDatosEscuela(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("escuela", "Escuela");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackHabilidades(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Habilidad", "Habilidad");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackArmaduras(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("armadura", "Armadura");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackArmas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("arma", "Arma");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackFlechas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("flecha", "Flecha");
		return new JSONObject(map).toString();
	}
}
