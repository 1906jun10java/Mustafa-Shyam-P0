package project0.functions;

import java.util.Scanner;

import project0.CustomerSwitch;
import project0.ScannerSingleton;

public class CustomerUserMenu {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void CUser() {
		boolean exit = false;
		System.out.println("Do you have an AWESOME account with our dealership?<Y/N>");

		while (exit!= true) {
			//Scanner sc = new Scanner(System.in);
			String response = sc.nextLine();
			
			if (response.equalsIgnoreCase("Y")) {

				System.out.println("Enter UserName: ");// prompt user to input username

				String username = sc.nextLine();
				System.out.println("Enter Password: ");// prompt user to input pass
				// user types pass
				String pass = sc.nextLine();
				boolean thing = CustomerLogin.Attempt(username, pass);
				if(thing == true) {
					CustomerSwitch.CustomerMenu();
				}
				else {
					registrations();
					
				}

			} /*
				 * else if (response.equalsIgnoreCase("N")) { registrations();
				 * System.out.println("You got access!"); CustomerSwitch.CustomerMenu();
				 * 
				 * } else { exit = true; }
				 */
		}
	}

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
		CustomerLogin.Register(FirstName, LastName, username, pass);
		System.out.println("You got access!");
		CustomerSwitch.CustomerMenu();

	}
}
