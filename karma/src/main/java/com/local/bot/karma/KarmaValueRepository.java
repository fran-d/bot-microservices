package com.local.bot.karma;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KarmaValueRepository extends JpaRepository<KarmaValue, Long>{
	Optional<KarmaValue> findById(Long id);
	
	KarmaValue findByName(String name);
	
}

