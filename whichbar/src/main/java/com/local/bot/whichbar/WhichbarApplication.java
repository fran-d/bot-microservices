package com.local.bot.whichbar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WhichbarApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhichbarApplication.class, args);
	}

}
