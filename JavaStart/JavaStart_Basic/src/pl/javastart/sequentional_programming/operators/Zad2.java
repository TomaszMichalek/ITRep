package pl.javastart.sequentional_programming.operators;

/*
Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, ró¿ne wartoœci, 
a nastêpnie za pomoc¹ operatorów logicznych i matematycznych wyœwietl wynik nastêpuj¹cych zdañ logicznych:
- Czy x jest wiêksze od y?
- Czy x pomno¿one przez 2 jest wiêksze od y?
- Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?
- Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacjê modulo)
Wynik ka¿dego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

PodpowiedŸ: Do utworzenia losowej liczby wykorzystaj metodê Random.nextInt(), aby by³o to mo¿liwe, musisz j¹ zaimportowaæ przed zdefiniowaniem klasy.
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
		System.out.println("Czy x jest wiêksze od y?");
		System.out.println(result = x>y);
		System.out.println("Czy x pomno¿one przez 2 jest wiêksze od y?");
		System.out.println(result = x*2>y);
		System.out.println("Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?");
		System.out.println(result = y<x+3 && y>x/2);
		System.out.println("Czy iloczyn liczb x i y jest parzysty?");
		System.out.println(result = x*y %2 == 0);
	}
}