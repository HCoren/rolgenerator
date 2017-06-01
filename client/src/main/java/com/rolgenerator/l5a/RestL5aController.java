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

/**
 * @author pretonik
 *
 */
@RestController
@CrossOrigin
public class RestL5aController {

	@Autowired
	private PhraseL5aRetriever phraseRetriever;

	@RequestMapping(value = "/l5a/familias")
	public String getFamilias(@RequestBody IndexDTO index) {
		return phraseRetriever.getFamilias(index);
	}

	@RequestMapping(value = "/l5a/escuelas")
	public String getEscuelas(@RequestBody IndexDTO index) {
		return phraseRetriever.getEscuelas(index);
	}

	@RequestMapping(value = "/l5a/bonificadores_familia")
	public String getBonificadoresFamilia(@RequestBody IndexDTO index) {
		return phraseRetriever.getBonificadoresFamilia(index);
	}

	@RequestMapping(value = "/l5a/datos_escuela")
	public String getDatosescuela(@RequestBody IndexDTO index) {
		return phraseRetriever.getDatosEscuela(index);
	}

	@RequestMapping(value = "/l5a/habilidades")
	public String getHabilidades(@RequestBody IndexDTO index) {
		return phraseRetriever.getHabilidades(index);
	}

	@RequestMapping(value = "/l5a/armaduras")
	public String getArmaduras(@RequestBody IndexDTO index) {
		return phraseRetriever.getArmaduras(index);
	}

	@RequestMapping(value = "/l5a/armas")
	public String getArmas(@RequestBody IndexDTO index) {
		return phraseRetriever.getArmas(index);
	}

	@RequestMapping(value = "/l5a/flechas")
	public String getFlechas(@RequestBody IndexDTO index) {
		return phraseRetriever.getFlechas(index);
	}
}
