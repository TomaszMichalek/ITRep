package v5.application;

import v5.data.Car;

/*
Dostosujmy nieco nasz¹ aplikacjê samochodow¹ do nowo poznanych rzeczy:
- przeróbmy klasê Car na klasê JavaBeans
- wydzielmy logikê aplikacji i dane do osobnych pakietów
W obu klasach poza kwestiami kosmetycznymi, takimi jak zmiany specyfikatorów dostêpów, dodanie setterów i getterów 
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