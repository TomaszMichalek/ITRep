package step3;

/*
W celu dalszego upraszczania naszego programu do obs³ugi klepu samochodowego stwórzmy w klasie Car konstruktor, 
który pozwoli nam tworzyæ nowe instancje bez potrzeby inicjalizacji wszystkich pól po kolei w klasie z logik¹ (CarShop). 
Dodatkowo usprawnijmy klasê Car o mo¿liwoœæ wyœwietlania informacji o sobie, aby nie duplikowaæ tego kodu kilkukrotnie w klasie CarShop.

Dziêki temu klasa CarShop mo¿e byæ znacz¹co zredukowana i w wygodny sposób mo¿emy dodaæ do sklepu informacje 
o jeszcze kilku samochodach, a kodu i tak bêdzie mniej ni¿ poprzednio.
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
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
	}
}