package pl.javastart.sequentional_programming.methods_and_constructors;

/*
Na pocz¹tek zdefiniujmy klasê Calc, a w niej metodê dodaj¹c¹ dwie liczby. Zgodnie ze wczeœniejszym opisem jako typ zwracany 
musimy wykorzystaæ jeden z typów liczbowych (np. int lub double) oraz wskazaæ, ¿e przyjmuje ona dwa parametry, równie¿ typów liczbowych.
Zdefiniujmy równie¿ metodê "dodaj i wyœwietl".
*/

public class CalcTestMethod {

	public static void main(String[] args) {
		
		CalcMethod calc = new CalcMethod();
        double addResult = calc.add(2.5, 7.5);
        System.out.println(addResult);
         
        calc.addAndPrint(6, 8);
	}
}