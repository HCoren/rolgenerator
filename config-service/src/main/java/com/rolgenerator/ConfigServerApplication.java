package com.rolgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

// TODO: Auto-generated Javadoc
/**
 * The Class ConfigServerApplication.
 */
@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class ConfigServerApplication {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
