package com.revature.services;
import java.util.Scanner;

public class Offers {
		
	public static boolean makeOffer() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How much would you like to offer on the vehicle? ");
		double offer = sc.nextDouble();
		System.out.println("Your pending offer is: $ " + offer );
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(makeOffer());
		
	}
}
