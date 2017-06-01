package com.rolgenerator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// TODO: Auto-generated Javadoc
/**
 * The Class JpaApp.
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class JpaApp {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(JpaApp.class).web(true).run(args);
	}
}
