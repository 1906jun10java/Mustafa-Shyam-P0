package project0;

import static project0.functions.CarLot.ViewCar;
import static project0.functions.CarLot.cars;

import java.util.Scanner;

import project0.beans.Car;
import project0.functions.Utility;
import project0.functions.services;

public class EmployeeSwitch {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void EmployeeMenu() {
					
						boolean quit = false;
			
while(!quit) {
	int Emploption = Utility.getEmpSelection() ;
			switch (Emploption) {
			


			case 1:// Add and Remove cars
				System.out.println("Would you like to add cars or remove cars?<add/remove>");
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
				ViewCar(cars);
				break;
			case 3:// Offers available
				System.out.println("Check offers");
				System.out.println("Choose car: ");
				Car c = cars.get(sc.nextInt()-1);
				System.out.println("This is the car's VIN"+c.getVIN());
				int Vin = c.getVIN();
				sc.next();
				System.out.println("Type in the OfferID: ");
				int OfferID = Utility.getNumber();
				Offers.offerChk(OfferID, Vin);
				Offers.ViewOfferList();
				System.out.println("Would you like to accept or reject an offer? <A/R>");
				String response = sc.nextLine();
				if(response.equalsIgnoreCase("A")) {
					Offers.AcceptOffer();
					
				}else {
					Offers.DeclineOffer();
				}
				
				break;
			case 4:
				// View all payments
				System.out.println("View all payments!");
				services.viewAllPayments();
			case 5: // return back to mainmenu
				quit = true;
				MenuSwitch.MainMenu();
				break;


			default:
				System.out.println("Invalid entry");
			}
		}
		//MenuSwitch.MainMenu();
	}}

