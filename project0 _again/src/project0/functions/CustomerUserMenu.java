package project0.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project0.CustomerSwitch;
import project0.ScannerSingleton;
import project0.beans.Car;

public class CustomerUserMenu {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void CUser() {
		boolean exit = false;
		System.out.println("Do you have an AWESOME account with our dealership?<Y/N>");
// asks if you are  a member of the customer system
		while (exit != true) {

			String response = sc.next();

			if (response.equalsIgnoreCase("Y")) {// used to check if the user typed in y

				System.out.println("Enter UserName: ");// prompt user to input username

				String username = sc.next();
				System.out.println("Enter Password: ");// prompt user to input pass
				// user types pass
				String password = sc.next();
				CustomerLogin.Attempt(username, password);// checks if customer is in the map
			}else {
				registrations();
			}
		}

	}

	public static List<Car> Mycars = new ArrayList<>();
	

	public static void registrations() {
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
		CustomerLogin.Register(username, FirstName, LastName, pass);// register customer to the map
		System.out.println("You got access!");
		CustomerSwitch.CustomerMenu();// then gives them access to the CustomerMenu

	}
}
