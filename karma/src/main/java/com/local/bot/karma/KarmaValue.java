package com.local.bot.karma;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KarmaValue {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="karma")
	private Long karma;
	
	public KarmaValue() {
		
	}
	
	public KarmaValue(Long id, String name, Long karma) {
		super();
		this.id=id;
		this.name=name;
		this.karma=karma;
	}

	 public Long getId() {
		    return id;
		  }

	 public String getName() {
		 return name;
	 }
	 
	 public long getKarma() {
		 return karma;
	 }
	 
	 public void setKarma(long karma) {
		 this.karma=karma;
	 }
	 
	 public void setName(String name) {
		 this.name=name;
	 }
}

