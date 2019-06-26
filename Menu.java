package project0;

import java.util.Scanner;

public class Menu {

	static void mainMenu() {
		Scanner sc = new Scanner(System.in);
		// print menu
		System.out.println("Main Menu\n\n1)Customer Login\n2)Employee Login\n3)Cars\n4)Exit\n");
		//

		boolean quit = false;

		int menuItem;
		do {

			menuItem = sc.nextInt();

			switch (menuItem) {
			case 1:
				userMenu();
				// do something;
				break;
			case 2:
				userMenu();
				// do something;
				break;
			case 3:
				System.out.println("cars");
				// do something;
				break;
			case 4:
				System.out.println("Quit!");
				quit = true;
				break;
			default:
				System.out.println("U dun f'ed up...");
			}// continue to loop
		} while (!quit);
		System.out.println("Adios, amigo..");

		sc.close();
	}

	static void customerMenu() {
		Scanner sc = new Scanner(System.in);
		int custoptn;// customer options keys
		boolean exit = false;

		System.out.println("Customer realm\n\n1)Payments\n2)Cars owned\n3)Offer\n4)Exit");
		do {
			custoptn = sc.nextInt();

			switch (custoptn) {
			case 1:
				//payments
				break;
			case 2:
				System.out.println("My cars");
				break;
			case 3:
				System.out.println("Offer available (Accept or decline)");
				break;
			case 4:
				System.out.println("Exit!");
				exit = true;
				break;
			default:
				System.out.println("U dun F'ed up!");
			}
		} while (!exit);
		System.out.println("Au revoir ami!");

		sc.close();

	}

	static void userMenu() {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("Enter UserName: ");// prompt user to input username
			String username = sc.next();// user types username
			System.out.println("Enter Password: ");// prompt user to input pass
			String pass = sc.next();// user types pass
			System.out.println("Confirm Password: ");
			String pass1 = sc.next();
			// Authentication
			if (pass.contentEquals(pass1)) {
				System.out.println("Welcome to Customer Home screen");
				break;
			} else if (!pass.contentEquals(pass1)) {
				System.out.println("Try again!");
				System.out.println("Would you like to return back to the main menu? Y/N ");
				String answer = sc.next();
				if(answer.contentEquals("Y")) {
					break;
				}else {
					userMenu();
				}
			}
		} while (!exit);
		System.out.println("return back to main menu");
		mainMenu();
	}

	static void employeeMenu() {
		userMenu();
		
	}

	public static void main(String[] args) {
		mainMenu();
	}

}
