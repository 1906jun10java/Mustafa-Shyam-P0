package project0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import project0.beans.Car;
import project0.functions.CarLot;
import project0.functions.EmployeeLogin;


// enum{1, 2, 3, 4, 5} try when separating switch cases into different classes
public class Menu {
	
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static List<Car> cars = new ArrayList<>();

	static void mainMenu() {
		sc = new Scanner(System.in);
		// print menu
		System.out.println("Main Menu\n\n1)Customer Login\n2)Employee Login\n3)Cars\n4)Register\n5)exit\n");
		//
		// List<Car> cars = new ArrayList<>();
		

		boolean quit = false;

		int menuItem;
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Type in an integer");
				sc.next();
			}

			menuItem = sc.nextInt();

			switch (menuItem) {
			case 1:// customer access
				CuserMenu();
				// do something;
				break;
			case 2:// Employee Access
				empUserMenu();
				// do something;
				break;
			case 3:// Cars available on lot
				CarLot.ViewCar(cars);
				// do something;
				break;
			case 4: // Register for online account
				registration();
				break;
			case 5:// Exit
				System.out.println("Quit!");
				quit = true;
				break;
			default:
				System.out.println("U dun f'ed up...");
			}// continue to loop
		} while (!quit);
		System.out.println("Adios, amigo..");

	}

	static void customerMenu() {
		sc = new Scanner(System.in);
		// customer options 
		boolean Exit = false;

		System.out.println("Customer realm\n\n1)Payments\n2)Cars owned\n3)Offer\n4)Logout");
		while (Exit != true){
			int custoptn = sc.nextInt();

			switch (custoptn) {
			case 1:
				// payments
				System.out.println("How many months would you like to loan out your vehicle? ");
				while(!sc.hasNextInt()) {
					System.out.println("Type in a integer value above 0 ");
					sc.next();
				}
				int num_Mon = sc.nextInt();
				CarLot.Payment(num_Mon);
				System.out.println("Would you like to return to the Customer homepage?<Y/N>");
				String response = sc.next();
				if(response.equalsIgnoreCase("Y")){
					customerMenu();
				}
				break;
			case 2:
				System.out.println("My cars");// list of cars
				CarLot.ViewCar(cars);
				break;
			case 3:
				System.out.println("Make an Offer(Add vin number for car and offer to the hashmap)");
				break;
			case 4:
				System.out.println("Exit!");
				Exit = true;
				break;
			default:
				System.out.println("U dun F'ed up!");
			}
		
		System.out.println("Au revoir ami!");
		mainMenu();
		}
	}

	static void CuserMenu() {

		sc = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("Do you have an account with our dealership?<Y/N>");
			String response = sc.next();
			if (response.equalsIgnoreCase("Y")) {

				System.out.println("Enter UserName: ");// prompt user to input username
				while (!sc.hasNext()) {
					System.out.println("Invalid Entry, Try again!");
					sc.next();
				}
				String username = sc.next();
				System.out.println("Enter Password: ");// prompt user to input pass
				while (!sc.hasNext()) {
					System.out.println("Invalid Entry");
					sc.nextLine();
				} // user types pass
				String pass = sc.next();
				System.out.println("Confirm Password: ");
				while (!sc.hasNext()) {
					System.out.println("Invalid Entry");
					sc.nextLine();
				}
				String pass1 = sc.next();
				//CustomerLogin.Attempt(username, pass);
				//if(CustomerLogin.Attempt(username, pass)== false) {
					
				//}
				// Authentication
				for (int attempt = 1; attempt < 3; attempt++) {
					if (pass != null && pass.contentEquals(pass1)) {

						System.out.println("Welcome to Customer Home screen");
						customerMenu();
						break;
					} else {
						System.out.println("Try again!");
						System.out.println("Username: ");
						username = sc.next();
						System.out.println("PassWord: ");
						pass = sc.next();
						if (pass != null && pass.contentEquals(pass1)) {
							customerMenu();
						} else if (attempt == 3) {
							System.out.println("You are locked out of your account!");
						}
					}
				}
			} else {
				registration();
			}
		} while (!exit);
		System.out.println("return back to main menu");
		mainMenu();
	}

	static void empUserMenu() {
		sc = new Scanner(System.in);
		boolean exit = false;
		do {

			System.out.println("Enter Employee Id: ");// prompt user to input username
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Entry");
				sc.next();
			}
			int id = sc.nextInt();
			System.out.println("Enter Password: ");// prompt user to input pass
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry");
				sc.next();
			} // user types pass
			String password = sc.next();
			EmployeeLogin.empChk(id, password);
			/*System.out.println("Confirm Password: ");
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry");
				sc.next();
			}
			String pass1 = sc.next();*/
			// Authentication
			/*if (pass.contentEquals(pass1)) {
				System.out.println("Welcome to Customer Home screen");
				employeeMenu();
			} else if (!pass.contentEquals(pass1)) {
				System.out.println("Try again!");
				System.out.println("Would you like to return back to the main menu? Y/N ");
				String answer = sc.next();
				if (answer.contentEquals("Y")) {
					break;
				} else {
					empUserMenu();
				}*/
			}
		 while (!exit);
		System.out.println("return back to main menu");
		mainMenu();
	}

	static void Inventory(List<Car> cars) {
		sc = new Scanner(System.in);
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
			while (!sc.hasNextDouble()) {
				System.out.println("Invalid Entry!");
				sc.next();
			}
			Double cost = sc.nextDouble();
			Car c = new Car(Make, model, yearManufactured, color, chassisType, cost, 1001);
			CarLot.addCar(c);
		}
		CarLot.ViewCar(cars);
	}

	static void Remove(List<Car> cars) {
		sc = new Scanner(System.in);
		System.out.println("How many cars would you like to remove?");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Entry! Try Again..");
			sc.next();
		}

		for (int i = 0; i < sc.nextInt(); i++) {
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
			Car c = new Car(Make, model, yearManufactured, color, chassisType, cost, 1003);

			cars.remove(c);

		}
		CarLot.ViewCar(cars);

	}

	static void employeeMenu() {
		// Add cars to lots--X
		// Remove cars from the lot--X
		// View all payments
		// Add or reject pending offer on a car
		sc = new Scanner(System.in);
		int Emploptn;// customer options keys
		boolean exit = false;

		System.out.println("Employee Access\n\n1)Add/Remove Cars\n2)Cars\n3)Offer\n4)View all payments\n5)Exit");
		do {
			Emploptn = sc.nextInt();

			switch (Emploptn) {
			case 1:// Add and Remove cars
				System.out.println("Would you like to add cars or remove cars?<add/remove>");
				String answer = sc.next();
				if (answer.contentEquals("add")) {
					Inventory(cars);
					break;
				} else if (answer.contentEquals("remove")) {
					Remove(cars);
					break;
				}
				employeeMenu();
				break;
			case 2:// List of cars
				System.out.println("My cars");// list of cars
				CarLot.ViewCar(cars);
				break;
			case 3:// Offers available
				System.out.println("Offer available (Accept or decline)");
				break;
			case 4:
				// View all payments
				
				

			case 5:
				System.out.println("Exit!");
				exit = true;
				break;
			default:
				System.out.println("U dun F'ed up!");
			}
		} while (!exit);
		System.out.println("Au revoir ami!");

	}

	
	static void registration() {
		System.out.println("Enter First Name: ");
		String FirstName = sc.next();
		System.out.println("Enter Last Name: ");
		String LastName = sc.next();

		System.out.println("Enter UserName: ");// prompt user to input username
		while (!sc.hasNext()) {
			System.out.println("Invalid Entry, Try again!");
			sc.next();
		}
		String username = sc.next();
		System.out.println("Enter Password: ");// prompt user to input pass
		while (!sc.hasNext()) {
			System.out.println("Invalid Entry");
			sc.nextLine();
		} // user types pass
		String pass = sc.next();
		System.out.println("Confirm Password: ");
		while (!sc.hasNext()) {
			System.out.println("Invalid Entry");
			sc.nextLine();
		}
		String pass1 = sc.next();
		// Authentication
		for (int attempt = 1; attempt < 3; attempt++) {
			if (pass != null && pass.contentEquals(pass1)) {

				System.out.println("Welcome to Customer Home screen");
				customerMenu();
				break;
			} else {
				System.out.println("Try again!");
				System.out.println("Username: ");
				username = sc.next();
				System.out.println("PassWord: ");
				pass = sc.next();
				if (pass != null && pass.contentEquals(pass1)) {
					customerMenu();
				} else if (attempt == 3) {
					System.out.println("You are locked out of your account!");
				}
			}
		}

	}

	static void Offer(List<Car> cars) {
		System.out.println("Would you like to make an offer on a car? <Y/N>");
		CarLot.ViewCar(cars);
		System.out.println("Choose vehicle that you would like to bid on?");
		// view all cars
		//How much the offer will be?
		// add car to list, price hashmap -- makes an offer
		// same list for employee
		//Employee looks at list of offers and accepts or declines the offer 
		//declines removes the object from the offer list
		//accepts adds the car to customer's car list

		
			
			
		}

	}

