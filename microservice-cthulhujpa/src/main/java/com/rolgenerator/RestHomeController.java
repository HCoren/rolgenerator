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
	 * Profesiones.
	 *
	 * @param index the index
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@ResponseBody
	@RequestMapping(value = "/profesiones", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String profesiones(@RequestBody IndexDTO index) throws JSONException {
		return phraseRetriever.retrieveProfesiones(index.getIndex());
	}
}
