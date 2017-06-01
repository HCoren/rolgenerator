package com.rolgenerator.cthulhu;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rolgenerator.dto.IndexDTO;

@FeignClient("zuulserver")
public interface CthulhuClient {

	@RequestMapping(method = RequestMethod.POST, value = "/cthulhujpamicroservice/armas")
	public String getArmasCthulhu(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/cthulhujpamicroservice/profesiones")
	public String getProfesionesCthulhu(@RequestBody IndexDTO index);

}
