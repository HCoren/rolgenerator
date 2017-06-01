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

/**
 * @author pretonik
 *
 */
@RestController
@CrossOrigin
public class RestCthulhuController {

	@Autowired
	private PhraseCthulhuRetriever phraseRetriever;

	@RequestMapping(value = "/cthulhu/armas")
	public String getArmasCthulhu(@RequestBody IndexDTO index) {
		return phraseRetriever.getArmasCthulhu(index);
	}

	@RequestMapping(value = "/cthulhu/profesiones")
	public String getProfesionesCthulhu(@RequestBody IndexDTO index) {
		return phraseRetriever.getProfesionesCthulhu(index);
	}
}
