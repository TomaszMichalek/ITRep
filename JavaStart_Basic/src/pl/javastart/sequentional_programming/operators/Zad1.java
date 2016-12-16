package pl.javastart.sequentional_programming.operators;

public class Zad1 {

	public static void main(String[] args) {
		
		double a = 2.0;
		double b = 0.5;
		double c = 3.2;
		
		System.out.println("(a+b)*c = " + ((a+b)*c));
		System.out.println("a-b/c = " + (a-b/c));
		
		a++;
		b++;
		c++;	
		
		boolean porownanie1 = (a+b)>c;
		boolean porownanie2 = a==b;
		
		System.out.println("porownanie1 = " + porownanie1);
		System.out.println("porownanie2 = " + porownanie2);
	}
}