package pl.javastart.sequentional_programming.loops;

/*
Napiszmy program, kt�ry robi dwie rzeczy - stw�rzmy 10 elementow� tablic� liczb ca�kowitych, 
uzupe�nijmy j� warto�ciami od 1 do 10, a nast�pnie wy�wietlmy.
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