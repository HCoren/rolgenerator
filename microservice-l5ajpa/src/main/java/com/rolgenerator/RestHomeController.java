package com.rolgenerator;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.IndexDTO;

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
	 * Armaduras.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/armaduras", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String armaduras(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveArmaduras(index.getIndex());
	}
	
	/**
	 * Armas.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/armas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String armas(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveArmas(index.getIndex());
	}
	
	/**
	 * Bonificadores familia.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/bonificadores_familia", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String bonificadoresFamilia(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveBonificadoresFamilia(index.getIndex());
	}
	
	/**
	 * Datos escuela.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/datos_escuela", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String datosEscuela(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveDatosEscuela(index.getIndex());
	}
	
	/**
	 * Familias.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@RequestMapping(value = "/familias", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String familias(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveFamilias(index.getIndex());
	}

	/**
	 * Escuelas.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/escuelas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String escuelas(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveEscuelas(index.getIndex());
	}
	
	/**
	 * Flechas.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/flechas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String flechas(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveFlechas(index.getIndex());
	}
	
	/**
	 * Habilidades.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/habilidades", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String habilidades(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveHabilidades(index.getIndex());
	}
}
