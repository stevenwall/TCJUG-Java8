package com.wall.steve.demo;

import java.util.Comparator;

public class Ex2Lambdas {
	static void printMsg(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				printMsg("r1 run()");
			}
		};
		new Thread(r1).start();
		
		Runnable r2 = () -> printMsg("r2 run()");
		new Thread(r2).start();
		new Thread( () -> printMsg("r3 run()") ).start();

		
		Comparator<Vehicle> wheelsTester = new Comparator<Vehicle>() {
			@Override
			public int compare(Vehicle v1, Vehicle v2) {
				int v1Wheels = v1.getNumberOfWheels();
				int v2Wheels = v2.getNumberOfWheels();
				return Integer.compare(v1Wheels, v2Wheels);
			}
		};

		Comparator<Vehicle> tester = (Vehicle v1, Vehicle v2) -> {
			int v1Wheels = v1.getNumberOfWheels();
			int v2Wheels = v2.getNumberOfWheels();
			return Integer.compare(v1Wheels, v2Wheels);
		};
	}

}
