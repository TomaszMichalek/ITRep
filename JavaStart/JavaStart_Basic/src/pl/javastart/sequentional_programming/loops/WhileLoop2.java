package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

/*
Napiszmy prost� gr� - zadaniem u�ytkownika b�dzie zgadni�cie liczby, kt�r� zainicjujemy w programie. W przypadku, gdy liczba b�dzie za du�a lub za ma�a, 
u�ytkownik otrzyma odpowiedni� podpowied�. Wykorzystajmy od razu p�tl� while.
*/

public class WhileLoop2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Wprowad� liczb�:");
		int shot;
		int number = 100;
		
		while ((shot = input.nextInt()) != number) {
			if (shot<number) {
				System.out.println("Liczba jest za ma�a. Zgaduj dalej.");
			}
			else if (shot>number) {
				System.out.println("Liczba jest za du�a. Zgaduj dalej.");
			}
		}
		
		System.out.println("BRAWO!!!");
		
		input.close();
	}
}