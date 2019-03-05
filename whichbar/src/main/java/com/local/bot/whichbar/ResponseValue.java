package com.local.bot.whichbar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResponseValue {
	
	@Id
	private Long id;
	
	@Column(name="response")
	private String response;
	
	@Column(name="description")
	private String description;
	
	public ResponseValue() {
		
	}
	
	public ResponseValue(Long id, String response, String description) {
		super();
		this.id=id;
		this.response=response;
		this.description=description;
	}

	 public Long getId() {
		    return id;
		  }

	 public String getResponse() {
		 return response;
	 }
	 
	 public String getDescription() {
		 return description;
	 }
}

