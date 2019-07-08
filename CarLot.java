package project0.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project0.ScannerSingleton;
import project0.beans.Car;
import project0DAOs.SQLUtility;

public class CarLot extends Car {

	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public CarLot() {
		super();
	}

	public static List<Car> cars = new ArrayList<>();
	public static List<Double> payments = new ArrayList<>();
	

	public static void addCar(Car c) { 
		cars.add(c);

	}

	public static void removeCar(Car c) {
		cars.remove(c);

	}

	public static void ViewCar(List<Car> c) {
		SQLUtility.carAddJava();
		
		for(Car car: cars) {
			
			System.out.println(car);
			}
			
		}
	public static Double Pay(int index, int numMonths, double downPayment) {
		Car c = cars.get(index);
		double principal = c.getCost() - downPayment;
		double interest_rate = .0421;
		double payment = (principal * interest_rate)/(1 - Math.pow(1+interest_rate, -numMonths));
		
		System.out.println("Payment due: "+payment);
		payments.add(payment);
		return payment;
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
