package pl.javastart.sequentional_programming.loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int licznik = 0;
		 
	    do {
	        System.out.println("To jest p�tla");
	        licznik++;
	    }
	    while(licznik<10);
	    System.out.println("Koniec p�tli");
	}
}