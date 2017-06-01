package com.rolgenerator.l5a;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rolgenerator.dto.IndexDTO;

@FeignClient("zuulserver")
public interface L5aClient {

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/familias")
	public String getFamilias(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/escuelas")
	public String getEscuelas(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/bonificadores_familia")
	public String getBonificadoresFamilia(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/datos_escuela")
	public String getDatosEscuela(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/habilidades")
	public String getHabilidades(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/armaduras")
	public String getArmaduras(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/armas")
	public String getArmas(@RequestBody IndexDTO index);

	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/flechas")
	public String getFlechas(@RequestBody IndexDTO index);

}
