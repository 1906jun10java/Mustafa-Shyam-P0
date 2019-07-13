package project0;

import static project0.functions.CarLot.cars;

import java.util.Scanner;

import project0.beans.Customer;
import project0.functions.CarLot;
import project0.functions.CustomerLogin;
import project0.functions.Utility;
import project0.functions.services;

public class EmployeeSwitch {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void EmployeeMenu() {

		boolean quit = false;
		
		while (!quit) {
			int Emploption = Utility.getEmpSelection();
			System.out.println("emploption selector: "+Emploption);
			switch (Emploption) {

			case 1:// Add and Remove cars
				System.out.println("Would you like to add cars or remove cars? <add/remove> ");// prompts employee if they
																								// want to add or remove
				String answer = sc.next();
				if (answer.equalsIgnoreCase("add")) {
					services.Inventory(cars);
					break;
				} else if (answer.equalsIgnoreCase("remove")) {
					services.Remove(cars);
					break;

				}

				break;

			case 2:// List of cars
				CarLot.viewCar(cars);
				break;
			case 3:// Offers available
				Offers.PromptOfferEmp();

				break;
			case 4:
				// View all payments
				System.out.println("Enter Customer's Username: ");
				String username = sc.next();
				Customer c = CustomerLogin.customerlogin.get(username);
				services.viewAllPayments(c.getUserName());
			case 5: // return back to mainmenu
				quit = true;
				MenuSwitch.MainMenu();
				break;

			default:
				System.out.println("Invalid entry");
			}
			

		}
		// MenuSwitch.MainMenu();

	}
}
