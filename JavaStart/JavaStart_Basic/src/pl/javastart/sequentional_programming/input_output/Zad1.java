package pl.javastart.sequentional_programming.input_output;

/*
Utwórz dwie zmienne typu double. Nastêpnie przy u¿yciu klasy Scanner pobierz od u¿ytkownika dwie liczby i wykonaj na nich dodawanie, 
odejmowanie, mno¿enie i dzielenie, wyœwietlaj¹c wyniki w kolejnych liniach na konsoli.
*/

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		double a;
		double b;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Podaj liczbê a");
			a = odczyt.nextDouble();
		System.out.println("Podaj liczbê b");
			b = odczyt.nextDouble();
		
		System.out.println("a+b = " + (a + b));
		System.out.println("a-b = " + (a - b));
		System.out.println("a*b = " + (a * b));
		System.out.println("a/b = " + (a / b));
	}
}