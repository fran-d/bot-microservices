package com.local.bot.karma;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KarmaController {

	@Autowired
	private Environment environment;

	@Autowired
	private KarmaValueRepository repository;

	@GetMapping("/karma/")
	public List<KarmaValue> retrieveResponseValue() {
		List<KarmaValue> responseList = repository.findAll();

		return responseList;
	}
	
	@PostMapping("/karma/{name}/{karma}")
	public KarmaValue updateKarma(@PathVariable String name, @PathVariable long karma) {
		KarmaValue kValue = repository.findByName(name);
		if(kValue != null) {
			System.out.println("current karma: "+kValue.getKarma()+", adding karma: "+karma);
			kValue.setKarma(kValue.getKarma()+karma);
			repository.save(kValue);

		}else {
			kValue=new KarmaValue();
			kValue.setKarma(karma);
			kValue.setName(name);
			repository.save(kValue);
		}
		return kValue;
	}

	public int getRandomIndex(int totalSize) {
		return ThreadLocalRandom.current().nextInt(0, totalSize);

	}
}
