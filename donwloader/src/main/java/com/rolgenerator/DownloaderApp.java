package com.rolgenerator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class DownloaderApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(DownloaderApp.class).web(true).run(args);
	}
}
