package project0.functions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import project0.beans.Car;

public class CarLot extends Car {


	public CarLot() {
		super();
	}

	public static List<Car> cars = new ArrayList<>();
	
	

	public static void addCar(Car c) { 
		cars.add(c);

	}

	public static void removeCar(Car c) {
		cars.remove(c);

	}

	public static void ViewCar(List<Car> c) {
		for(Car car: cars) {
			
			System.out.println(car);
			}
			
		}
	
	
	public static void Payment(int n) {
		Car c = cars.get(0);
		double principal = c.getCost() - 1000;
		double interest_rate = .0421;
		int numMonths = n;
		double payment = (principal * interest_rate)/(1 - Math.pow(1+interest_rate, -numMonths));
		
		System.out.println("Payment due: "+payment);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
}
