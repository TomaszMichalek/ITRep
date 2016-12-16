package pl.javastart.sequentional_programming.control_flow;

public class SwitchStatements {

	public static void main(String[] args) {
		
		int zmienna = 2;
		 
	    switch(zmienna){
	    case 1:
	        System.out.println("Liczba to 1");
	        break;
	    case 2:
	        System.out.println("Liczba to 2");
	        break;
	    default:
	        System.out.println("Liczba to ani 1, ani 2");
	    }	
	}
}