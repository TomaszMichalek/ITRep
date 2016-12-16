package pl.javastart.sequentional_programming.operators;

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