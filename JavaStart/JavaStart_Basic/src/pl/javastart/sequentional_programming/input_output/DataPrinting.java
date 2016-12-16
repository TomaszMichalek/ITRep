package pl.javastart.sequentional_programming.input_output;

public class DataPrinting {

	public static void main(String[] args) {

		 String naglowek1 = "Student";
	     String naglowek2 = "Ocena";
	     String linia = "-----------------------------------";
	         
	     String std1 = "Kowalski Jan"; int ocena1 = 3;
	     String std2 = "Nowak Adam"; int ocena2 = 5;
	     String std3 = "Plich £ukasz"; int ocena3 = 0;
	         
	     System.out.println("");
	     System.out.printf("%9s %18s %n", naglowek1, naglowek2);
	     System.out.println(linia);
	         
	     System.out.printf("%-15s %10d %n", std1, ocena1);
	     System.out.printf("%11s %14d %n", std2, ocena2);
	     System.out.printf("%-15s %10d %n", std3, ocena3);
	        
	     System.out.println(linia);
	     System.out.println("");
	}
}