package pl.javastart.sequentional_programming.operators;

/*
Napisz program, w kt�rym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, r�ne warto�ci, 
a nast�pnie za pomoc� operator�w logicznych i matematycznych wy�wietl wynik nast�puj�cych zda� logicznych:
- Czy x jest wi�ksze od y?
- Czy x pomno�one przez 2 jest wi�ksze od y?
- Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2?
- Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacj� modulo)
Wynik ka�dego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

Podpowied�: Do utworzenia losowej liczby wykorzystaj metod� Random.nextInt(), aby by�o to mo�liwe, musisz j� zaimportowa� przed zdefiniowaniem klasy.
*/

import java.util.Random;

public class Zad2 {

	public static void main(String[] args) {

		Random rand = new Random();
		int x = rand.nextInt(100);
		int y = rand.nextInt(100);
		boolean result;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println();
		System.out.println("Czy x jest wi�ksze od y?");
		System.out.println(result = x>y);
		System.out.println("Czy x pomno�one przez 2 jest wi�ksze od y?");
		System.out.println(result = x*2>y);
		System.out.println("Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2?");
		System.out.println(result = y<x+3 && y>x/2);
		System.out.println("Czy iloczyn liczb x i y jest parzysty?");
		System.out.println(result = x*y %2 == 0);
	}
}