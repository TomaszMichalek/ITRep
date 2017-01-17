package v5.application;

import v5.data.Car;

/*
Dostosujmy nieco nasz� aplikacj� samochodow� do nowo poznanych rzeczy:
- przer�bmy klas� Car na klas� JavaBeans
- wydzielmy logik� aplikacji i dane do osobnych pakiet�w
W obu klasach poza kwestiami kosmetycznymi, takimi jak zmiany specyfikator�w dost�p�w, dodanie setter�w i getter�w 
oraz przemieszczenie klas w pakietach nic nie zimeniamy, logika pozostaje nadal taka sama.
*/

public class CarShop {

	public static void main(String[] args) {
		
		final String appName = "CarShop";
		
		Car car1 = new Car("Audi", "A7", 3.2, 2012, "sedan", "red");
		Car car2 = new Car("BMW", "X6", 3.0, 2014, "SUV", "white");
		Car car3 = new Car("Mercedes", "CLS", 4.2, 2016, "coupe", "black");
		
		System.out.printf("%32s", appName);
		System.out.println();
		System.out.println("Cars available:");
		System.out.println();
		car1.CarInfo();
		car2.CarInfo();
		car3.CarInfo();
	}
}