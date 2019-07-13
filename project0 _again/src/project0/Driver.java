package project0;

import java.util.Scanner;

import project0DAOs.ConnectionFactory;
import project0DAOs.SQLUtility;

public class Driver {
	public static ConnectionFactory cf = ConnectionFactory.getInstance();

	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void main(String[] args) {
		/*
		 * Customer c = new Customer("Shyam", "Vasanjee", "JohnnyQ", "Quest!");
		 * CustomerLogin.addCustomer(c); Car car = new Car(1236, "Honda", "civic",2005,
		 * "sedan", 5000.00, "red"); CarLot.cars.add(car); Offer o = new Offer(1,
		 * "JohnnyQ", 1236, 200.00, "pending"); Offers.makeOffer(o); //
		 * Offers.ViewOfferList(); Employee e = new Employee("catch22!", 1337);
		 * EmployeeLogin.employeeLogin.put(1337,e);
		 */
		SQLUtility.carAddJava();
		SQLUtility.custAccessToJava();
		SQLUtility.empAccessToJava();
		SQLUtility.OfferAccessToJava();
		MenuSwitch.MainMenu();

	}

}
