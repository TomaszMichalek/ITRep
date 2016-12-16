package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Podaj czas:");
		
		int zegar = input.nextInt();
		
		System.out.println("Bomba wybuchnie za: ");
		
		while(zegar>0) {
			System.out.println(zegar);
			zegar--;
		}
		System.out.printf("%20s","BUM!!!!!!!!!");
	}
}