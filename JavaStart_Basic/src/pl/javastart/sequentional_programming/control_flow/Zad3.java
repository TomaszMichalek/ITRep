package pl.javastart.sequentional_programming.control_flow;

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
	}
}