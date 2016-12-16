package pl.javastart.sequentional_programming.functions;

import java.math.BigInteger;

public class HugeValues {

	public static void main(String[] args) {
		
		BigInteger wielkaLiczba = new BigInteger("12312312312312312312");
		BigInteger a = new BigInteger("12312312312312312312");
		BigInteger b = new BigInteger("9876543219876543219876");
		
		System.out.println("Wielka Liczba to " + wielkaLiczba.toString());
		System.out.println("a + b = " + a.add(b));
	}
}