package pl.javastart.sequentional_programming.arrays;

/*
Napisz program, w którym zadeklarujesz dwie tablice typu ca³kowitoliczbowego, które bêd¹ przechowywa³y po 3 dowolne liczby typu int. 
Program powinien wyœwietliæ sumê wszystkich liczb z obu tablic.
*/

public class Zad4 {

	public static void main(String[] args) {
		
		int[] tab1 = {1, 2, 4};
		int[] tab2 = {3, 5, 8};

		int suma = tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];
		System.out.println("Suma wszystkich wartoœci tablicy wynosi: " + suma);
	}
}