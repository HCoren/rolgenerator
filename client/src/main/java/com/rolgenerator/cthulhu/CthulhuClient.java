package com.rolgenerator.cthulhu;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rolgenerator.dto.IndexDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface CthulhuClient.
 */
@FeignClient("zuulserver")
public interface CthulhuClient {

	/**
	 * Gets the armas cthulhu.
	 *
	 * @param index the index
	 * @return the armas cthulhu
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/cthulhujpamicroservice/armas")
	public String getArmasCthulhu(@RequestBody IndexDTO index);

	/**
	 * Gets the profesiones cthulhu.
	 *
	 * @param index the index
	 * @return the profesiones cthulhu
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/cthulhujpamicroservice/profesiones")
	public String getProfesionesCthulhu(@RequestBody IndexDTO index);

}
