package com.rolgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceRegistryApplication.
 */
// tag::enableEurekaServer[]
@SpringBootApplication
@EnableEurekaServer // <1>
public class ServiceRegistryApplication {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
}
// end::enableEurekaServer[]
