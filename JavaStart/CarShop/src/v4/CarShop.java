package v4;

/*
W naszej aplikacji krok po kroku mo�emy wprowadzi� drobne usprawnienie, kt�re pozwoli nam na tworzenie nowych samochod�w 
na podstawie ju� istniej�cych. W salonie zazwyczaj jest wi�cej ni� jeden egzemplarz danego samochodu, wi�c po co wpisywa� 
wszystko od nowa skoro mo�na po prostu skopiowa� odpowiednie pola?
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