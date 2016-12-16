package pl.javastart.sequentional_programming.operators;

public class MathematicalOperators {

	public static void main(String[] args) {

		
// *****RODZAJE OPERATORÓW*****		
		
		int a = 17;
		int b = 4;
		int c1 = a+b;
		int c2 = a-b;
		int c3 = a*b;
		int c4 = a/b;
		int c5 = a%b;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		
		int d = (a+b)/3;
		
		System.out.println("d = " + d);
		
		int a2 = 17;
		double b2 = 4.0;
		double e = a2/b2;
		
		System.out.println("e = " + e);
		
		
// *****OPERATORY SKRÓTOWE*****		
		
		int a3 = 17;
		double b3 = 4.0;
		a3 += b3; 
		// a3 -= b3; 
		// a3 *= b3; 
		// a3 /= b3; 
		// a3 %= b3;
		
		System.out.println("a3 = " + a3);
		
		
// *****OPERATORY INKREMENTACJI I DEKREMENTACJI*****
		
		int a4 = 5;
		int b4 = 3;
		// int f = a4+b4++; //f=a4+b4, a dopiero póŸniej b4 = b4 + 1;
		// int f = (a4++)+b4; //f=a4+b4, a nastêpnie a4 = a4 + 1
		int f = a4++;
		
		System.out.println("f = " + f);
	}
}