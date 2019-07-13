package project0.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import project0.beans.Car;
import project0.beans.Offer;

public class CustomerCarLot {
	public static HashMap<Integer, Car> CustomerOwnedCarList = new HashMap<>();
	

	public static List<Car> customerCars = new ArrayList<>();

	public static void addCustomerCar(Car c) {
		CustomerOwnedCarList.put(c.getVIN(), c);
	}
	

	public static void carCheck(Offer o) {
		boolean carCheck;
		carCheck = CustomerOwnedCarList.containsKey(o.getVIN());
		Car c = CustomerOwnedCarList.get(o.getVIN());
		customerCars.add(c);
		if (carCheck == false) {
			System.out.println("No cars present in your garage");
		}
		viewCustomerCars(customerCars);
	}

	public static void viewCustomerCars(List<Car> customerCars) {
		int i = 0;
		for (Car car : customerCars) {
			System.out.println(i + ") " + car);
			++i;
		}
	}

}
