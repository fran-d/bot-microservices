package com.local.bot.eightball;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseValueRepository extends JpaRepository<ResponseValue, Long>{
	Optional<ResponseValue> findById(Long id);
	
}
