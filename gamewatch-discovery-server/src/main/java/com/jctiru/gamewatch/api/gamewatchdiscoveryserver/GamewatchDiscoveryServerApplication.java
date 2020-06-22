package com.jctiru.gamewatch.api.gamewatchdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GamewatchDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamewatchDiscoveryServerApplication.class, args);
	}

}
