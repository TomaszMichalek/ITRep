package pl.javastart.sequentional_programming.arrays;

/*
Napisz program, w kt�rym zadeklarujesz i utworzysz pi�cioelementow� tablic� odpowiedniego typu. W p�tli pobierzesz od u�ytkownika 
5 imion i je w niej zapiszesz. Nast�pnie wy�wietl na ekranie powiadomienia "Witaj imie_z_tablicy" dla ka�dego z podanych parametr�w.
*/

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] tab = new String[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Podaj imi�: ");
			tab[i] = input.nextLine();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Witaj " + tab[i]);
		}
		
		input.close();
	}
}