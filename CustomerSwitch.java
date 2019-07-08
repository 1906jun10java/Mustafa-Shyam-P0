package project0;

import java.util.Scanner;

import project0.functions.CarLot;
import project0.functions.Utility;
import project0.functions.services;

public class CustomerSwitch {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();


	public static void CustomerMenu() {
		
		boolean Exit = false;
		while (Exit != true) {
			int custoptn = Utility.getCustSelection();
			switch (custoptn) {
			case 1:
				services.PaymentPrompt();

				// cost/ # of months for loan(monthly bill) subtracted from total cost
				break;
			case 2:
				System.out.println("My cars");// list of cars
				CarLot.ViewCar(CarLot.cars);
				break;
			case 3:
				System.out.println("Offers");
				Offers.PromptOffer();
				
				break;
			case 4:// logout
				MenuSwitch.MainMenu();

				Exit = true;
				
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}
	}
}
