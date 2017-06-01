package com.rolgenerator.descargas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.dto.DescargaDTO;

@Component
public class PhraseDescargasRetriever {

	@Autowired
	DescargasClient client;

	@HystrixCommand(fallbackMethod = "retrieveFallbackDescargar")
	public byte[] descargar(@RequestBody DescargaDTO descarga) {
		return client.descargar(descarga);
	}

	public byte[] retrieveFallbackDescargar(DescargaDTO descarga) {
		return null;
	}
}
