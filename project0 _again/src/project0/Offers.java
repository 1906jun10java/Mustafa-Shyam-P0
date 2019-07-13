package project0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import project0.beans.Car;
import project0.beans.Customer;
import project0.beans.Offer;
import project0.functions.CarLot;
import project0.functions.CustomerCarLot;
import project0.functions.CustomerLogin;
import project0.functions.services;
import project0DAOs.SQLUtility;

public class Offers {

	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();
	
	public static HashMap<Integer, Offer> CustomerOffer = new HashMap<>();// Hashmap used to relate VIN with OfferID
	public static List<Offer> OfferList = new ArrayList<Offer>();// List of offers made by customers

	
	public static boolean offerChk(Integer VIN, Integer offerID) {
		// method used to have customer make an offer on a vehicle
		boolean check;
		check = CustomerOffer.containsKey(VIN);// uses VIN as a key to check if offer is in the database
		if (check == false) {
			System.out.println("No offers have been made on the vehicle");// if not, prints statement
			return false;
		}
		Offer o = CustomerOffer.get(VIN);// Otherwise, uses key to access offer object in hashmap
		if (offerID.equals(o.getOfferID())) {// checks offerID input is the same as offerId for the offer object
			SQLUtility.OfferAddSQL(o);// adds to SQL table
			makeOffer(o);

			return true;
		} else {
			System.out.println("No offers made");
			// make an offer or return back to main menu
			CustomerSwitch.CustomerMenu();
		}
		return false;
	}

	public static boolean OfferListChk(String username) {
		// method used by employee to check pending offers from customers
		Customer c = CustomerLogin.customerlogin.get(username);// uses username as key to grab customer object
		System.out.println(username);// returns username
		if (username.equals(c.getUserName())) {// checks username is the same as customer object's username
			System.out.println("List of offers made from " + c.getFirstname());// if true, prints their name and list of
																				// offers
			viewOfferList();// prints list of offers associated with customer
			return true;
		} else {
			System.out.println("No offers were made");//
			EmployeeSwitch.EmployeeMenu();// returns back to employee menu
		}
		return false;

	}

	public static void makeOffer(Offer o) {
		OfferList.add(o);// adds offer to the offerList
	}

	public static boolean DeclineOffer(int index) {
		if (OfferList.isEmpty()) {
			System.out.println("Customer has no offers available..");
			EmployeeSwitch.EmployeeMenu();
			return false;
		} else {
			viewOfferList();
			Offer o = OfferList.get(index);
			OfferList.remove(o);
			return true;
		}
	}

	public static List<Offer> viewOfferList() {
		Collections.sort(OfferList, (arg0, arg1) -> {
			return arg0.getOfferID().compareTo(arg1.getOfferID());// organizes the offer by ID in ascending order
		});
		int i = 0;
		for (Offer o : OfferList) {// prints out the offer in the Offerlist
			System.out.println(i + ") " + o);
			++i;
		}
		return OfferList;
	}

	public static boolean AcceptOffer(int index) {
		if (OfferList.isEmpty()) {// checks if offerList is empty
			System.out.println("No offers have been made..");// prints statment if the offerList is empty
			return false;
		} else {
			// shows offer list for the customer
			Offer o = OfferList.get(index);// accesses the offer
			o.setOfferStatus("Accepted!");// changes the offer status to accepted
			CustomerCarLot.carCheck(o);
			for (Iterator<Offer> iter = OfferList.iterator(); iter.hasNext();) {
				Offer offer = iter.next();
				if (offer.getOfferStatus().equals("pending")) {
					iter.remove();
				}
			}
		}
		viewOfferList();
		return true;
	}

	public static void PromptOffer() {// prompt for customer to make an offer on a vehicle and add it to Offer table
		CarLot.viewCar(CarLot.cars);
		Integer OfferID = services.IDgenerator();
		System.out.println("Choose car:");
		Car c = CarLot.cars.get(sc.nextInt());
		Integer ID = c.getVIN();
		System.out.println("How much would you like to offer on the vehicle? ");
		Double offer = sc.nextDouble();
		System.out.println("Your offer is: $ " + offer);
		System.out.println("Your " +c.getModel()+ " VIN number is: " + ID + OfferID);
		offerChk(ID, OfferID);

	}

	public static void PromptOfferEmp() {
//		System.out.println("Enter Cutomer's Username: ");
//		String username = sc.next();// Accesses Customer's offerList and
//		OfferListChk(username);
		viewOfferList();
		System.out.println("Would like to Accept or Decline the offer? <A/D>");
		String response = sc.next();
		if (response.equalsIgnoreCase("A")) {// checks if employee said yes or no
			viewOfferList();
			System.out.println("Choose offer: ");
			int index = sc.nextInt();
			AcceptOffer(index);// accepts the offer
			// prints offer and it's offer status accepted
		} else {
			viewOfferList();
			System.out.println("Choose offer: ");
			int index = sc.nextInt();
			DeclineOffer(index);// removes offer
		}
		EmployeeSwitch.EmployeeMenu();// return Employee Menu
	}

}
