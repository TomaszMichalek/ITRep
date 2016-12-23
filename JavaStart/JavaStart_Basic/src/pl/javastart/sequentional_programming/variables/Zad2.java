package pl.javastart.sequentional_programming.variables;

/*
Napisz program, w którym zadeklarujesz zmienne, które bêd¹ reprezentowaæ samochód w salonie samochodowym poprzez:
- markê
- model
- rocznik
- cenê
Na koñcu wyœwietl informacje o samochodzie, który powsta³ po zainicjowaniu przez Ciebie zmiennych.
*/

public class Zad2 {

	public static void main(String[] args) {
		
		String marka = "Volkswagen";
		String model = "Passat CC";
		int rocznik = 2009;
		double poj = 2.0;
		final int cena = 54900;

		System.out.println("Witam Szanowny kliencie Naszego salonu.");
		System.out.println("Wybrana przez Ciebie marka to: " + marka);
		System.out.println("Wybrany przez Ciebie model to: " + model);
		System.out.println("Wybrany przez Ciebie rocznik to: " + rocznik);
		System.out.println("Wybrana przez Ciebie pojemnoœæ silnika to: " + poj);
		System.out.println("Wybrana przez Ciebie cena to: " + cena + " i nie podlega negocjacji.");
	}
}