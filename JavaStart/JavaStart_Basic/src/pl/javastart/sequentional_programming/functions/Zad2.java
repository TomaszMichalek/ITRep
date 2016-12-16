package pl.javastart.sequentional_programming.functions;

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