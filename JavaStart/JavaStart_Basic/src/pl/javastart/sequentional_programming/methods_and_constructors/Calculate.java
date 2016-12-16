package pl.javastart.sequentional_programming.methods_and_constructors;

public class Calculate {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		double a = 2.5;
		double b = 4.5;
		
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();
        System.out.println("a + b = " + calc.add(a, b));
        System.out.println("a - b = " + calc.subtract(a, b));
        System.out.println("a * b = " + calc.multiply(a, b));
        System.out.println("a / b = " + calc.divide(a, b));
	}
}