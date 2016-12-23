package step1;

/*
Stwórzmy pierwsz¹ wersjê aplikacji, która bêdzie potrafi³a siê przedstawiæ, a dodatkowo przechowywaæ informacje o jednym samochodzie.
Samochód opisuj¹ takie cechy jak:
- marka
- model
- rok produkcji
- poj. silnika
- kolor
- typ
*/

public class CarShop {

	public static void main(String[] args) {
		
		final String appName = "CarShop";
		
		String brand = "Audi";
		String model = "A5";
		int year = 2012;
		double capacity = 3.2;
		String color = "red";
		String type = "sedan";
		
		System.out.printf("%22s", appName);
		System.out.println();
		System.out.println("Cars available:");
		System.out.println();
		System.out.println(brand + " " + model + ", capacity: " + capacity + ", year: " + year + ", type: " + type + ", color: " + color);
	}
}