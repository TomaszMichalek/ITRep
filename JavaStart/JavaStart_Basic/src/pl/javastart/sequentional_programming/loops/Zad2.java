package pl.javastart.sequentional_programming.loops;

/*
Napisz program, kt�ry pobierze od u�ytkownika ca�kowit� liczb� dodatni�. Nast�pnie przy u�yciu wy�wietl na ekranie 
odliczanie z tekstem "Bomba wybuchnie za ... " gdzie w miejsce dwukropka maj� si� pojawi� liczby od podanej przez 
u�ytkownika do 0. Napisz program w 3 wersjach przy u�yciu r�nych p�tli.
*/

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
		
		input.close();
	}
}