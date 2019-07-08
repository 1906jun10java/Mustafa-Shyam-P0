package project0.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import project0.ScannerSingleton;
import project0.beans.Car;
import project0DAOs.SQLUtility;

public class services {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();
	
	public static HashMap<String, ArrayList<Double>> Mypayments = new HashMap<>();

	public static List<Double> payments = new ArrayList<>();

	public static void PaymentPrompt() {
		CarLot.ViewCar(CarLot.cars);
		System.out.println("Choose car: ");
		int index = Utility.getNumber() - 1;
		System.out.println("How many months would you like to loan out your vehicle? ");
		int num_months = Utility.getNumber();
		System.out.println("How much for a downpayment? ");
		Double downpayment = Utility.getDoubleNumber();
		CarLot.Pay(index, num_months, downpayment);
	}

	public static List<Double> viewAllPayments() {
		for (Double payment : payments) {
			System.out.println(payment);
		}
		return payments;
	}

	public static void addPayment(Double payment) {
		payments.add(payment);
	}

	public static void Inventory(List<Car> cars) {
		for (int i = 1; i > 0; i--) {
			System.out.println("What is the make of the car you would like to add?");
			String Make = sc.next();
			System.out.println("What is the model of that car?");
			String model = sc.next();
			System.out.println("What year was this car manufactured?");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Entry!");
				sc.next();
			}
			int yearManufactured = sc.nextInt();
			System.out.println("What color is the car? ");
			String color = sc.next();
			System.out.println("What body style does the car have? ");
			String chassisType = sc.next();
			System.out.println("How much does the car cost?");
			Double cost = sc.nextDouble();
			System.out.println("VIN number: ");
			int VIN = sc.nextInt();
			Car c = new Car(VIN, Make, model, yearManufactured, chassisType, cost, color);
			SQLUtility.carAddSQL(c);
		}
		CarLot.ViewCar(cars);
	}

	public static void Remove(List<Car> cars) {

		System.out.println("What is the make of the car you would like to remove?");
		String Make = sc.next();
		System.out.println("What is the model of that car?");
		String model = sc.next();
		System.out.println("What year was this car manufactured?");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Entry!");
			sc.next();
		}
		int yearManufactured = sc.nextInt();
		System.out.println("What color is the car? ");
		String color = sc.next();
		System.out.println("What body style does the car have? ");
		String chassisType = sc.next();
		System.out.println("How much does the car cost?");
		while (!sc.hasNextDouble()) {
			System.out.println("Invalid Entry!");
			sc.next();
		}
		Double cost = sc.nextDouble();
		System.out.println("Vin number: ");
		int VIN = 0;
		try {
			VIN = sc.nextInt();
		} catch (InputMismatchException n) {
			System.out.println("Invalid Entry!");
		}

		Car c = new Car(VIN, Make, model, yearManufactured, chassisType, cost, color);
		cars.remove(c);

		CarLot.ViewCar(cars);
		

	}

}
