package pl.javastart.sequentional_programming.control_flow;

/*
Napisz program, który pobierze od u¿ytkownika imiê i przechowa je w zmiennej. Nastêpnie stwórz kilka warunków z ró¿nymi imionami. 
Jeœli któreœ z imion bêdzie pasowa³o wyœwietl "Czeœæ jakieœ_imiê", gdy program nie znajdzie imienia wyœwietl "Przykro mi, ale Ciê nie znam".
*/

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Jak masz na imiê?");
		String imie = odczyt.nextLine();
		
		switch (imie) {
		case "Tomasz":
			System.out.println("Witaj Tomaszu! Jak Ci mija dzieñ? :)");
			break;
		case "Ola":
			System.out.println("Witaj Olu! Jak Ci mija dzieñ? :)");
			break;
		case "Kamil":
			System.out.println("Witaj Kamilu! Jak Ci mija dzieñ? :)");
			break;
		default:
			System.out.println("Przykro mi, ale nie znam Ciê. :(");
		}
	}
}