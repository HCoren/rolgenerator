package com.rolgenerator;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.DatosMailDTO;

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
	 * Send mail.
	 *
	 * @param datosMail the datos mail
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@RequestMapping(value = "/mailer", method = RequestMethod.POST, produces = "application/json")
	String sendMail(@RequestBody DatosMailDTO datosMail) throws JSONException {
		return phraseRetriever.sendMail(datosMail);
	}
}
