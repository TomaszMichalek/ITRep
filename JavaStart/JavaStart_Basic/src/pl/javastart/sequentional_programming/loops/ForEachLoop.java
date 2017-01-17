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
Bardzo wa�ne jest to, �e zmienna (w tym przypadku tmp) nie jest tym samym co odwo�anie si� bezpo�rednio do elementu tablicy (np. numbers[2]). 
Jest to zmienna, do kt�rej przypisywana jest kopia warto�ci odpowiedniej kom�rki tablicy i wewn�trz p�tli operujemy tak naprawd� na kopii warto�ci, 
a nie na jej oryginale. B�dzie to jeszcze wa�niejsze, gdy tablica przechowuje typy obiektowe, a nie tylko proste. 
W og�lno�ci unikaj u�ywania p�tli for-each w przypadku, gdy chcesz modyfikowa� elementy tablicy, 
u�ywaj jej natomiast mo�liwie wsz�dzie tam, gdzie dane chcesz jedynie odczyta�. 
*/