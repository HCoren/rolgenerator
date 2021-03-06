package com.rolgenerator;

import java.util.HashMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.entities.Armaduras;
import com.rolgenerator.entities.Armas;
import com.rolgenerator.entities.BonificadoresFamilia;
import com.rolgenerator.entities.DatosEscuela;
import com.rolgenerator.entities.Escuelas;
import com.rolgenerator.entities.Familias;
import com.rolgenerator.entities.Flechas;
import com.rolgenerator.entities.Habilidades;
import com.rolgenerator.repositories.ArmadurasRepository;
import com.rolgenerator.repositories.ArmasRepository;
import com.rolgenerator.repositories.BonificadoresFamiliaRepository;
import com.rolgenerator.repositories.DatosEscuelaRepository;
import com.rolgenerator.repositories.EscuelasRepository;
import com.rolgenerator.repositories.FamiliasRepository;
import com.rolgenerator.repositories.FlechasRepository;
import com.rolgenerator.repositories.HabilidadesRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseRetriever.
 */
@Component
public class PhraseRetriever {

	/** The armaduras. */
	@Autowired
	ArmadurasRepository armaduras;
	
	/** The armas. */
	@Autowired
	ArmasRepository armas;
	
	/** The bonificadores familia. */
	@Autowired
	BonificadoresFamiliaRepository bonificadoresFamilia;
	
	/** The datos escuela. */
	@Autowired
	DatosEscuelaRepository datosEscuela;
	
	/** The familias. */
	@Autowired
	FamiliasRepository familias;
	
	/** The escuelas. */
	@Autowired
	EscuelasRepository escuelas;
	
	/** The flechas. */
	@Autowired
	FlechasRepository flechas;
	
	/** The habilidades. */
	@Autowired
	HabilidadesRepository habilidades;

	/**
	 * Retrieve armaduras.
	 *
	 * @param armadura the armadura
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackArmaduras")
	public String retrieveArmaduras(String armadura) throws JSONException {
		Armaduras a = armaduras.findOne(armadura);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("armadura", a.getArmadura());
		map.put("bonificador", String.valueOf(a.getBonificador()));
		map.put("reduccion", String.valueOf(a.getReduccion()));
		map.put("notas", a.getNotas());
		
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve armas.
	 *
	 * @param arma the arma
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackArmas")
	public String retrieveArmas(String arma) throws JSONException {
		Armas a = armas.findOne(arma);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("arma", a.getArma());
		map.put("habilidad", a.getHabilidad());
		map.put("daño", a.getDaño());
		map.put("notas", a.getNotas());
		
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve bonificadores familia.
	 *
	 * @param familia the familia
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackBonificadoresFamilia")
	public String retrieveBonificadoresFamilia(String familia) throws JSONException {
		BonificadoresFamilia b = bonificadoresFamilia.findOne(familia);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("familia", b.getFamilia());
		map.put("bonificador", b.getBonificador());
		
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve datos escuela.
	 *
	 * @param escuela the escuela
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackDatosEscuela")
	public String retrieveDatosEscuela(String escuela) throws JSONException {
		DatosEscuela d = datosEscuela.findOne(escuela);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("escuela", d.getEscuela());
		map.put("bonificador", d.getBonificador());
		map.put("habilidades", d.getHabilidades());
		map.put("rangos", d.getRangos());
		map.put("especialidades", d.getEspecialidades());
		map.put("honor", String.valueOf(d.getHonor()));
		
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve familias.
	 *
	 * @param clan the clan
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackFamilias")
	public String retrieveFamilias(String clan) throws JSONException {
		Familias f = familias.findOne(clan);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("familia1", f.getFamilia1());
		map.put("familia2", f.getFamilia2());
		map.put("familia3", f.getFamilia3());
		map.put("familia4", f.getFamilia4());
		map.put("familia5", f.getFamilia5());
		map.put("familia6", f.getFamilia6());
		
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve escuelas.
	 *
	 * @param clan the clan
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackEscuelas")
	public String retrieveEscuelas(String clan) throws JSONException {
		Escuelas e = escuelas.findOne(clan);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("escuela1", e.getEscuela1());
		map.put("escuela2", e.getEscuela2());
		map.put("escuela3", e.getEscuela3());
		map.put("escuela4", e.getEscuela4());
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve flechas.
	 *
	 * @param flecha the flecha
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackFlechas")
	public String retrieveFlechas(String flecha) throws JSONException {
		Flechas f = flechas.findOne(flecha);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("flecha", f.getFlecha());
		map.put("daño", f.getDaño());
		
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve habilidades.
	 *
	 * @param habilidad the habilidad
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackHabilidades")
	public String retrieveHabilidades(String habilidad) throws JSONException {
		Habilidades h = habilidades.findOne(habilidad);
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("habilidad", h.getHabilidad());
		map.put("tipo", h.getTipo());
		map.put("caracteristica", h.getCaracteristica());
		map.put("especialidades", h.getEspecialidades());
		
		return new JSONObject(map).toString();
	}

	/**
	 * Retrieve fallback armaduras.
	 *
	 * @param armadura the armadura
	 * @return the string
	 */
	public String retrieveFallbackArmaduras(String armadura) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Armadura", "Armadura");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback armas.
	 *
	 * @param arma the arma
	 * @return the string
	 */
	public String retrieveFallbackArmas(String arma) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("arma", "Arma");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback bonificadores familia.
	 *
	 * @param familia the familia
	 * @return the string
	 */
	public String retrieveFallbackBonificadoresFamilia(String familia) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Familia", "Familia");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback datos escuela.
	 *
	 * @param escuela the escuela
	 * @return the string
	 */
	public String retrieveFallbackDatosEscuela(String escuela) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Escuela", "Escuela");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback familias.
	 *
	 * @param clan the clan
	 * @return the string
	 */
	public String retrieveFallbackFamilias(String clan) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Familia", "Familia");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback escuelas.
	 *
	 * @param escuela the escuela
	 * @return the string
	 */
	public String retrieveFallbackEscuelas(String escuela) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Escuela", "Escuela");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback flechas.
	 *
	 * @param flecha the flecha
	 * @return the string
	 */
	public String retrieveFallbackFlechas(String flecha) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Flecha", "Flecha");
		return new JSONObject(map).toString();
	}
	
	/**
	 * Retrieve fallback habilidades.
	 *
	 * @param habilidad the habilidad
	 * @return the string
	 */
	public String retrieveFallbackHabilidades(String habilidad) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("Habilidad", "Habilidad");
		return new JSONObject(map).toString();
	}
}
