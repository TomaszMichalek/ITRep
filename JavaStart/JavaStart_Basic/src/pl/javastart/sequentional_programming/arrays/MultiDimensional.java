package pl.javastart.sequentional_programming.arrays;

/*
Stwórz 3 tablice typu ca³kowitoliczbowego, które mog¹ przechowywaæ odpowiednio 1000, 100 i 10 elementów. 
Do setnego elementu w pierwszej tablicy przypisz wartoœæ 100. Dalej zadeklaruj i zainicjalizuj tablicê dwuwymiarow¹ - wiemy, ¿e chcemy 
do niej przypisaæ 3 tablice, ale ka¿da z nich ma mieæ ró¿n¹ d³ugoœæ, wiêc drugi rozmiar pozostaw pusty, przez co uzyskasz tablicê mog¹c¹ 
przechowywaæ 3 tablice typu ca³kowitoliczbowego, jednak na ten moment s¹ to puste wartoœci null.
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
         
        System.out.println("D³ugoœci tablic: ");
        System.out.println(hugeTab[0].length + " ; " + hugeTab[1].length + " ; " + hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy: " + hugeTab[0][99]);
	}
}