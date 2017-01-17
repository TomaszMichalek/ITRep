package pl.javastart.sequentional_programming.loops;

/*
Napiszmy program, który robi dwie rzeczy - stwórzmy 10 elementow¹ tablicê liczb ca³kowitych, 
uzupe³nijmy j¹ wartoœciami od 1 do 10, a nastêpnie wyœwietlmy.
*/

public class ForLoop2 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}