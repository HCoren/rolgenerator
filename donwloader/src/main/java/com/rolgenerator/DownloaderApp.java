package com.rolgenerator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// TODO: Auto-generated Javadoc
/**
 * The Class DownloaderApp.
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class DownloaderApp {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(DownloaderApp.class).web(true).run(args);
	}
}
