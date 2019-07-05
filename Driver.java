package project0;

import java.util.Scanner;

import project0.beans.Car;
import project0.beans.Customer;
import project0.functions.CarLot;
import project0.functions.CustomerLogin;
import project0.functions.CustomerUserMenu;
import project0.functions.Utility;

public class Driver {
	private static ScannerSingleton ss = null;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap<String, String> map= new HashMap<>();
		 * 
		 * boolean authenticate(String username, int noOfAttempts) { Credentials
		 * ceredentials = getCredentials(username);
		 * 
		 * for(int attempt = 1; attempt < noOfAttempts; attempt++) { char[] password =
		 * promptForPassword();
		 * 
		 * if(credentials.match(passowrd)) { return true; }else { wrongPassword(attempt,
		 * noOfAttempts);
		 * 
		 * } } return false; }
		 */
		Customer c = new Customer("Shyam", "Vasanjee", "shyamuu", "catch22!");
	
		CustomerLogin.customerlogin.put("shyamuu", c);
		Car car = new Car("Honda", "civic",2005,"red", "sedan", 5000.00, 1236);
		CarLot.cars.add(car);
		System.out.println(CustomerLogin.Attempt("shyamuu", "catch22!"));
		//Menu.mainMenu();
		//MenuSwitch.MainMenu();
		
	
		
		
		

		//sc.close();
		
	}
	
	
	
	
	
	
	}
