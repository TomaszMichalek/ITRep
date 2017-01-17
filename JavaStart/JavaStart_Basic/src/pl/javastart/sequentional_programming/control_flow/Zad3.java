package pl.javastart.sequentional_programming.control_flow;

/*
Napisz program, który pobierze od u¿ytkownika imiê i przechowa je w zmiennej. Nastêpnie stwórz kilka warunków z ró¿nymi imionami. 
Jeœli któreœ z imion bêdzie pasowa³o wyœwietl "Czeœæ jakieœ_imiê", gdy program nie znajdzie imienia wyœwietl "Przykro mi, ale Ciê nie znam".
*/

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		Scanner odczyt = new Scanner(System.in);
		 
	    System.out.println("Jak masz na imiê?");
	    String imie = odczyt.nextLine();
	 
	    if("Tomasz".equals(imie))
	        System.out.println("Czeœæ " + imie);
	    else if("Kasia".equals(imie))
	        System.out.println("Czeœæ " + imie);
	    else
	        System.out.println("Przykro mi, ale Ciê nie znam.");
	    
	    odczyt.close();
	}
}