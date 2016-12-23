package pl.javastart.sequentional_programming.functions;

/*
Napisz program analogiczny do Zad1 wykorzystuj¹c klasê BigInteger. Utwórz dwie liczby wykraczaj¹ce poza zakres long, 
wypróbuj funkcje dodawania, odejmowania i mno¿enia, a tak¿e podniesienie do potêgi(zobacz w API jaki typ parametru przyjmuje ta funkcja) 
i wartoœæ bezwzglêdn¹. Wszystkie wyniki zaprezentuj w konsoli.
*/

import java.math.BigInteger;

public class Zad2 {

	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("-721");
		BigInteger b = new BigInteger("323");
		
		System.out.println("a + b = " + a.add(b));
		System.out.println("a - b = " + a.subtract(b));
		System.out.println("a * b = " + a.multiply(b));
		
		System.out.println("|a| = " + a.abs());
		System.out.println("a^12 = " + a.pow(12));
	}
}