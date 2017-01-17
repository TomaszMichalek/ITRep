package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

/*
Napiszmy prost¹ grê - zadaniem u¿ytkownika bêdzie zgadniêcie liczby, któr¹ zainicjujemy w programie. W przypadku, gdy liczba bêdzie za du¿a lub za ma³a, 
u¿ytkownik otrzyma odpowiedni¹ podpowiedŸ. Wykorzystajmy od razu pêtlê while.
*/

public class WhileLoop2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("WprowadŸ liczbê:");
		int shot;
		int number = 100;
		
		while ((shot = input.nextInt()) != number) {
			if (shot<number) {
				System.out.println("Liczba jest za ma³a. Zgaduj dalej.");
			}
			else if (shot>number) {
				System.out.println("Liczba jest za du¿a. Zgaduj dalej.");
			}
		}
		
		System.out.println("BRAWO!!!");
		
		input.close();
	}
}