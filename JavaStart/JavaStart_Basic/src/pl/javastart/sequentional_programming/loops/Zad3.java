package pl.javastart.sequentional_programming.loops;

/*
Napisz program, kt�ry pobierze od u�ytkownika ca�kowit� liczb� dodatni�. Nast�pnie przy u�yciu wy�wietl na ekranie 
odliczanie z tekstem "Bomba wybuchnie za ... " gdzie w miejsce dwukropka maj� si� pojawi� liczby od podanej przez 
u�ytkownika do 0. Napisz program w 3 wersjach przy u�yciu r�nych p�tli.
*/

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