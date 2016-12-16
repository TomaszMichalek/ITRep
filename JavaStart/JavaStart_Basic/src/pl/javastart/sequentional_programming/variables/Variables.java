package pl.javastart.sequentional_programming.variables;

public class Variables {

	public static void main(String[] args) {
		int liczba; 	// Deklaracja
		liczba = 5; 	// Inicjacja
		
		char znak = 5;		// Deklaracja + Inicjacja
		
		int liczba1 = 5;
		int liczba2 = liczba1;
		System.out.println(liczba1 + liczba2);
		
		double liczba3, liczba4;
		liczba3 = 5.0;
		liczba4 = 3.3;
		System.out.println(liczba3 * liczba4);
		
		final double LICZBA_PI = 3.14;
		final int STALA2;
		// LICZBA_PI = 8; - tak nie mo¿na, poniewa¿ zmienna zosta³a ju¿ zainicjowana
		STALA2 = 3;		// tak mo¿na
		
		String hello = "Witaj ";
		String world = "Œwiecie!";
		String powitanie = hello + world;
		System.out.println(powitanie);
		
		String czesc = powitanie.substring(0, 6) + "uczniu";
		System.out.println(czesc);
	}
}