package v2;

/*
Nie jest to zbyt efektywny sposób przechowywania informacji o samochodach, poniewa¿ wszystkie dane znajdowa³yby siê w jednej klasie, 
musielibyœmy utworzyæ bardzo du¿o zmiennych typu brand1, brand2, brand3 - co by³oby zaprzeczeniem programowania obiektowego.

Stwórzmy wiêc klasê Car, która bêdzie przechowywa³a nasze podstawowe informacje o sampchodzie, a tak¿e zaktualizujmy klasê CarShop, 
aby od tej pory przechowywa³a informacje odwo³uj¹c siê do referencji nowego typu Car.
*/

public class CarShop {

	public static void main(String[] args) {
		
		final String appName = "CarShop";
		
		Car car1 = new Car();
		
		car1.brand = "Audi";
		car1.model = "A5";
		car1.capacity = 3.2;
		car1.year = 2012;
		car1.type = "sedan";
		car1.color = "red";
		
		System.out.printf("%32s", appName);
		System.out.println();
		System.out.println("Cars available:");
		System.out.println();
		System.out.println(car1.brand + " " + car1.model + ", capacity: " + car1.capacity + 
				", year: " + car1.year + ", type: " + car1.type + ", color: " + car1.color);
	}
}