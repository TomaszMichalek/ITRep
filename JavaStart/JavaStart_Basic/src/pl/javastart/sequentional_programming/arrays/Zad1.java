package pl.javastart.sequentional_programming.arrays;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] tab = new String[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Podaj imiê: ");
			tab[i] = input.nextLine();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Witaj " + tab[i]);
		}
	}
}