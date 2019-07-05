package project0;

import static project0.functions.CarLot.ViewCar;
import static project0.functions.CarLot.cars;

import java.util.Scanner;

import project0.functions.Utility;

public class EmployeeSwitch {
	private static Scanner sc;

	public static void EmployeeMenu() {
					
						boolean quit = false;
			
while(quit != true) {
	int Emploption = Utility.getEmpSelection() ;
			switch (Emploption) {
			


			case 1:// Add and Remove cars
				System.out.println("Would you like to add cars or remove cars?<add/remove>");
				String answer = sc.next();
				if (answer.equalsIgnoreCase("add")) {
					Menu.Inventory(cars);
					break;
				} else if (answer.equalsIgnoreCase("remove")) {
					Menu.Remove(cars);
					break;
					
				}EmployeeMenu();
				
				break;

			case 2:// List of cars
				ViewCar(cars);
				break;
			case 3:// Offers available
				System.out.println("Offer available (Accept or decline)");
				break;
			case 4:
				// View all payments
				System.out.println("View all payments!");
			case 5: // return back to mainmenu
				quit = true;
				


			default:
				System.out.println("U dun F'ed up!");
			}
		}
		MenuSwitch.MainMenu();
	}}

