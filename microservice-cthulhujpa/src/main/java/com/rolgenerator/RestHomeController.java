package com.rolgenerator;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.bean.Index;

@RestController
public class RestHomeController {

	@Autowired
	private PhraseRetriever phraseRetriever;

	@ResponseBody
	@RequestMapping(value = "/armas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String armas(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveArmas(index.getIndex());
	}

	@ResponseBody
	@RequestMapping(value = "/profesiones", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String profesiones(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveProfesiones(index.getIndex());
	}
}
