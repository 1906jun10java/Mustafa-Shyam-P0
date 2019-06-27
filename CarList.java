import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;

public class CarList {
	private static Scanner sc; // saves time on typing
	/*
	 * Integer yearManufactured[] = {2014 , 2017 , 2015 , 2018};
	 * 
	 * String make[] = {"Nissan", "McLaren", "Lamborghini", "Ferrari"};
	 * 
	 * String model[] = {"GT-R NISMO" , "720S" , "Huracan" , "488"};
	 * 
	 * String color[] = {"Black" , "White" , "Yellow" , "Red"};
	 * 
	 * String chassisType[] = {"Coupe" , "Coupe" , "Coupe" , "Coupe"};
	 * 
	 * Double cost[] = {75000.00 , 250000.00 , 200000.00 , 230000.00};
	 */

//public CarList(int yearManufactured, String make, String model, String color, String chassisType, double cost) {
	// TODO Auto-generated constructor stub
	// super();
//}

	public static void Inventory() {
		sc = new Scanner(System.in); // this instantiates Scanner object while saving time bc we created a Scanner
										// variable (Field is the correct term tho.)
		List<Car> cars = new ArrayList<Car>(); // reason we put <Car> in the generic is bc we want to make sure all the
												// objects are Car objects ONLY !!!
		System.out.println("How many cars would you like to add ? ");
		while (!sc.hasNextInt()) {
			System.out.println("dont be an idiot put a number please...");
			sc.next();
			}
			//int numberOfCars = sc.nextInt();
			
			// do you want to put everything below in a loop
			
		for (int i = sc.nextInt(); i > 0; i--) {
			System.out.println("What is the maker of the vehicle ? ");
			String Make = sc.next();

			System.out.println("What is the model of the vehicle ? ");
			String Model = sc.next();

			System.out.println("What is year of the vehicle ? ");
			while (!sc.hasNextInt()) {
				System.out.println("dont be stupid put in the right value");
				sc.next();
			}
			int yearManufactured = sc.nextInt();
		

			System.out.println("What color is the vehicle ? ");
			String color = sc.next();

			System.out.println("What body style is the vehicle ? ");
			String chassisType = sc.next();

			System.out.println("How much is the cost of the vehicle ? ");
			while (!sc.hasNextDouble()) {
				System.out.println("dont be stupid put in the right value");
				sc.next();
			}
			Double cost = sc.nextDouble();

			cars.add(new Car(Make, Model, yearManufactured, color, chassisType, cost));
		}

		for (Car c : cars) {
			System.out.println(cars);
		}

		// cars.add(new CarList(2014, "McClaren", "720S", null, null, 250000.00));
		// cars.add(new CarList(2014, "", "GT-syR NISMO", null, null, 75000.00));
		// cars.add(new CarList());
		// cars.add(new CarList());
		// System.out.println("Current Car Inventory: ");
		// printCar(cars);
	}

	public static void main(String args[]) {
		Inventory();
	}

//static void sortWithComparable(List<CarList> cars) {
//	Collections.sort(cars);
//}

	static void printCars(List<CarList> cars) {
		Iterator<CarList> it = cars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
