package com.demo.bean;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

public class Product {
  
	@Id
	

	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	private String name;
	private String quality;

}
