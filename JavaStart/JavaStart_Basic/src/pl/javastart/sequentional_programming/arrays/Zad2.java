package pl.javastart.sequentional_programming.arrays;

/*
Utwórz tablicê typu int przechowuj¹c¹ n elementów - gdzie n jest parametrem pobieranym od u¿ytkownika. Nastêpnie wype³nij 
j¹ liczbami od 1 do n i wyœwietl zawartoœæ na ekranie przy pomocy pêtli while.
*/

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj iloœæ elementów:");
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