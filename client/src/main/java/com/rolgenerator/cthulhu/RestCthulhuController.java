/**
 * 
 */
package com.rolgenerator.cthulhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.IndexDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class RestCthulhuController.
 *
 */
@RestController
@CrossOrigin
public class RestCthulhuController {

	/** The phrase retriever. */
	@Autowired
	private PhraseCthulhuRetriever phraseRetriever;

	/**
	 * Gets the armas cthulhu.
	 *
	 * @param index the weapon
	 * @return the weapon form database
	 */
	@RequestMapping(value = "/cthulhu/armas")
	public String getArmasCthulhu(@RequestBody IndexDTO index) {
		return phraseRetriever.getArmasCthulhu(index);
	}

	/**
	 * Gets the profesiones cthulhu.
	 *
	 * @param index the profession
	 * @return the profession from database
	 */
	@RequestMapping(value = "/cthulhu/profesiones")
	public String getProfesionesCthulhu(@RequestBody IndexDTO index) {
		return phraseRetriever.getProfesionesCthulhu(index);
	}
}
