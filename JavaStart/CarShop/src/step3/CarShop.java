package step3;

/*
W celu dalszego upraszczania naszego programu do obs�ugi klepu samochodowego stw�rzmy w klasie Car konstruktor, 
kt�ry pozwoli nam tworzy� nowe instancje bez potrzeby inicjalizacji wszystkich p�l po kolei w klasie z logik� (CarShop). 
Dodatkowo usprawnijmy klas� Car o mo�liwo�� wy�wietlania informacji o sobie, aby nie duplikowa� tego kodu kilkukrotnie w klasie CarShop.

Dzi�ki temu klasa CarShop mo�e by� znacz�co zredukowana i w wygodny spos�b mo�emy doda� do sklepu informacje 
o jeszcze kilku samochodach, a kodu i tak b�dzie mniej ni� poprzednio.
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