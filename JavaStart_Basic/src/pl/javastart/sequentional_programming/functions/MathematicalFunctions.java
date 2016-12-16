package pl.javastart.sequentional_programming.functions;

import static java.lang.Math.*;

public class MathematicalFunctions {

	public static void main(String[] args) {
		
		double a = 9.0;
		int b = 3;
		// double potega = Math.pow(a, b);			// w przypadku kiedy nie importujemy z biblioteki
		// double pierwiastek = Math.sqrt(a);		// w przypadku kiedy nie importujemy z biblioteki
		double potega = pow(a, b);					// w przypadku kiedy importujemy z biblioteki Math
		double pierwiastek = sqrt(a);				// w przypadku kiedy importujemy z biblioteki Math
		
		System.out.println("a^b = " + potega);
		System.out.println("sqrt(a) = " + pierwiastek);
	}
}