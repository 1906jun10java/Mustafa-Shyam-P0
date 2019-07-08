package project0;

import static project0.functions.CarLot.cars;

import java.util.Scanner;

import project0.functions.CarLot;
import project0.functions.CustomerUserMenu;
import project0.functions.EmployeeUserMenu;
import project0.functions.Utility;

public class MenuSwitch {
// method in the class can access the scanner 
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	public static void MainMenu() {
		
		boolean exit = false;
		while(exit != true) {
			int menuItem = Utility.getMenuSelection();
			switch (menuItem) {
			case 1:// customer access
				CustomerUserMenu.CUser();
				// do something;
				break;
			case 2:// Employee Access
				EmployeeUserMenu.EmpUsr();
				// do something;
				break;
			case 3:// Cars available on lot
				CarLot.ViewCar(cars);
				// do something;
				break;
			case 4: // Register for online account
				CustomerUserMenu.registrations();
				break;
			case 5:// logout
				exit = true;
				break;

			default:
				System.out.println("Invalid try again");
			}
		}
		System.out.println("Adios amigo, See you next time");
	}
}
