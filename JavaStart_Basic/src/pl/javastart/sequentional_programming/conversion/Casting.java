package pl.javastart.sequentional_programming.conversion;

public class Casting {

	public static void main(String[] args) {

		int a = 5;
		double b = 13.5;
		int c = (int)b/a;
		
		System.out.println("c = " + c);
		
		char d = '$';
		char e = '%';
		int f = e/d;
		
		System.out.println("f = " + f);
		
		char g = 'g';
		int h = g;
		char i = 101;
		
		System.out.println(g + h + i);
	}
}