package pl.javastart.sequentional_programming.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		boolean prawda = a>b;
		boolean falsz = a<b;
		boolean porownanie = a==b;
		boolean koniunkcja = (a>b) && (a!=b);
		
		System.out.println(prawda);
		System.out.println(falsz);
		System.out.println(porownanie);
		System.out.println(koniunkcja);
		
		String ja = "S³awek";
		String ty = "S³awek";		
		boolean porownanie1 = ja==ty;
		boolean porownanie2 = ja.equals(ty);
		
		System.out.println(porownanie1);
		System.out.println(porownanie2);
	}
}