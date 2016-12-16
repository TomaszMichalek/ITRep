package pl.javastart.sequentional_programming.overloading_and_this;

public class CarShopThis {

	public static void main(String[] args) {
		
		CarThis audiA5 = new CarThis(2014, "Audi", "A5", "Czarne");
		CarThis audiA6 = new CarThis(2014, "Audi", "A6");
		audiA6.color = "Czerwone";
		
		System.out.println(audiA6.brand + " " + audiA6.model + " " + audiA6.year + " " + audiA6.color);
        System.out.println(audiA5.brand + " " + audiA5.model + " " + audiA5.year + " " + audiA5.color);
	}
}