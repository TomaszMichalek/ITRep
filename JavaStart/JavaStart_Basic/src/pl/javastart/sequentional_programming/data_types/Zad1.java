package pl.javastart.sequentional_programming.data_types;

/*
Napisz program, który wyœwietli Twoje dane wraz z powitaniem w formie:
- Czeœæ Jan, s³ysza³em, ¿e masz 25 lat i uczysz siê programowania, czy to prawda?
- true
- Czy Twoje inicja³y to J K?
- Tak, true
W zadaniu wykorzystaj nie tylko napisy w podwójnych cudzys³owach, ale równie¿ podane typy danych 
- liczby (int), znaki(char) oraz typ logiczny(boolean).
*/

public class Zad1 {

	public static void main(String[] args) {
		
		String imie = "Tomasz";
		int wiek = 24;
		boolean tak = true;
		char tomasz = 'T';
		char michalek = 'M';
		
		System.out.println("Witaj " + imie + ". S³ysza³em, ¿e masz " + wiek + " lata i uczysz siê programowania. Czy to prawda?");
		System.out.println(tak);
		System.out.println("Czy Twoje inicja³y to " + tomasz + michalek + "?");
		System.out.println("Tak, " + tak);
	}
}