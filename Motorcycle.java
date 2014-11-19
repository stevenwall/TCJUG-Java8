package com.wall.steve.demo;

public class Motorcycle implements Vehicle {

	@Override
	public String getType() {
		return "Motorcycle";
	}
	
	@Override
	public int getNumberOfWheels() {
		return 2;
	}

}
