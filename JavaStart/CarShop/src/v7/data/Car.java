package v7.data;

public class Car {
	
	private String brand;
	private String model;
	private double capacity;
	private int year;
	private String type;
	private String color;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(String brand, String model, double capacity, int year, String type, String color) {
		super();
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
	
	public void CarInfo() {
		String CarInfo = brand + " " + model + ", capacity: " + capacity + 
				", year: " + year + ", type: " + type + ", color: " + color;
		System.out.println(CarInfo);
	}
}