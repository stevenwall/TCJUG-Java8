package com.wall.steve.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.wall.steve.demo.Car;

public class Ex3Functional {
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
				new Car("VW", "Beetle", 2012),
				new Car("Toyota", "Corolla", 2008),
				new Car("Toyota", "Prius", 2014),
				new Car("Ford", "Mustang", 2012)
		);
		findNewestCarImperative(cars);
		findNewestCarFunctional(cars);

		//Find oldest Toyotas - min(), filter()
		cars.stream()
			.filter(c -> "Toyota".equals(c.getMake()))
			.min(YEAR_TESTER)
			.get();
		
		//Print all Toyotas - forEach()
		cars.stream()
			.filter(c -> "Toyota".equals(c.getMake()))
			.forEach(c -> c.printCar());
		
		//Create List of all Toyotas - collect()
		cars.stream()
			.filter(c -> "Toyota".equals(c.getMake()))
			.collect(Collectors.toList());
		
		//Average age of cars - mapToInt(), distinct(), average()
		Double avg =
		cars.stream()
			.mapToInt(c -> c.getYear())
			.distinct()
			.average()
			.getAsDouble();
		
		System.out.println(avg);
		
		//parallelStream(), filter(), findFirst()
		cars.parallelStream()
			.filter(c -> "Toyota".equals(c.getMake()))
			.findFirst()
			.get()
			.printCar();

	}
	
	public static void findNewestCarImperative(List<Car> carList) {
		System.out.println("\nfindNewestCarImperative");
		Car newest = null;
		int newestYear = 1885;
		for (int i=0; i < carList.size(); i++) {
			Car current = carList.get(i);
			if (current.getYear() > newestYear) {
				newestYear = current.getYear();
				newest = current;
			}
		}
		newest.printCar();
	}

	private static void findNewestCarFunctional(List<Car> carList) {
		System.out.println("\nfindNewestCarFunctional");
		carList.stream()
			   .max(YEAR_TESTER)
			   .get()
			   .printCar();
	}

	static final Comparator<Car> YEAR_TESTER = (Car c1, Car c2) -> {
		return Integer.compare(c1.getYear(), c2.getYear());
	};

}
