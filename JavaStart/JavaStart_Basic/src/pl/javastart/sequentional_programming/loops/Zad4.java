package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

/*
Napisz program, kt�ry najpierw pobiera od u�ytkownika liczb� m�wi�c� o tym ile liczb u�ytkownik chce wprowadzi�. 
Nast�pnie pobierz od niego tyle liczb ile zadeklarowa�, zsumuj je i wy�wietl na ekranie. W programie wykorzystaj co najwy�ej 
dwie zmienne liczbowe (wliczaj�c w to r�wnie� potencjalne zmienne licznik�w p�tli) i nie u�ywaj tablic. 
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