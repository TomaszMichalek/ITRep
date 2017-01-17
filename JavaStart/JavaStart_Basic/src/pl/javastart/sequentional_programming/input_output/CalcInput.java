package pl.javastart.sequentional_programming.input_output;

public class CalcInput {

	public static final String PLUS = "+";
	public static final String MINUS = "-";
	public static final String MULTIPLY = "*";
	public static final String DIVIDE = "/";
	
	public double calculate(double a, double b, String option) {
		double result = 0;
		
		switch (option) {
		case PLUS:
			result = a+b;
			break;
		case MINUS:
			result = a-b;
			break;
		case MULTIPLY:
			result = a*b;
			break;
		case DIVIDE:
			result = a/b;
			break;	
		default:
			System.out.println("Wrong option!");
			break;
		}		
		return result;
	}
}