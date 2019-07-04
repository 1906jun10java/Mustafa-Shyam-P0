package com.revature.services;
import java.util.Scanner;

public class Offers {
	static Scanner sc = new Scanner(System.in);
	
	public static double makeOffer() {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("How much would you like to offer on the vehicle? ");
		double offer = sc.nextDouble();
		System.out.println("Your pending offer is: $ " + offer );
		return offer;
		
	}
	
	public static boolean decisionOffer(double offer) {
		
		System.out.println("The offer on the vehicle was "+ offer 
				+ "\n . Would you like to accept, reject, or counter this offer?"
				+ "\n Press A to accept offer."
				+ "\n Press R to rejcect offer." 
				+ "\n Press O if you wish to make a counter offer.");
		
		String decision = sc.next();
		//while()
		if(decision.equals("A")) {
			System.out.println("The offer has been accepted. Thank You !");
		}else if(decision.equals("R")) {
			System.out.println("The offer has been declined. Thank You !");
		}else if (decision.equals("O")) {
			System.out.println("What is the counter offer you would like to make?");
			String counter = sc.next();
			
			
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		//System.out.println(makeOffer());
		decisionOffer(makeOffer());
		//makeOffer();
	}
}
