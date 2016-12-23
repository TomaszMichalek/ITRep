package pl.javastart.sequentional_programming.arrays;

/*
Napisz program sk�adaj�cy si� z jednej klasy o dowolnej nazwie. 
W metodzie main zadeklaruj tablic� dwuwymiarow� liczb typu double. 
Wype�nij j� liczbami zgodnie z poni�szym rysunkiem:
				1.0		1.5		2.0
				1.5		2.0		2.5
				2.0		2.5		3.0
Wylicz i wy�wietl na ekranie wyniki poni�ej opisanych dzia�a�:
- Sum� iloczyn�w przek�tnych tablicy
- Iloczyn sum �rodkowego wiersza i �rodkowej kolumny tablicy
- Sum� wszystkich element�w znajduj�cych si� przy kraw�dzi tablicy.
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
		System.out.println("Suma iloczyn�w przek�tnych tablic wynosi: " + result);
		result = (tab[1][0] + tab[1][1] + tab[1][2]) * (tab[0][1] + tab[1][1] + tab[2][1]);
		System.out.println("Iloczyn sum �rodkowego wiersza i �rodkowej kolumny tablicy wynosi: " + result);
		result = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];
		System.out.println("Suma wszystkich element�w znajduj�cych si� przy kraw�dzi tablicy wynosi: " + result);
	}
}