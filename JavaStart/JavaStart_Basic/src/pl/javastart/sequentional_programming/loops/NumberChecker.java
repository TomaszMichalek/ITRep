package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

/*
Napiszmy teraz program, który pozwoli wczytaæ 3 liczby ca³kowite od u¿ytkownika i za ka¿dym razem rozpozna, 
czy liczba ta jest parzysta (podzielna przez 2), czy te¿ nieparzysta.
*/

public class NumberChecker {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n;
		for(int i=0; i<3; i++) {
			System.out.println("Podaj liczbê:");
			n = input.nextInt();
			
			if(n%2==0) {
				System.out.println("Liczba parzysta.");
			}
			else {
				System.out.println("Liczba nieparzysta.");
			}
		}
		
		input.close();
	}
}