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
	    //ustawiamy now� warto�� year je�eli jest ona wi�ksza od 0
	    if(year > 0) {
	        this.year = year;
	    } else { //je�li kto� przeka�e liczb� mniejsz� lub r�wn� zero, wy�wietlamy komunikat
	        System.out.println("Rok musi by� wi�kszy od 0!");
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