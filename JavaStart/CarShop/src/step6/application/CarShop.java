package step6.application;

import step6.data.Car;

/*
Nasz salon z pewnoœci¹ bêdzie operowa³a na du¿ej liczbie samochodów, dlatego reprezentacja przy pomocy tablic w tym momencie 
wydaje siê jak najbardziej na miejscu. Zamiast deklarowaæ wiêc ka¿dy samochód jako osobn¹ zmienn¹ utwórzmy tablicê, 
która bêdzie mog³a pomieœciæ 1000 samochodów i umieœæmy w niej na razie nasze 3 wczeœniej utworzone egzemplarze.
Dodatkowo wyœwietlmy informacjê systemow¹ dotycz¹c¹ tego ile samochodów mo¿e przechowywaæ nasz system. 
*/

public class CarShop {

	public static void main(String[] args) {
		
		final String appName = "CarShop";
		
		Car[] cars = new Car[1000];
		
		cars[0] = new Car("Audi", "A7", 3.2, 2012, "sedan", "red");
		cars[1] = new Car("BMW", "X6", 3.0, 2014, "SUV", "white");
		cars[2] = new Car("Mercedes", "CLS", 4.2, 2016, "coupe", "black");
		
		System.out.printf("%32s", appName);
		System.out.println();
		System.out.println("Cars available:");
		System.out.println();
		cars[0].CarInfo();
		cars[1].CarInfo();
		cars[2].CarInfo();
		
		System.out.println();
		System.out.println("System can contain " + cars.length + " cars.");
	}
}