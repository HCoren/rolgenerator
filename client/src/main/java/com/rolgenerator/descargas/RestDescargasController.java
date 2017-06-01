/**
 * 
 */
package com.rolgenerator.descargas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.DescargaDTO;

/**
 * @author Jorge López
 *
 */
@RestController
@CrossOrigin
public class RestDescargasController {

	@Autowired
	private PhraseDescargasRetriever phraseRetriever;

	@RequestMapping(value = "/descargar")
	public byte[] descargar(@RequestBody DescargaDTO descarga) {
		return phraseRetriever.descargar(descarga);
	}

}
