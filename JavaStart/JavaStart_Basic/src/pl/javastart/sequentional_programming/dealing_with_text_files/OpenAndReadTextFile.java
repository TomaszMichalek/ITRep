package pl.javastart.sequentional_programming.dealing_with_text_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenAndReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:/Users/ACER F5-573G-51NX/Documents/Java Projects/Eclipse Workspace/JavaStart_Basic/src/pl/javastart/dealing_with_text_files/ala.txt");
		Scanner in = new Scanner(file);
		
		String zdanie = in.nextLine();
		System.out.println(zdanie);	
	}
}