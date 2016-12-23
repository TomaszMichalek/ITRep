package pl.javastart.sequentional_programming.variables;

/*
Napisz program, w którym zadeklarujesz kilka sta³ych, lub zmiennych ró¿nych typów o dowolnych nazwach, 
a nastêpnie wyœwietlisz je w kolejnych liniach tekstu. Skompiluj, lub spróbuj skompilowaæ przyk³ady podane 
w tej lekcji i zobacz co siê stanie przy próbie nadania po raz drugi wartoœci jakiejœ sta³ej.
W tym samym programie zadeklaruj cztery zmienne typu String. Trzy z nich zainicjuj jakimiœ wyrazami, 
a czwartemu przypisz ci¹g znaków utworzony z trzech wczeœniejszych zmiennych. Nastêpnie wyœwietl czwart¹ zmienn¹ na ekranie.
Przy u¿yciu metody substring wyœwietl na ekranie dwa pierwsze wyrazy wykorzystuj¹c wy³¹cznie czwart¹ zmienn¹ typu String.
*/

public class Zad1 {

	public static void main(String[] args) {
		
		int cyfra = 2;
		double zmienna = 2.3;
		char znak;
		znak = '%';
		
		System.out.println(cyfra);
		System.out.println(zmienna);
		System.out.println(znak);
		
		String wyraz1 = "Jestem ";
		String wyraz2 = "sobie ";
		String wyraz3 = "Tomek!";
		String powitanie = wyraz1 + wyraz2 + wyraz3;
		System.out.println(powitanie);
		
		String hejka = powitanie.substring(13, 18) + " Romek i Atomek!";
		System.out.println(hejka + "\nHihihi :)");
	}
}