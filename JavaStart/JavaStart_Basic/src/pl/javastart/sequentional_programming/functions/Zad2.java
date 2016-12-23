package pl.javastart.sequentional_programming.functions;

/*
Napisz program analogiczny do Zad1 wykorzystuj�c klas� BigInteger. Utw�rz dwie liczby wykraczaj�ce poza zakres long, 
wypr�buj funkcje dodawania, odejmowania i mno�enia, a tak�e podniesienie do pot�gi(zobacz w API jaki typ parametru przyjmuje ta funkcja) 
i warto�� bezwzgl�dn�. Wszystkie wyniki zaprezentuj w konsoli.
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