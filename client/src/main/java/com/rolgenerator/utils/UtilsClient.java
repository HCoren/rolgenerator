package com.rolgenerator.utils;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rolgenerator.dto.DatosMailDTO;
import com.rolgenerator.dto.UserDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface UtilsClient.
 */
@FeignClient("zuulserver")
public interface UtilsClient {

	/**
	 * Send mail.
	 *
	 * @param datosMail the datos mail
	 * @return the string
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/mailer/mailer")
	public String sendMail(@RequestBody DatosMailDTO datosMail);

	/**
	 * New user.
	 *
	 * @param userDTO the user DTO
	 * @return the string
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/register/register")
	public String newUser(@RequestBody UserDTO userDTO);
}
