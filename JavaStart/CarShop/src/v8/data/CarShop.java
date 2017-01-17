package v8.data;

public class CarShop {

	public final int maxCars = 1000;
	private Car[] cars;
	private int carNumber;

	public Car[] getCars() {
		return cars;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public CarShop() {
		cars = new Car[maxCars];
	}

	public void addCar(Car car) {
		if (carNumber < maxCars) {
			cars[carNumber] = car;
			carNumber++;
		} else {
			System.out.println("Number of books reach maximum value!");
		}
	}

	public void printCars() {
		if (carNumber == 0) {
			System.out.println("No cars available.");
		}
		for (int i = 0; i < carNumber; i++) {
			cars[i].carInfo();
		}
	}
}