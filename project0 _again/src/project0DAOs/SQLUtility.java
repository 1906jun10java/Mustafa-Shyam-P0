package project0DAOs;

import java.sql.SQLException;

import project0.beans.Car;
import project0.beans.Customer;
import project0.beans.Employee;
import project0.beans.Offer;

public class SQLUtility {

	public static void carAddSQL(Car c) {// used to catch exceptions when adding car to SQL Car table
		CarLotDAO cld = new CarLotDAO();
		try {
			cld.makeCar(c);
		} catch (SQLException e) {
			
		}
	}
	public static void carAddJava() {// Adds cars from SQL table to Java list and catches any exception that may occur during the transaction
		CarLotDAO cld = new CarLotDAO();
		try {
			cld.getCarList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void custRegisterSql(Customer c) {// Adds customer to cust table and catches and errors that may occur during the transition
		CustomerDAO cd = new CustomerDAO();
		try {
			cd.createCustomer(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void custAccessToJava() {// pulls information from the SQL table and adds it into to map
		CustomerDAO cd = new CustomerDAO();// also catches any checked exceptions that may occur during the transition
		try {
			cd.getCustomerList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void empAddSQL(Employee e) {// adds an employee to the SQL table Emp
		EmployeeDao ed = new EmployeeDao();// also catches any checked exceptions that may occue during the transition
		try {
			ed.createEmployee(e);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	public static void empAccessToJava() {// pulls information from SQL table and adds it to a map
		EmployeeDao ed = new EmployeeDao();
		try {
			ed.populateEmployee();
		} catch (SQLException e1) {//catches any checked exceptions that may occur during the transition
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void OfferAddSQL(Offer o) {// adds offers from jave side to SQL table Offer
		OfferDAO od = new OfferDAO();
		try {
			od.createOffer(o);
		} catch (SQLException e) {// catches any exception that may occur during the transition
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void OfferAccessToJava() {// pulls information from SQL side and puts it into a list of offers
		OfferDAO od = new OfferDAO();
		try {
			od.getOfferList();
		} catch (SQLException e) {// catches any exception that may occur during the transition
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
