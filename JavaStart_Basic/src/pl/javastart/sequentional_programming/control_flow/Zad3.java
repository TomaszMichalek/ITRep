package pl.javastart.sequentional_programming.control_flow;

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
	}
}