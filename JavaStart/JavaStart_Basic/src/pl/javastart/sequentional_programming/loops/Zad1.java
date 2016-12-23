package pl.javastart.sequentional_programming.loops;

/*
Napisz program, który pobierze od u¿ytkownika ca³kowit¹ liczbê dodatni¹. Nastêpnie przy u¿yciu wyœwietl na ekranie 
odliczanie z tekstem "Bomba wybuchnie za ... " gdzie w miejsce dwukropka maj¹ siê pojawiæ liczby od podanej przez 
u¿ytkownika do 0. Napisz program w 3 wersjach przy u¿yciu ró¿nych pêtli.
*/

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