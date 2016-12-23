package pl.javastart.sequentional_programming.functions;

/*
Napisz prosty kalkulator, w którym zainicjujesz dwie zmienne int a i b dowolnymi liczbami mieszcz¹cymi siê w zakresie - niech, 
a bêdzie liczb¹ ujemn¹, natomiast b dodatni¹... Nastêpnie wykorzystuj¹c import statyczny wyœwietl wyniki nastêpuj¹cych dzia³añ 
bez u¿ycia dodatkowych zmiennych:
- a^b (a do potêgi b)
-|a| (wartoœæ bezwzglêdna z liczby a)
- pierwiastek z liczby a podniesionej do potêgi b
Zobacz co siê stanie, gdy do a i b przypiszesz dwie 3 cyfrowe liczby, oraz gdy liczba b bêdzie nieparzysta (wynik a^b bêdzie ujemny).
*/

import static java.lang.Math.*;

public class Zad1 {

	public static void main(String[] args) {
		
		int a = -721;
		int b = 323;
		
		System.out.println(pow(a, b));
		System.out.println(abs(a));
		System.out.println(sqrt(pow(a, b)));
		
		// Problem mo¿na rozwi¹zaæ za pomoc¹ wielkich liczb --> Zad_2
	}
}