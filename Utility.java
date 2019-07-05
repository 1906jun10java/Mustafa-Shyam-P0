package project0.functions;

import java.util.Scanner;

import project0.ScannerSingleton;

public class Utility {

	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();

	// make switch that takes all parameters and checks if it is that datatype and
	// if it is then continue
	public static int getMenuSelection() {
		System.out.println("Main Menu\n\n1)Customer Login\n2)Employee Login\n3)Cars\n4)Register\n5)Logout\n");
		System.out.println("Please choose an option ");
		int name = sc.nextInt();
		return name;

	}
	public static Integer getNumber() {
		return Integer.parseInt(sc.next());
	}
	public static int getCustSelection() {
		System.out.println("Customer realm\n\n1)Payments\n2)Cars owned\n3)Offer\n4)Logout");
		System.out.println("Please choose an option");
		return sc.nextInt();
	}
	public static int getEmpSelection() {
		System.out.println("Employee Access\n\n1)Add/Remove Cars\n2)Cars\n3)Offer\n4)View all payments\n5)Logout");
		System.out.println("Please choose an option ");
		return sc.nextInt();
	}
	}

