package pl.javastart.sequentional_programming.arrays;

/*
Przy u¿yciu pêtli i tablic przechowuj¹cych liczby ca³kowite zaprezentuj poni¿sz¹ treœæ:
- tab[0,0] = 0;
- tab[0,1] = 1;
- tab[0,2] = 2;
- tab[1,0] = 3;
- tab[1,1] = 4;
- tab[1,2] = 5;
Wykorzystuj przy tym w³asnoœæ length.
*/

public class Zad3 {

	public static void main(String[] args) {

		int[][] tab = new int[2][3];
		int licznik = 0;
		
		for(int i=0; i<tab.length; i++) {
			for(int j=0; j<tab[i].length; j++)
				tab[i][j] = licznik++;
		}
		
		for(int i=0; i<tab.length; i++) {
			for(int j=0; j<tab[i].length; j++)
				System.out.printf("tab[%d][%d]=%d \n", i, j, tab[i][j]);
		}
	}
}