package pl.javastart.sequentional_programming.variables;

/*
Napisz program, w kt�rym zadeklarujesz zmienne, kt�re b�d� reprezentowa� samoch�d w salonie samochodowym poprzez:
- mark�
- model
- rocznik
- cen�
Na ko�cu wy�wietl informacje o samochodzie, kt�ry powsta� po zainicjowaniu przez Ciebie zmiennych.
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
		System.out.println("Wybrana przez Ciebie pojemno�� silnika to: " + poj);
		System.out.println("Wybrana przez Ciebie cena to: " + cena + " i nie podlega negocjacji.");
	}
}