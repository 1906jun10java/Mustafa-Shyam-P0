package project0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CarLot extends Car {


	public CarLot() {
		super();
	}

	public static List<Car> cars = new ArrayList<>();

	static void addCar(Car c) { 
		cars.add(c);

	}

	static void removeCar(Car c) {
		cars.remove(c);

	}

	public static void ViewCar(List<Car> c) {
		Iterator<Car> it = cars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
}
