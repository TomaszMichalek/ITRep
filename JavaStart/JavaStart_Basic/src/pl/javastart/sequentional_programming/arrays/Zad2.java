package pl.javastart.sequentional_programming.arrays;

/*
Utw�rz tablic� typu int przechowuj�c� n element�w - gdzie n jest parametrem pobieranym od u�ytkownika. Nast�pnie wype�nij 
j� liczbami od 1 do n i wy�wietl zawarto�� na ekranie przy pomocy p�tli while.
*/

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj ilo�� element�w:");
		int n = input.nextInt();
		
		int[] tab = new int[n];
		
		for(int i=0; i<tab.length; i++) {
			tab[i] = i + 1;
		}
		
		int licznik = 0;
		while(licznik<tab.length) {
			System.out.print(tab[licznik] + " ");
			licznik++;
		}
	}
}