package project0.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import project0.ScannerSingleton;
import project0.beans.Car;
import project0.beans.Customer;

public class services {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();
	
	public static HashMap<String, List<Double>> CustomerPayments = new HashMap<>();

	public static List<Double> payments = new ArrayList<>();
	


	public static void paymentPrompt() {
		CarLot.viewCar(CarLot.cars);
		System.out.println("Choose car: ");
		int index = Utility.getNumber();
		System.out.println("How many months would you like to loan out your vehicle? ");
		int num_months = Utility.getNumber();
		System.out.println("How much for a downpayment? ");
		Double downpayment = Utility.getDoubleNumber();
		double payment = CarLot.pay(index, num_months, downpayment);
		System.out.println("This is the current monthly payment plan: "+ payment);
		payments.add(payment);
	}
	
	public static void paymentDuePrompt() {
		CustomerCarLot.viewCustomerCars(CustomerCarLot.customerCars);
		System.out.println("Grab your car: ");
		int index = sc.nextInt();
		System.out.println("How many months would you like to loan out your vehicle? ");
		int num_months = Utility.getNumber();
		System.out.println("How much for a downpayment? ");
		Double downpayment = Utility.getDoubleNumber();
		double payment = CarLot.pay(index, num_months, downpayment);
		System.out.println("This is the current monthly payment plan: "+ payment);
		payments.add(payment);
		double payment1 = payments.get(0) -downpayment;
		payments.add(payment1);
		System.out.println("How many payments would you like to make? ");
		int numPayments = sc.nextInt();
		double amountDue = CarLot.amountDue(payment1,index, numPayments);
		System.out.println("This is the amount due: "+amountDue);
		// add amount and view payments
	}
// Access payment and figure amount due
	
	public static List<Double> viewAllPayments(String username) {
		CustomerPayments.containsKey(username);
		Customer c = CustomerLogin.customerlogin.get(username);
		for (Double payment : payments) {
			System.out.println("Username: "+c.getUserName()+" payments: "+payment);
		}
		return payments;
	}

	public static void addPayment(Double payment) {
		payments.add(payment);
	}
	public static int IDgenerator() {
		int prime = 29;
		int result = 1;
		int rand = 0;
		for (int i = 0; i < 100000; i++) { 
            rand = (int)(Math.random() * 100000) + i;
		}
		result = prime*result*rand;
	return  result;
	}

	public static void Inventory(List<Car> cars) {
		int VIN = IDgenerator();
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
			System.out.println("This is your car's VIN: ");
			
			Car c = new Car(VIN, Make, model, yearManufactured, chassisType, cost, color);
			CarLot.addCar(c);
		}
		CarLot.viewCar(cars);
	}

	public static void Remove(List<Car> cars) {//
		CarLot.viewCar(cars);
		System.out.println("Choose car: ");
		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException n) {
			System.out.println("Invalid Entry!");
		}

		cars.remove(choice);

		CarLot.viewCar(cars);
		

	}

}
