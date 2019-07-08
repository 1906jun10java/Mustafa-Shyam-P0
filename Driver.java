package project0;

import project0.beans.Car;
import project0.beans.Customer;
import project0.beans.Employee;
import project0.beans.Offer;
import project0.functions.CarLot;
import project0.functions.CustomerLogin;
import project0.functions.EmployeeLogin;
import project0DAOs.ConnectionFactory;

public class Driver {
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
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
		Customer c = new Customer("Shyam", "Vasanjee", "JohnnyQ", "Quest!");
	
		CustomerLogin.customerlogin.put("shyamuu", c);
		Car car = new Car(1236, "Honda", "civic",2005, "sedan", 5000.00, "red");
		CarLot.cars.add(car);
		Offer o = new Offer(200.00, "pending", 1236);
		Offers.OfferList.add(o);
		Employee e = new Employee("catch22!", 1337);
		EmployeeLogin.employeeLogin.put(1337,e);
		//System.out.println(CustomerLogin.Attempt("shyamuu", "catch22!"));
		//Menu.mainMenu();
		
		
		MenuSwitch.MainMenu();
		
//		
		
	
		
		//sc.close();
		
	}
	
	
	
	
	
	
	}
