package project0.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project0.ScannerSingleton;
import project0.beans.Car;

public class CarLot{

	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public CarLot() {
		super();
	}

	public static List<Car> cars = new ArrayList<>();// list of cars in the carLot
	public static List<Double> payments = new ArrayList<>();// List of all the payments made on the cars
	

	public static void addCar(Car c) { // adds a car object to the lot
		cars.add(c);

	}

	public static void removeCar(Car c) {// removes car object from the lot 
		cars.remove(sc.nextInt());

	}

	public static void viewCar(List<Car> c) {//prints out all the cars available in the lot
		int i = 0;
		for(Car car: cars) {
			
			System.out.println(i+")"+car);
			++i;
			}
			
		}
	public static Double pay(int index, int numMonths, double downPayment) {// calculate the monthly payment
		Car c = CustomerCarLot.customerCars.get(index);
		double principal = c.getCost() - downPayment;
		double interest_rate = .0421/100;//percentage
		double payment = (principal * interest_rate)/(1 - Math.pow(1+interest_rate, -numMonths));
		System.out.println("Payment due: "+payment);
		payments.add(payment);
		return payment;
	}
	public static double amountDue(double payment, int index, int numPayments) {
		Car c = CustomerCarLot.customerCars.get(index);
		double paymentDue = c.getCost() - payment*numPayments;
		return paymentDue;
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
