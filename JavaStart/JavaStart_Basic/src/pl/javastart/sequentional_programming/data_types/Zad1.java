package pl.javastart.sequentional_programming.data_types;

/*
Napisz program, kt�ry wy�wietli Twoje dane wraz z powitaniem w formie:
- Cze�� Jan, s�ysza�em, �e masz 25 lat i uczysz si� programowania, czy to prawda?
- true
- Czy Twoje inicja�y to J K?
- Tak, true
W zadaniu wykorzystaj nie tylko napisy w podw�jnych cudzys�owach, ale r�wnie� podane typy danych 
- liczby (int), znaki(char) oraz typ logiczny(boolean).
*/

public class Zad1 {

	public static void main(String[] args) {
		
		String imie = "Tomasz";
		int wiek = 24;
		boolean tak = true;
		char tomasz = 'T';
		char michalek = 'M';
		
		System.out.println("Witaj " + imie + ". S�ysza�em, �e masz " + wiek + " lata i uczysz si� programowania. Czy to prawda?");
		System.out.println(tak);
		System.out.println("Czy Twoje inicja�y to " + tomasz + michalek + "?");
		System.out.println("Tak, " + tak);
	}
}