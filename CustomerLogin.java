package project0.functions;

import java.util.HashMap;

import project0.beans.Customer;

public class CustomerLogin {
	public static HashMap<String, Customer> customerlogin = new HashMap<>();
	
	public static boolean Attempt(String username, String password) {
		// checking if customer exists in the database
		boolean check;
		check = customerlogin.containsKey(username);
		if(check == false) {
			System.out.println("Please Register!");
			return false;
		}
		Customer c = customerlogin.get(username);// get that customers username
		if(password.equals(c.getPassword())) {// checks pass
			return true;
		}else {
			System.out.println("Incorrect Password!");
		}return false;
	
	}
	//Registering a customer
	public static boolean Register(String FirstName, String LastName, String UserName, String PassWord) {
		if(UserName != null) {
			if(PassWord !=  null) {
				Customer c = new Customer(FirstName, LastName, UserName, PassWord);
				customerlogin.put(UserName, c);
				return true;
				
			}
		System.out.println("Fill in all the fields completely!");
		}return false;
	}
	public static Customer returnCustomer(String username) {
		// return their username
		return customerlogin.get(username);
	}

}
