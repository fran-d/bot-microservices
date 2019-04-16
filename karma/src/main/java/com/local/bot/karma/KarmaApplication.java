package com.local.bot.karma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KarmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarmaApplication.class, args);
	}

}
