package com.local.bot.whichbar;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhichbarController {

	@Autowired
	private Environment environment;

	@Autowired
	private ResponseValueRepository repository;

	@GetMapping("/whichbar/")
	public ResponseValue retrieveResponseValue() {

		List<ResponseValue> responseList = repository.findAll();
		return responseList.get(getRandomIndex(responseList.size()));
	}

	public int getRandomIndex(int totalSize) {
		return ThreadLocalRandom.current().nextInt(0, totalSize);

	}
}
