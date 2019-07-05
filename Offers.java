package project0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import project0.beans.Customer;

public class Offers {
	static Scanner sc = new Scanner(System.in);
	public static HashMap<Integer, Customer> CustomerOffer = new HashMap<>();
	public static HashSet<String> OfferList = new HashSet<>();
	
	public static boolean offerChk(Integer VIN, String username) {
		// checking if customer exists in the database
		boolean check;
		check = CustomerOffer.containsKey(VIN);
		if(check == false) {
			System.out.println("Customer has made no offers on the vehicle");
			return false;
		}
		Customer c = CustomerOffer.get(VIN);
		if(username.equals(c.getUsername())) {
			
			return true;
		}else {
			System.out.println("Incorrect Password!");
		}return false;
	}
	public static double makeOffer() {

		// Scanner sc = new Scanner(System.in);
		System.out.println("How much would you like to offer on the vehicle? ");
		double offer = sc.nextDouble();
		System.out.println("Your pending offer is: $ " + offer);
		return offer;

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
