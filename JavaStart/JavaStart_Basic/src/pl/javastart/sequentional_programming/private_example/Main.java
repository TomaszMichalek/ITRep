package pl.javastart.sequentional_programming.private_example;

public class Main {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		// System.out.println(printer.text); //b��d, nie mamy dost�pu do pola text
		printer.printText(); // wszystko ok, metoda jest publiczna
	}
}