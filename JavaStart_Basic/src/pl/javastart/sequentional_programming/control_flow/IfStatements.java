package pl.javastart.sequentional_programming.control_flow;

public class IfStatements {

	public static void main(String[] args) {

		int zmienna = 12;
		
	    if(zmienna%2 == 0) {
	        System.out.println("Liczba parzysta");
	    }
	    else {
	        System.out.println("Liczba nieparzysta");
	    }
	 
	    if(zmienna>10) {
	        System.out.println("Liczba wiêksza od 10");
	    }
	    else if(zmienna>0 && zmienna<=10) {
	        System.out.println("Liczba dodatnia mniejsza lub równa 10");
	    }
	    else if (zmienna == 0) {
	    	System.out.println("Liczba nie jest ani dodatnia, ani ujemna");
	    }
	    	else {
	    		System.out.println("Liczba ujemna");
	    	}
	}
}