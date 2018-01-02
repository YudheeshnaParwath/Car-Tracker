package com.car.Entity;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Vehicle {
	@Id
	private String vid;
	private String vin;
	private String make;
	private String model;
	private int year;
	private int readLineRpm; 
	private int maxFuelVolume;
	private Date lastServiceDate;
	
	
	public Vehicle()
	{
		this.vid= UUID.randomUUID().toString();
	}
	
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getReadLineRpm() {
		return readLineRpm;
	}
	public void setReadLineRpm(int readLineRpm) {
		this.readLineRpm = readLineRpm;
	}
	public int getMaxFuelVolume() {
		return maxFuelVolume;
	}
	public void setMaxFuelVolume(int maxFuelVolume) {
		this.maxFuelVolume = maxFuelVolume;
	}
	public Date getLastServiceDate() {
		return lastServiceDate;
	}
	public void setLastServiceDate(Date lastServiceDate) {
		this.lastServiceDate = lastServiceDate;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year
				+ ", readLineRpm=" + readLineRpm + ", maxFuelVolume=" + maxFuelVolume + ", lastServiceDate="
				+ lastServiceDate + "]";
	}

	
}
