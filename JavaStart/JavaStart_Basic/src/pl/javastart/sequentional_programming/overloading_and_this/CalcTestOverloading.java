package pl.javastart.sequentional_programming.overloading_and_this;

public class CalcTestOverloading {

	public static void main(String[] args) {

		CalcOverloading calc = new CalcOverloading();
		double a = 2.5;
		double b = 3.4;
		double c = 7.1;
		
		System.out.println("a + b = " + calc.add(a, b));
		System.out.println("a - b = " + calc.subtract(a, b));
		System.out.println("a + b + c = " + calc.add(a, b, c));
		System.out.println("a - b - c = " + calc.subtract(a, b, c));
	}
}