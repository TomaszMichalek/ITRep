package data;

public class Car {

	private int year;
	private String brand;
	private String model;
	private String color;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
	    //ustawiamy now¹ wartoœæ year je¿eli jest ona wiêksza od 0
	    if(year > 0) {
	        this.year = year;
	    } else { //jeœli ktoœ przeka¿e liczbê mniejsz¹ lub równ¹ zero, wyœwietlamy komunikat
	        System.out.println("Rok musi byæ wiêkszy od 0!");
	    }
	}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public Car(int year, String brand, String model, String color) {
        this.setYear(year);
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
    }
 
    public Car(Car carToCopy) {
        this(carToCopy.getYear(), carToCopy.getBrand(), carToCopy.getModel(),
                carToCopy.getColor());
    }
}