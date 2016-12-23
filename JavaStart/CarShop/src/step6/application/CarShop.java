package step6.application;

import step6.data.Car;

/*
Nasz salon z pewno�ci� b�dzie operowa�a na du�ej liczbie samochod�w, dlatego reprezentacja przy pomocy tablic w tym momencie 
wydaje si� jak najbardziej na miejscu. Zamiast deklarowa� wi�c ka�dy samoch�d jako osobn� zmienn� utw�rzmy tablic�, 
kt�ra b�dzie mog�a pomie�ci� 1000 samochod�w i umie��my w niej na razie nasze 3 wcze�niej utworzone egzemplarze.
Dodatkowo wy�wietlmy informacj� systemow� dotycz�c� tego ile samochod�w mo�e przechowywa� nasz system. 
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