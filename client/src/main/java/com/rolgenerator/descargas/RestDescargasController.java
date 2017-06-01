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

// TODO: Auto-generated Javadoc
/**
 * The Class RestDescargasController.
 *
 */
@RestController
@CrossOrigin
public class RestDescargasController {

	/** The phrase retriever. */
	@Autowired
	private PhraseDescargasRetriever phraseRetriever;

	/**
	 * Descargar.
	 *
	 * @param descarga the descarga
	 * @return the byte[]
	 */
	@RequestMapping(value = "/descargar")
	public byte[] descargar(@RequestBody DescargaDTO descarga) {
		return phraseRetriever.descargar(descarga);
	}

}
