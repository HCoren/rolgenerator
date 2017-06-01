package com.rolgenerator;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rolgenerator.dto.DescargaDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class RestHomeController.
 */
@RestController
public class RestHomeController {

	/** The phrase retriever. */
	@Autowired
	private PhraseRetriever phraseRetriever;

	/**
	 * Download.
	 *
	 * @param descarga the descarga
	 * @return the byte[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/pdf")
	byte[] download(@RequestBody DescargaDTO descarga) throws IOException {
		return phraseRetriever.download(descarga.getDocumento());
	}
}
