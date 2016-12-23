package pl.javastart.sequentional_programming.arrays;

/*
Stw�rz 3 tablice typu ca�kowitoliczbowego, kt�re mog� przechowywa� odpowiednio 1000, 100 i 10 element�w. 
Do setnego elementu w pierwszej tablicy przypisz warto�� 100. Dalej zadeklaruj i zainicjalizuj tablic� dwuwymiarow� - wiemy, �e chcemy 
do niej przypisa� 3 tablice, ale ka�da z nich ma mie� r�n� d�ugo��, wi�c drugi rozmiar pozostaw pusty, przez co uzyskasz tablic� mog�c� 
przechowywa� 3 tablice typu ca�kowitoliczbowego, jednak na ten moment s� to puste warto�ci null.
*/

public class MultiDimensional {

	public static void main(String[] args) {

		int[] longTab = new int[1000];
        longTab[99] = 100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];
         
        int[][] hugeTab = new int[3][];
        hugeTab[0] = longTab;
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;
         
        System.out.println("D�ugo�ci tablic: ");
        System.out.println(hugeTab[0].length + " ; " + hugeTab[1].length + " ; " + hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy: " + hugeTab[0][99]);
	}
}