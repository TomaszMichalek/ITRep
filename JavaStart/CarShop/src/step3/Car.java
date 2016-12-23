package step3;

public class Car {

	String brand;
	String model;
	int year;
	double capacity;
	String color;
	String type;
	
	Car(String CarBrand, String CarModel, double CarCapacity, int CarYear, String CarType, String CarColor) {
		brand = CarBrand;
		model = CarModel;
		year = CarYear;
		capacity = CarCapacity;
		color = CarColor;
		type = CarType;
	}
	
	void printInfo() {
		String CarInfo = brand + " " + model + ", capacity: " + capacity + 
				", year: " + year + ", type: " + type + ", color: " + color;
		System.out.println(CarInfo);
	}	
}