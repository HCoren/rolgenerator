package com.rolgenerator.descargas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.DescargaDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseDescargasRetriever.
 */
@Component
public class PhraseDescargasRetriever {

	/** The client. */
	@Autowired
	DescargasClient client;

	/**
	 * Descargar.
	 *
	 * @param descarga the descarga
	 * @return the byte[]
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackDescargar")
	public byte[] descargar(@RequestBody DescargaDTO descarga) {
		return client.descargar(descarga);
	}

	/**
	 * Retrieve fallback descargar.
	 *
	 * @param descarga the descarga
	 * @return the byte[]
	 */
	public byte[] retrieveFallbackDescargar(DescargaDTO descarga) {
		return null;
	}
}
