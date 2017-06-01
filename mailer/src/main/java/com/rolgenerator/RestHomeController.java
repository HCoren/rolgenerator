package com.rolgenerator;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.bean.DatosMail;

@RestController
public class RestHomeController {

	@Autowired
	private PhraseRetriever phraseRetriever;

	@RequestMapping(value = "/mailer", method = RequestMethod.POST, produces = "application/json")
	String sendMail(@RequestBody DatosMail datosMail) throws JSONException {
		return phraseRetriever.sendMail(datosMail);
	}
}
