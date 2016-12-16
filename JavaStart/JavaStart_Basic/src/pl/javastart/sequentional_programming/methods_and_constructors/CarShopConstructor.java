package pl.javastart.sequentional_programming.methods_and_constructors;

public class CarShopConstructor {

	public static void main(String[] args) {

		CarConstructor audiA4 = new CarConstructor("Audi", "A4", 5, "Czarny", "Bia³e", "Czarne");
        CarConstructor vwPassat = new CarConstructor("Volkswagen", "Passat", 5, "Niebieski", "Srebrne", "Czarne");
         
        audiA4.printInfo();
        vwPassat.printInfo();
	}
}