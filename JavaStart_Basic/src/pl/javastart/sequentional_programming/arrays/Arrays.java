package pl.javastart.sequentional_programming.arrays;

public class Arrays {

	public static void main(String[] args) {

		int[] tablica = new int[10];
		 
        for (int i=0; i<10; i++)
            tablica[i] = i + 1;
 
        int zmienna = tablica[3];
 
        for (int i=0; i<10; i++) {
            System.out.println("Kolejna kom�rka to: " + tablica[i]);
        }
        System.out.println("Kom�rka 3 ma warto�� " + zmienna);
	}
}