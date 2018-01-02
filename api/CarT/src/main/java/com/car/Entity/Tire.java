package com.car.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tire {
	@Id
	private String tid;
	private float frontLeft;
	private float frontRight;
	private float rearLeft;
	private float rearRight;
	
	
	
	public Tire()
	{
		this.tid= UUID.randomUUID().toString();
	}
	
	public String getId() {
		return tid;
	}
	public void setId(String id) {
		this.tid = id;
	}
	public float getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(float frontLeft) {
		this.frontLeft = frontLeft;
	}
	public float getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(float frontRight) {
		this.frontRight = frontRight;
	}
	public float getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(float rearLeft) {
		this.rearLeft = rearLeft;
	}
	public float getRearRight() {
		return rearRight;
	}
	public void setRearRight(float rearRight) {
		this.rearRight = rearRight;
	}
	
	

}
