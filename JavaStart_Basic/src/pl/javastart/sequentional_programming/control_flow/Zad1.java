package pl.javastart.sequentional_programming.control_flow;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		int zmienna;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Podaj liczb� a");
		int a = odczyt.nextInt();
		System.out.println("Podaj liczb� b");
		int b = odczyt.nextInt();
		
		if (a > b) {
			System.out.println("Liczba " + a + " jest wieksza od liczby " + b);
		}
		else if (a < b) {
			System.out.println("Liczba " + a + " jest mniejsza od liczby " + b);
		}
		else {
			System.out.println("Liczba " + a + " jest r�wna liczbie " + b);
		}
	}
}