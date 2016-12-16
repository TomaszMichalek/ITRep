package pl.javastart.sequentional_programming.methods_and_constructors;

public class CarShopMethod {

	public static void main(String[] args) {
		
		CarFactoryMethod cf = new CarFactoryMethod();
        CarMethod audiA4 = cf.createCar("Audi", "A4", 5, "Czarny", "Bia³e", "Czarne");
        CarMethod vwPassat = cf.createCar("Volkswagen", "Passat", 5, "Niebieski", "Srebrne", "Czarne");
         
        audiA4.printInfo();
        vwPassat.printInfo();
	}
}