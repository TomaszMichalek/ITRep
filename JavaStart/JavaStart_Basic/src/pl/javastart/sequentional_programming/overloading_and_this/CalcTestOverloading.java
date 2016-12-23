package pl.javastart.sequentional_programming.overloading_and_this;

/*
Napisz program-kalkulator, kt�ry b�dzie sk�ada� si� z dw�ch klas: Calculator i CalcTest.
W klasie Calculator zdefiniuj metody add i subtract w kilku przeci��onych wersjach, aby mog�y dodawa� 
lub odejmowa� 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.
W klasie CalcTest przetestuj dzia�anie klasy Calculator.
*/

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