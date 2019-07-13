package project0.functions;

import java.util.HashMap;

import org.apache.log4j.Logger;

import project0.EmployeeSwitch;
import project0.MenuSwitch;
import project0.beans.Employee;

public class EmployeeLogin {
	public static HashMap<Integer, Employee> employeeLogin = new HashMap<>();
	private static Logger Log = Logger.getRootLogger();

	public static void addEmp(Employee e) {
		employeeLogin.put(e.getId(), e);
	}

	public static boolean empChk(int id, String password) {
		boolean check = employeeLogin.containsKey(id);
		if (check == false) {
			System.out.println("You are not an employee!");
			Log.trace("this is false");
			return false;
		}
		Employee e = employeeLogin.get(id);
		if (password.contains(e.getPassword())) {
			System.out.println("You got Access!");
			EmployeeSwitch.EmployeeMenu();
			return true;
		}
		System.out.println("Incorrect password!");
		MenuSwitch.MainMenu();
		return false;

	}

}
