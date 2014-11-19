package com.wall.steve.demo;

import com.wall.steve.demo.Vehicle;

public class Ex1Interfaces {
	public static void main(String[] args) {
		Car c = new Car();
		Motorcycle m = new Motorcycle();
		
		Vehicle.printVehicles(c, m);
	}
}
