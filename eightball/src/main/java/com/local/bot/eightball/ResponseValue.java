package com.local.bot.eightball;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResponseValue {
	
	@Id
	private Long id;
	
	@Column(name="response")
	private String response;
	
	public ResponseValue() {
		
	}
	
	public ResponseValue(Long id, String response) {
		super();
		this.id=id;
		this.response=response;
	}

	 public Long getId() {
		    return id;
		  }

	 public String getResponse() {
		 return response;
	 }
}

