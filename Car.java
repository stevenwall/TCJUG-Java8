package com.wall.steve.demo;

public class Car implements Vehicle {

	String make;
	String model;
	int year;
	
	public Car() {	}
	
	public Car(String make, String model, int year) {
		this.make = make;  this.model = model;  this.year = year;
	}
	
	@Override
	public String getType() {
		return "Car";
	}
	
	public void printCar() {
		System.out.println(year + " " + make + " " + model);
	}

	public String getMake() {	return make;	}
	public void setMake(String make) {	this.make = make;	}
	public String getModel() {	return model;	}
	public void setModel(String model) {	this.model = model;	}
	public int getYear() {	return year;	}
	public void setYear(int year) {	this.year = year;	}
}
