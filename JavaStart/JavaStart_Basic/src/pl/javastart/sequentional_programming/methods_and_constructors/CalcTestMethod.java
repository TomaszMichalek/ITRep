package pl.javastart.sequentional_programming.methods_and_constructors;

/*
Na pocz�tek zdefiniujmy klas� Calc, a w niej metod� dodaj�c� dwie liczby. Zgodnie ze wcze�niejszym opisem jako typ zwracany 
musimy wykorzysta� jeden z typ�w liczbowych (np. int lub double) oraz wskaza�, �e przyjmuje ona dwa parametry, r�wnie� typ�w liczbowych.
Zdefiniujmy r�wnie� metod� "dodaj i wy�wietl".
*/

public class CalcTestMethod {

	public static void main(String[] args) {
		
		CalcMethod calc = new CalcMethod();
        double addResult = calc.add(2.5, 7.5);
        System.out.println(addResult);
         
        calc.addAndPrint(6, 8);
	}
}