/**
 * 
 */
package com.rolgenerator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pretonik
 *
 */
@RestController
@CrossOrigin
public class RestHomeController {

	@RequestMapping(value = "/")
	public void sendMail() {
		System.out.println("Hola");
	}
}
