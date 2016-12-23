package pl.javastart.sequentional_programming.control_flow;

/*
Napisz program, kt�ry pobierze od u�ytkownika imi� i przechowa je w zmiennej. Nast�pnie stw�rz kilka warunk�w z r�nymi imionami. 
Je�li kt�re� z imion b�dzie pasowa�o wy�wietl "Cze�� jakie�_imi�", gdy program nie znajdzie imienia wy�wietl "Przykro mi, ale Ci� nie znam".
*/

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Jak masz na imi�?");
		String imie = odczyt.nextLine();
		
		switch (imie) {
		case "Tomasz":
			System.out.println("Witaj Tomaszu! Jak Ci mija dzie�? :)");
			break;
		case "Ola":
			System.out.println("Witaj Olu! Jak Ci mija dzie�? :)");
			break;
		case "Kamil":
			System.out.println("Witaj Kamilu! Jak Ci mija dzie�? :)");
			break;
		default:
			System.out.println("Przykro mi, ale nie znam Ci�. :(");
		}
	}
}