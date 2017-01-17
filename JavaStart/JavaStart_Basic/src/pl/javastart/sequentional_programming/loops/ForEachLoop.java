package pl.javastart.sequentional_programming.loops;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
        
        for(int tmp: numbers) {
            System.out.println(tmp);
        }
	}
}

/*
Bardzo wa¿ne jest to, ¿e zmienna (w tym przypadku tmp) nie jest tym samym co odwo³anie siê bezpoœrednio do elementu tablicy (np. numbers[2]). 
Jest to zmienna, do której przypisywana jest kopia wartoœci odpowiedniej komórki tablicy i wewn¹trz pêtli operujemy tak naprawdê na kopii wartoœci, 
a nie na jej oryginale. Bêdzie to jeszcze wa¿niejsze, gdy tablica przechowuje typy obiektowe, a nie tylko proste. 
W ogólnoœci unikaj u¿ywania pêtli for-each w przypadku, gdy chcesz modyfikowaæ elementy tablicy, 
u¿ywaj jej natomiast mo¿liwie wszêdzie tam, gdzie dane chcesz jedynie odczytaæ. 
*/