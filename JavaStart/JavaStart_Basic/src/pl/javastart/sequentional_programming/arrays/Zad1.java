package pl.javastart.sequentional_programming.arrays;

/*
Napisz program, w którym zadeklarujesz i utworzysz piêcioelementow¹ tablicê odpowiedniego typu. W pêtli pobierzesz od u¿ytkownika 
5 imion i je w niej zapiszesz. Nastêpnie wyœwietl na ekranie powiadomienia "Witaj imie_z_tablicy" dla ka¿dego z podanych parametrów.
*/

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
		
		input.close();
	}
}