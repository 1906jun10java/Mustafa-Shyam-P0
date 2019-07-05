package project0.functions;

import java.util.Scanner;

import project0.EmployeeSwitch;
import project0.MenuSwitch;
import project0.ScannerSingleton;

public class EmployeeUserMenu {
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();
	
	public static void EmpUsr() {
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
			if(EmployeeLogin.empChk(id, password) == true) {
				EmployeeSwitch.EmployeeMenu();
			}else {
				exit = true;
			}
		}
		 while (!exit);
		System.out.println("return back to main menu");
		MenuSwitch.MainMenu();
	}

}
