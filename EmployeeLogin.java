package project0.functions;

import java.util.HashMap;

import project0.beans.Employee;

public class EmployeeLogin {
	static HashMap<Integer, Employee> employeeLogin = new HashMap<>();
	
	
	
	
	//checking if the employee exists in the database
	//if employee exists grant access
	// search for customers
	public static boolean empChk(int id, String password) {
	boolean check = employeeLogin.containsKey(id);
	if(check ==  false) {
		System.out.println("You are not an employee!");
		return false;
	}
	Employee e = employeeLogin.get(id);
	if(password.contains(e.getPassword())) {
		System.out.println("You got Access!");
		return true;
	}System.out.println("Incorrect password!");
	return false;
	
	}
	

}
