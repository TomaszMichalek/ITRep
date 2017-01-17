package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

/*
Napisz program, który najpierw pobiera od u¿ytkownika liczbê mówi¹c¹ o tym ile liczb u¿ytkownik chce wprowadziæ. 
Nastêpnie pobierz od niego tyle liczb ile zadeklarowa³, zsumuj je i wyœwietl na ekranie. W programie wykorzystaj co najwy¿ej 
dwie zmienne liczbowe (wliczaj¹c w to równie¿ potencjalne zmienne liczników pêtli) i nie u¿ywaj tablic. 
*/

public class Zad4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Numbers quantity:");
		int quantity = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<quantity; i++) {
			System.out.println("Enter number:");
			sum = sum + sc.nextInt();
		}	
		
		System.out.println("The sum of your numbers is: " + sum);
		
		sc.close();
	}
}