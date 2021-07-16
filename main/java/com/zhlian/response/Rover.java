package com.zhlian.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rover {
	private Long id;
	private String name;
	
	@JsonProperty("landing_date")
	private String landingDate;
	
	@JsonProperty("launch_date")
	private String laungchDate;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandingDate() {
		return landingDate;
	}

	public void setLandingDate(String landingDate) {
		this.landingDate = landingDate;
	}

	public String getLaungchDate() {
		return laungchDate;
	}

	public void setLaungchDate(String laungchDate) {
		this.laungchDate = laungchDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
