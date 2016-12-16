package pl.javastart.sequentional_programming.arrays;

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