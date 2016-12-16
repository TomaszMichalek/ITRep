package pl.javastart.sequentional_programming.methods_and_constructors;

public class CalcMethod {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
        double addResult = calc.add(2.5, 7.5);
        System.out.println(addResult);
         
        calc.addAndPrint(6, 8);
	}
}