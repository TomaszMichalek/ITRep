package pl.javastart.sequentional_programming.dealing_with_text_files;

/*
Napisz program, w którym wprowadzisz w konsoli swoje imiê, nastêpnie zapiszesz je do pliku. 
Odczytaj je z powrotem z pliku i bez u¿ycia dodatkowej zmiennej wyœwietl na ekranie.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		System.out.println("Jak masz na imiê?");
		
		String imie = input.nextLine();
		
		PrintWriter zapis = new PrintWriter("C:/Users/ACER F5-573G-51NX/Documents/Java Projects/Eclipse Workspace/JavaStart_Basic/src/pl/javastart/dealing_with_text_files/imie.txt");
		zapis.println(imie);
		zapis.close();
		
		File file = new File("C:/Users/ACER F5-573G-51NX/Documents/Java Projects/Eclipse Workspace/JavaStart_Basic/src/pl/javastart/dealing_with_text_files/imie.txt");
		Scanner in = new Scanner(file);
		
		imie = in.nextLine();
		System.out.println("Witaj " + imie + "!");	
	}
}