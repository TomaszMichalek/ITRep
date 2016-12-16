package pl.javastart.sequentional_programming.overloading_and_this;

public class CalcOverloading {

	double add(double a, double b) {
		return a+b;
	}
	
	double subtract(double a, double b) {
		return a-b;
	}
	
	double add(double a, double b, double c) {
		return a+b+c;
	}
	
	double subtract(double a, double b, double c) {
		return a-b-c;
	}
}