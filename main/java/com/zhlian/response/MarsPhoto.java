package com.zhlian.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhoto {
	
	private Long id;
	private Integer sol;
	private MarsCamera camera;
	
	@JsonProperty("img_src")
	private String imageSrc;
	
	@JsonProperty("earth_date")
	private String earthDate;
	
	private Rover rover;
	
	public String getEarthDate() {
		return earthDate;
	}
	public void setEarthDate(String earthDate) {
		this.earthDate = earthDate;
	}
	public Rover getRover() {
		return rover;
	}
	public void setRover(Rover rover) {
		this.rover = rover;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSol() {
		return sol;
	}
	public void setSol(Integer sol) {
		this.sol = sol;
	}
	public MarsCamera getCamera() {
		return camera;
	}
	public void setCamera(MarsCamera camera) {
		this.camera = camera;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	
	@Override
	public String toString() {
		return "MarsPhoto [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imageSrc=" + imageSrc + "]";
	}
}
