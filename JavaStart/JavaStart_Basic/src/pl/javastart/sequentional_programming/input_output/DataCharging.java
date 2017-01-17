package pl.javastart.sequentional_programming.input_output;

import java.util.Scanner;

public class DataCharging {

	public static void main(String[] args) {

		String imie;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Jak masz na imiê?");
		
		imie = odczyt.nextLine();
		
		System.out.println("Witaj " + imie);
		
		odczyt.close();
	}
}