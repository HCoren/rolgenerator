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
	@RequestMapping(value = "/armaduras", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String armaduras(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveArmaduras(index.getIndex());
	}
	
	@ResponseBody
	@RequestMapping(value = "/armas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String armas(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveArmas(index.getIndex());
	}
	
	@ResponseBody
	@RequestMapping(value = "/bonificadores_familia", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String bonificadoresFamilia(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveBonificadoresFamilia(index.getIndex());
	}
	
	@ResponseBody
	@RequestMapping(value = "/datos_escuela", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String datosEscuela(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveDatosEscuela(index.getIndex());
	}
	
	@RequestMapping(value = "/familias", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String familias(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveFamilias(index.getIndex());
	}

	@ResponseBody
	@RequestMapping(value = "/escuelas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String escuelas(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveEscuelas(index.getIndex());
	}
	
	@ResponseBody
	@RequestMapping(value = "/flechas", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String flechas(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveFlechas(index.getIndex());
	}
	
	@ResponseBody
	@RequestMapping(value = "/habilidades", method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON)
	String habilidades(@RequestBody Index index) throws JSONException {
		return phraseRetriever.retrieveHabilidades(index.getIndex());
	}
}
