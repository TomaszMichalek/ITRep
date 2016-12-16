package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Podaj czas:");
		
		int zegar = input.nextInt();
		
		System.out.println("Bomba wybuxhnie za:");
		
		do {
			System.out.println(zegar);
			zegar--;
		}
		while(zegar>0);
		
		System.out.println("BUM!!!!!!!!");
	}
}