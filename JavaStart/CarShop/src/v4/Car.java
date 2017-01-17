package v4;

public class Car {

	String brand;
	String model;
	int year;
	double capacity;
	String color;
	String type;
	
	Car(String brand, String model, double capacity, int year, String type, String color) {
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.year = year;
		this.type = type;
		this.color = color;
	}
	
	Car(Car car) {
		this(car.brand, car.model, car.capacity, car.year, car.type, car.color);
	}
	
	void CarInfo() {
		String CarInfo = brand + " " + model + ", capacity: " + capacity + 
				", year: " + year + ", type: " + type + ", color: " + color;
		System.out.println(CarInfo);
	}
}