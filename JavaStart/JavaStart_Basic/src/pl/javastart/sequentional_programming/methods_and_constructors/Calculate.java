package pl.javastart.sequentional_programming.methods_and_constructors;

/*
Napisz program "kalkulator" operuj¹cy na liczbach zmiennoprzecinkowych typu double , który bêdzie sk³ada³ siê z dwóch klas w osobnych plikach:
- Calculator.java - powinna zawieraæ metody add(), subtract(), multiply(), divide(), czyli kolejno dodawanie, odejmowanie, mno¿enie i dzielenie. 
Zastanów siê jakie argumenty powinny przyjmowaæ oraz jaki typ powinny zwracaæ.
- Calculate.java - klasa uruchomieniowa programu z metod¹ main. Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double, 
utwórz obiekt klasy Calculator i za jego pomoc¹ oblicz wynik ró¿nych dzia³añ matematycznych.
Wszystkie wyniki dzia³añ wyœwietl na ekranie.
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