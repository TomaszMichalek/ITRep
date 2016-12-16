package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Podaj czas:");
		
		int zegar = input.nextInt();
		
		System.out.println("Bomba wybuchnie za:");
		
		for(int i=zegar; i>0; i--){
			System.out.println(i);
		}
		
		System.out.println("BUM!!!!!!!!!!!");
	}
}