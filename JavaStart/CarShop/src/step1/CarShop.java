package step1;

/*
Stw�rzmy pierwsz� wersj� aplikacji, kt�ra b�dzie potrafi�a si� przedstawi�, a dodatkowo przechowywa� informacje o jednym samochodzie.
Samoch�d opisuj� takie cechy jak:
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