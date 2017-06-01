package com.rolgenerator.cthulhu;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.IndexDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseCthulhuRetriever.
 */
@Component
public class PhraseCthulhuRetriever {

	/** The client. */
	@Autowired
	private CthulhuClient client;

	/**
	 * Gets the armas cthulhu.
	 *
	 * @param index the weapon
	 * @return the weapon from database
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackArmas")
	public String getArmasCthulhu(@RequestBody IndexDTO index) {
		return client.getArmasCthulhu(index);
	}

	/**
	 * Gets the profesiones cthulhu.
	 *
	 * @param index the profession
	 * @return the profession from database
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackProfesiones")
	public String getProfesionesCthulhu(@RequestBody IndexDTO index) {
		return client.getProfesionesCthulhu(index);
	}

	/**
	 * Retrieve fallback armas.
	 *
	 * @param index the weapon
	 * @return the error
	 */
	public String retrieveFallbackArmas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("arma", "Arma");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback profesiones.
	 *
	 * @param index the profession
	 * @return the error
	 */
	public String retrieveFallbackProfesiones(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("profesion", "Profesion");
		return new JSONObject(map).toString();
	}

}
