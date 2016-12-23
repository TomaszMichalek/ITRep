package pl.javastart.sequentional_programming.methods_and_constructors;

/*
Napisz program "kalkulator" operuj�cy na liczbach zmiennoprzecinkowych typu double , kt�ry b�dzie sk�ada� si� z dw�ch klas w osobnych plikach:
- Calculator.java - powinna zawiera� metody add(), subtract(), multiply(), divide(), czyli kolejno dodawanie, odejmowanie, mno�enie i dzielenie. 
Zastan�w si� jakie argumenty powinny przyjmowa� oraz jaki typ powinny zwraca�.
- Calculate.java - klasa uruchomieniowa programu z metod� main. Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double, 
utw�rz obiekt klasy Calculator i za jego pomoc� oblicz wynik r�nych dzia�a� matematycznych.
Wszystkie wyniki dzia�a� wy�wietl na ekranie.
*/

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