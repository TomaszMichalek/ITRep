package pl.javastart.sequentional_programming.control_flow;

/*
Napisz program, kt�ry pobierze od u�ytkownika imi� i przechowa je w zmiennej. Nast�pnie stw�rz kilka warunk�w z r�nymi imionami. 
Je�li kt�re� z imion b�dzie pasowa�o wy�wietl "Cze�� jakie�_imi�", gdy program nie znajdzie imienia wy�wietl "Przykro mi, ale Ci� nie znam".
*/

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		Scanner odczyt = new Scanner(System.in);
		 
	    System.out.println("Jak masz na imi�?");
	    String imie = odczyt.nextLine();
	 
	    if("Tomasz".equals(imie))
	        System.out.println("Cze�� " + imie);
	    else if("Kasia".equals(imie))
	        System.out.println("Cze�� " + imie);
	    else
	        System.out.println("Przykro mi, ale Ci� nie znam.");
	    
	    odczyt.close();
	}
}