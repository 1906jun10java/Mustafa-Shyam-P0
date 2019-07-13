package project0;

import static project0.functions.CarLot.cars;

import java.util.Scanner;

import project0.functions.CarLot;
import project0.functions.CustomerUserMenu;
import project0.functions.EmployeeUserMenu;
import project0.functions.Utility;

public class MenuSwitch {
	
// Scanner Singleton instantiates one scanner object for this class
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void MainMenu() {
		// MainMenu options menu
		boolean exit = false;
		while(!exit) {
			int menuItem = Utility.getMenuSelection();// prompts the options that the user can choose from
			System.out.println("MenuItem: "+ menuItem);
			switch (menuItem) {
			case 1:// customer access
				menuItem = 0;
				CustomerUserMenu.CUser();// sends to customer user menu
				
				break;
			case 2:// Employee Access
				menuItem = 0;
				EmployeeUserMenu.EmpUsr();//sends to Employee user Menu
				
				break;
			case 3:// Cars available on lot
				CarLot.viewCar(cars);// shows all the cars in the lot
				
				break;
			case 4: // Register for online account
				CustomerUserMenu.registrations();//register form for customer who is not in the system
				break;
			case 5:// logout
				exit = true;// breaks out of loop and closes the program close
				break;

			default:
				System.out.println("Invalid try again");// respone that occurs when an option number is put in that does not exist
			}
		}
		System.out.println("Adios amigo, See you next time");// closing statment
		
	}
	
}
