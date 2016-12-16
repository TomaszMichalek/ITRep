package pl.javastart.sequentional_programming.dealing_with_text_files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToTextFile {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter zapis = new PrintWriter("C:/Users/ACER F5-573G-51NX/Documents/Java Projects/Eclipse Workspace/JavaStart_Basic/src/pl/javastart/dealing_with_text_files/ala.txt");
		zapis.println("Kamil Lacheta musztarda i sztacheta");
		zapis.close();
	}
}