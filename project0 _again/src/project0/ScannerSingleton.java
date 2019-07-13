package project0;

import java.util.Scanner;

public class ScannerSingleton {
// 
	private static ScannerSingleton ss = null;

	// Creates a static instance of the scanner to be used in each class once
	private static Scanner sc = new Scanner(System.in);

	// no args constructor
	private ScannerSingleton() {
		super();
	}

	// method that returns a new instance of the singleton if ss == null
	public static ScannerSingleton getInstance() {
		if (ss == null) {// if no scanner object is present, then create an object
			ss = new ScannerSingleton();// creates an object of the singleton
		}
		return ss;
	}

	// returns a reference to the scanner
	public Scanner returnScanner() {
		return sc;
	}

}
