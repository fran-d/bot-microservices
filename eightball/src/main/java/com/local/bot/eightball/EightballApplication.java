package com.local.bot.eightball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EightballApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EightballApplication.class, args);
	}

}
