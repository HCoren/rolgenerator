package com.rolgenerator;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.entities.Armas;
import com.rolgenerator.entities.Profesiones;
import com.rolgenerator.repositories.ArmasRepository;
import com.rolgenerator.repositories.ProfesionesRepository;

@Component
public class PhraseRetriever {

	@Autowired
	ProfesionesRepository profesiones;
	@Autowired
	ArmasRepository armas;

	@HystrixCommand(fallbackMethod = "retrieveFallbackArmas")
	public String retrieveArmas(String arma) throws JSONException {
		Armas a = armas.findOne(arma);
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("arma", a.getArma());
		map.put("habilidad", a.getHabilidad());
		map.put("daño", a.getDaño());
		map.put("alcance", a.getAlcance());
		map.put("ataque", a.getAtaques());
		map.put("capacidad", a.getCapacidad());
		map.put("pr", a.getPr());
		map.put("fdefect", a.getFdefect());
		
		return new JSONObject(map).toString();
	}

	@HystrixCommand(fallbackMethod = "retrieveFallbackProfesiones")
	public String retrieveProfesiones(String profesion) throws JSONException {
		Profesiones p = profesiones.findOne(profesion);
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("habilidad1", p.getHabilidad1());
		map.put("habilidad2", p.getHabilidad2());
		map.put("habilidad3", p.getHabilidad3());
		map.put("habilidad4", p.getHabilidad4());
		map.put("habilidad5", p.getHabilidad5());
		map.put("habilidad6", p.getHabilidad6());
		map.put("habilidad7", p.getHabilidad7());
		map.put("habilidad8", p.getHabilidad8());
		
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackArmas(String arma) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("arma", "Arma");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackProfesiones(String profesion) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("profesion", "Profesion");
		return new JSONObject(map).toString();
	}
}
