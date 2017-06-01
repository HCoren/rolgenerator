package com.rolgenerator.l5a;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.IndexDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseL5aRetriever.
 */
@Component
public class PhraseL5aRetriever {

	/** The client. */
	@Autowired
	private L5aClient client;

	/**
	 * Gets the familias.
	 *
	 * @param index the index
	 * @return the familias
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackFamilias")
	public String getFamilias(@RequestBody IndexDTO index) {
		return client.getFamilias(index);
	}

	/**
	 * Gets the escuelas.
	 *
	 * @param index the index
	 * @return the escuelas
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackEscuelas")
	public String getEscuelas(@RequestBody IndexDTO index) {
		return client.getEscuelas(index);
	}

	/**
	 * Gets the bonificadores familia.
	 *
	 * @param index the index
	 * @return the bonificadores familia
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackBonificadoresFamilia")
	public String getBonificadoresFamilia(@RequestBody IndexDTO index) {
		return client.getBonificadoresFamilia(index);
	}

	/**
	 * Gets the datos escuela.
	 *
	 * @param index the index
	 * @return the datos escuela
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackDatosEscuela")
	public String getDatosEscuela(@RequestBody IndexDTO index) {
		return client.getDatosEscuela(index);
	}

	/**
	 * Gets the habilidades.
	 *
	 * @param index the index
	 * @return the habilidades
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackHabilidades")
	public String getHabilidades(@RequestBody IndexDTO index) {
		return client.getHabilidades(index);
	}

	/**
	 * Gets the armaduras.
	 *
	 * @param index the index
	 * @return the armaduras
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackArmaduras")
	public String getArmaduras(@RequestBody IndexDTO index) {
		return client.getArmaduras(index);
	}

	/**
	 * Gets the armas.
	 *
	 * @param index the index
	 * @return the armas
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackArmas")
	public String getArmas(@RequestBody IndexDTO index) {
		return client.getArmas(index);
	}

	/**
	 * Gets the flechas.
	 *
	 * @param index the index
	 * @return the flechas
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackFlechas")
	public String getFlechas(@RequestBody IndexDTO index) {
		return client.getFlechas(index);
	}

	/**
	 * Retrieve fallback familias.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackFamilias(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Familia", "Familia");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback escuelas.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackEscuelas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Escuela", "Escuela");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback bonificadores familia.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackBonificadoresFamilia(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("familia", "Familia");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback datos escuela.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackDatosEscuela(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("escuela", "Escuela");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback habilidades.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackHabilidades(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Habilidad", "Habilidad");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback armaduras.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackArmaduras(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("armadura", "Armadura");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback armas.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackArmas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("arma", "Arma");
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback flechas.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackFlechas(IndexDTO index) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("flecha", "Flecha");
		return new JSONObject(map).toString();
	}
}
