package pl.javastart.sequentional_programming.arrays;

/*
Napisz program sk³adaj¹cy siê z jednej klasy o dowolnej nazwie. 
W metodzie main zadeklaruj tablicê dwuwymiarow¹ liczb typu double. 
Wype³nij j¹ liczbami zgodnie z poni¿szym rysunkiem:
				1.0		1.5		2.0
				1.5		2.0		2.5
				2.0		2.5		3.0
Wylicz i wyœwietl na ekranie wyniki poni¿ej opisanych dzia³añ:
- Sumê iloczynów przek¹tnych tablicy
- Iloczyn sum œrodkowego wiersza i œrodkowej kolumny tablicy
- Sumê wszystkich elementów znajduj¹cych siê przy krawêdzi tablicy.
*/

public class Zad5 {

	public static void main(String[] args) {

		double[][] tab = new double[3][];
		
		double[] line0 = {1.0, 1.5, 2.0};
		double[] line1 = {1.5, 2.0, 2.5};
		double[] line2 = {2.0, 2.5, 3.0};
		
		tab[0] = line0;
		tab[1] = line1;
		tab[2] = line2;
		
		double result;
		result = (tab[0][0] * tab[1][1] * tab[2][2]) + (tab[0][2] * tab[1][1] * tab[2][0]);
		System.out.println("Suma iloczynów przek¹tnych tablic wynosi: " + result);
		result = (tab[1][0] + tab[1][1] + tab[1][2]) * (tab[0][1] + tab[1][1] + tab[2][1]);
		System.out.println("Iloczyn sum œrodkowego wiersza i œrodkowej kolumny tablicy wynosi: " + result);
		result = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];
		System.out.println("Suma wszystkich elementów znajduj¹cych siê przy krawêdzi tablicy wynosi: " + result);
	}
}