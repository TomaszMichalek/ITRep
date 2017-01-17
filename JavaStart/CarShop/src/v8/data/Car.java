package v8.data;

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
	public String getModel() {
		return model;
	}
	public double getCapacity() {
		return capacity;
	}
	public int getYear() {
		return year;
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setType(String type) {
		this.type = type;
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
	
	public Car(Car car) {
		this(car.getBrand(), car.getModel(), car.getCapacity(), car.getYear(), car.getType(), car.getColor());
	}
	
	public void carInfo() {
		String carInfo = getBrand() + " " + getModel() + ", capacity: " + getCapacity() + ", year: " + getYear() 
			+ ", type: " + getType() + ", color: " + getColor();
		System.out.println(carInfo);
	}
}