package pl.javastart.sequentional_programming.functions;

/*
Napisz prosty kalkulator, w kt�rym zainicjujesz dwie zmienne int a i b dowolnymi liczbami mieszcz�cymi si� w zakresie - niech, 
a b�dzie liczb� ujemn�, natomiast b dodatni�... Nast�pnie wykorzystuj�c import statyczny wy�wietl wyniki nast�puj�cych dzia�a� 
bez u�ycia dodatkowych zmiennych:
- a^b (a do pot�gi b)
-|a| (warto�� bezwzgl�dna z liczby a)
- pierwiastek z liczby a podniesionej do pot�gi b
Zobacz co si� stanie, gdy do a i b przypiszesz dwie 3 cyfrowe liczby, oraz gdy liczba b b�dzie nieparzysta (wynik a^b b�dzie ujemny).
*/

import static java.lang.Math.*;

public class Zad1 {

	public static void main(String[] args) {
		
		int a = -721;
		int b = 323;
		
		System.out.println(pow(a, b));
		System.out.println(abs(a));
		System.out.println(sqrt(pow(a, b)));
		
		// Problem mo�na rozwi�za� za pomoc� wielkich liczb --> Zad_2
	}
}