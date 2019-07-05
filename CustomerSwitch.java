package project0;

import java.util.Scanner;

import project0.functions.CarLot;
import project0.functions.Utility;

public class CustomerSwitch {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();


	public static void CustomerMenu() {
		
		boolean Exit = false;
		while (Exit != true) {
			int custoptn = Utility.getCustSelection();
			switch (custoptn) {
			case 1:
				System.out.println("How many months would you like to loan out your vehicle? ");
				while (!sc.hasNextInt()) {
					System.out.println("Type in a integer value above 0 ");
					sc.next();
				}
				int num_Mon = sc.nextInt();
				CarLot.Payment(num_Mon);

				// cost/ # of months for loan(monthly bill) subtracted from total cost
				break;
			case 2:
				System.out.println("My cars");// list of cars
				CarLot.ViewCar(CarLot.cars);
				break;
			case 3:
				System.out.println("Offer available (Accept or decline)");
				break;
			case 4:// logout

				Exit = true;
				break;
			default:
				System.out.println("U dun F'ed up!");
			}
		}
	}
}
