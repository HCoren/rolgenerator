package com.rolgenerator.l5a;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rolgenerator.dto.IndexDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface L5aClient.
 */
@FeignClient("zuulserver")
public interface L5aClient {

	/**
	 * Gets the familias.
	 *
	 * @param index the index
	 * @return the familias
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/familias")
	public String getFamilias(@RequestBody IndexDTO index);

	/**
	 * Gets the escuelas.
	 *
	 * @param index the index
	 * @return the escuelas
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/escuelas")
	public String getEscuelas(@RequestBody IndexDTO index);

	/**
	 * Gets the bonificadores familia.
	 *
	 * @param index the index
	 * @return the bonificadores familia
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/bonificadores_familia")
	public String getBonificadoresFamilia(@RequestBody IndexDTO index);

	/**
	 * Gets the datos escuela.
	 *
	 * @param index the index
	 * @return the datos escuela
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/datos_escuela")
	public String getDatosEscuela(@RequestBody IndexDTO index);

	/**
	 * Gets the habilidades.
	 *
	 * @param index the index
	 * @return the habilidades
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/habilidades")
	public String getHabilidades(@RequestBody IndexDTO index);

	/**
	 * Gets the armaduras.
	 *
	 * @param index the index
	 * @return the armaduras
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/armaduras")
	public String getArmaduras(@RequestBody IndexDTO index);

	/**
	 * Gets the armas.
	 *
	 * @param index the index
	 * @return the armas
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/armas")
	public String getArmas(@RequestBody IndexDTO index);

	/**
	 * Gets the flechas.
	 *
	 * @param index the index
	 * @return the flechas
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/l5ajpamicroservice/flechas")
	public String getFlechas(@RequestBody IndexDTO index);

}
