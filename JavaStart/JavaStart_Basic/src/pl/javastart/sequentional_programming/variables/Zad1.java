package pl.javastart.sequentional_programming.variables;

/*
Napisz program, w kt�rym zadeklarujesz kilka sta�ych, lub zmiennych r�nych typ�w o dowolnych nazwach, 
a nast�pnie wy�wietlisz je w kolejnych liniach tekstu. Skompiluj, lub spr�buj skompilowa� przyk�ady podane 
w tej lekcji i zobacz co si� stanie przy pr�bie nadania po raz drugi warto�ci jakiej� sta�ej.
W tym samym programie zadeklaruj cztery zmienne typu String. Trzy z nich zainicjuj jakimi� wyrazami, 
a czwartemu przypisz ci�g znak�w utworzony z trzech wcze�niejszych zmiennych. Nast�pnie wy�wietl czwart� zmienn� na ekranie.
Przy u�yciu metody substring wy�wietl na ekranie dwa pierwsze wyrazy wykorzystuj�c wy��cznie czwart� zmienn� typu String.
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