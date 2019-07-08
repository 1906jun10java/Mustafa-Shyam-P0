package project0.functions;

import java.util.HashMap;

import project0.beans.Customer;
import project0DAOs.SQLUtility;

public class CustomerLogin {
	public static HashMap<String, Customer> customerlogin = new HashMap<>();
	
	public static void addCustomer(Customer c) {
		customerlogin.put(c.getUserName(), c);
	}
	
	public static boolean Attempt(String username, String password) {
		// checking if customer exists in the database
		boolean check;
		check = customerlogin.containsKey(username);
		if(check == false) {
			System.out.println("Please Register!");//Customer not found, then customer is asked to register
			return false;
		}
		Customer c = customerlogin.get(username);// Customer is in DB and accessing their username
		if(password.equals(c.getPassword())) {// uses username to gain access to the password and checks if they match
			return true;
		}else {
			System.out.println("Incorrect Password!");//if pass does not match then prints message and returns back to mainMenu
		}return false;
	
	}
	//Registering a customer
	public static boolean Register(String FirstName, String LastName, String UserName, String PassWord) {
		if(UserName != null) {
			if(PassWord !=  null) {
				Customer c = new Customer(FirstName, LastName, UserName, PassWord);// ask for all field parameters to be filled
				// adds customer into map
				SQLUtility.custRegisterSql(c);
				return true;
				
			}
		System.out.println("Fill in all the fields completely!");//prints an error message if fields are not complete
		}return false;
	}
	public static Customer returnCustomer(String username) {
		// accesses the customer's credentials through their username
		return customerlogin.get(username);
	}

}
