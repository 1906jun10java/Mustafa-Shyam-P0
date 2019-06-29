package project0;

public class CarLot extends Car {

	public CarLot() {
		super();
	}

	public static List<Car> cars = new ArrayList<>();

	static void addCar(Car c) { 
		cars.add(new Car());

	}

	static void removeCar(Car c) {
		cars.remove(new Car());

	}

	public static void ViewCar(List<Car> c) {
		Iterator<Car> it = cars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}


}
