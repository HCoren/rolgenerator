/**
 * 
 */
package com.rolgenerator.l5a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.IndexDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class RestL5aController.
 *
 */
@RestController
@CrossOrigin
public class RestL5aController {

	/** The phrase retriever. */
	@Autowired
	private PhraseL5aRetriever phraseRetriever;

	/**
	 * Gets the familias.
	 *
	 * @param index the index
	 * @return the familias
	 */
	@RequestMapping(value = "/l5a/familias")
	public String getFamilias(@RequestBody IndexDTO index) {
		return phraseRetriever.getFamilias(index);
	}

	/**
	 * Gets the escuelas.
	 *
	 * @param index the index
	 * @return the escuelas
	 */
	@RequestMapping(value = "/l5a/escuelas")
	public String getEscuelas(@RequestBody IndexDTO index) {
		return phraseRetriever.getEscuelas(index);
	}

	/**
	 * Gets the bonificadores familia.
	 *
	 * @param index the index
	 * @return the bonificadores familia
	 */
	@RequestMapping(value = "/l5a/bonificadores_familia")
	public String getBonificadoresFamilia(@RequestBody IndexDTO index) {
		return phraseRetriever.getBonificadoresFamilia(index);
	}

	/**
	 * Gets the datosescuela.
	 *
	 * @param index the index
	 * @return the datosescuela
	 */
	@RequestMapping(value = "/l5a/datos_escuela")
	public String getDatosescuela(@RequestBody IndexDTO index) {
		return phraseRetriever.getDatosEscuela(index);
	}

	/**
	 * Gets the habilidades.
	 *
	 * @param index the index
	 * @return the habilidades
	 */
	@RequestMapping(value = "/l5a/habilidades")
	public String getHabilidades(@RequestBody IndexDTO index) {
		return phraseRetriever.getHabilidades(index);
	}

	/**
	 * Gets the armaduras.
	 *
	 * @param index the index
	 * @return the armaduras
	 */
	@RequestMapping(value = "/l5a/armaduras")
	public String getArmaduras(@RequestBody IndexDTO index) {
		return phraseRetriever.getArmaduras(index);
	}

	/**
	 * Gets the armas.
	 *
	 * @param index the index
	 * @return the armas
	 */
	@RequestMapping(value = "/l5a/armas")
	public String getArmas(@RequestBody IndexDTO index) {
		return phraseRetriever.getArmas(index);
	}

	/**
	 * Gets the flechas.
	 *
	 * @param index the index
	 * @return the flechas
	 */
	@RequestMapping(value = "/l5a/flechas")
	public String getFlechas(@RequestBody IndexDTO index) {
		return phraseRetriever.getFlechas(index);
	}
}
