package com.rolgenerator.descargas;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rolgenerator.dto.DescargaDTO;

@FeignClient("zuulserver")
public interface DescargasClient {

	@RequestMapping(method = RequestMethod.POST, value = "/downloader")
	public byte[] descargar(@RequestBody DescargaDTO descarga);

}
