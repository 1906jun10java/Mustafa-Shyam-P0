package project0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import project0.beans.Car;
import project0.beans.Customer;
import project0.beans.Offer;
import project0.functions.CarLot;
import project0DAOs.SQLUtility;

public class Offers {
	
	static ScannerSingleton ss = ScannerSingleton.getInstance();
	static Scanner sc = ss.returnScanner();
	
	public static HashMap<Integer, Customer> CustomerOffer = new HashMap<>();
	public static List <Offer> OfferList = new ArrayList<Offer>();
	public static HashMap<Customer, List<Offer> > offers = new HashMap<>();
	
	public static boolean offerChk(Integer VIN, Integer offerID ) {
		// checking if offer was made exists in the database
		boolean check;
		check = CustomerOffer.containsKey(VIN);
		if(check == false) {
			System.out.println("Customer has made no offers on the vehicle");
			return false;
		}
		Customer c = CustomerOffer.get(VIN);
		if(VIN.equals(c.getUsername())) {
			Offer o = new Offer();
			makeOffer(o);
			//print out offers made
			return true;
		}else {
			System.out.println("No offers made");
			// make an offer or return back to main menu
			MenuSwitch.MainMenu();
		}return false;
	}
	public static boolean OfferListChk(Offer o, String username) {
		boolean check;
		check = offers.containsValue(o);
		if(check == false) {
			System.out.println("No customers found with this offer");
			return false;
		}
		Customer c = CustomerOffer.get(username);
		if(username.equals(c.getUserName())){
			System.out.println("List of offers from this "+c.getFirstname());
			ViewOfferList();
			return true;
		}else {
			System.out.println("No offers were made");
			EmployeeSwitch.EmployeeMenu();
		}return false;
		
	}
	public static void makeOffer(Offer o) {
		OfferList.add(o);	
	}
	public static void DeclineOffer() {
		Offer o = OfferList.get(0);
		OfferList.remove(o);
	}
	public static List<Offer> ViewOfferList() {
		Collections.sort(OfferList, (arg0, arg1)->{
			return arg0.getOfferID().compareTo(arg1.getOfferID());
	});
		for(Offer o: OfferList) {
			System.out.println(o+"\n");
		}return OfferList;
	}
	public static boolean AcceptOffer() {
		if(OfferList.isEmpty()) {
			System.out.println("No offers have been made..");
			return false;
		}else {
			ViewOfferList();
			Offer o = OfferList.get(0);
			o.setOfferStatus("Accepted!");
			return true;
		}
		
		
		
	}
	
	
	public static void PromptOffer() {
		CarLot.ViewCar(CarLot.cars);
		System.out.println("Choose car:");
		Car c = CarLot.cars.get(sc.nextInt()-1);
		Integer ID = c.getVIN();
		System.out.println("How much would you like to offer on the vehicle? ");
		Double offer = sc.nextDouble();
		System.out.println("Your offer is: $ " + offer);
		System.out.println("Your car VIN number is: "+ ID);
		Offer o = new Offer(offer, "pending", ID);
		SQLUtility.OfferAddSQL(o);

	}

	public static void decisionOffer(double offer) {
		// this is not counter, rather this is a counter offer.
		double counter1 = 0;
		String decision = " ";
		System.out.println("The offer on the vehicle was " + offer
				+ "\n Would you like to accept, reject, or counter this offer?" + "\n Press A to accept offer."
				+ "\n Press R to rejcect offer." + "\n Press C if you wish to make a counter offer.");
		while (sc.hasNextLine()) {

			decision = sc.nextLine();
			// while()
			if (decision.equalsIgnoreCase("A")) {
				System.out.println("The offer has been accepted. Thank You !");
			} else if (decision.equalsIgnoreCase("R")) {
				System.out.println("The offer has been declined. Thank You !");
				decisionOffer(offer);
			} else if (decision.equalsIgnoreCase("C")) {
				System.out.println("What is the counter offer you would like to make?");
				String counter = sc.nextLine();

				try {
					counter1 = Double.parseDouble(counter);
				} catch (NumberFormatException e) {
					System.out.println("Invalid Input");
					decisionOffer(offer);
				}

			}

		}

	}
	
}
