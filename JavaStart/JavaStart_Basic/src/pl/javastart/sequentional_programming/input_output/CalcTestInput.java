package pl.javastart.sequentional_programming.input_output;

import java.util.Locale;
import java.util.Scanner;

/*
Napisz prosty kalkulator dla liczb zmiennoprzecinkowych, kt�ry pozwala u�ytkownikowi kolejno na:
- Wprowadzenie pierwszej liczby
- Wprowadzenie jednego z podstawowych dzia�a� matematycznych (plus, minus, podziel, pomn�) - w postaci znak�w +, -, /, *
- Wprowadzenie drugiej liczby
W programie wykorzystaj co najmniej dwie osobne klasy.
*/

public class CalcTestInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		System.out.println("Enter first number:");
		double a = input.nextDouble();
		input.nextLine();
		System.out.println("Enter Option:");
		String option = input.nextLine();
		System.out.println("Enter second numner:");
		double b = input.nextDouble();

		CalcInput calc = new CalcInput();
		double result = calc.calculate(a, b, option);
		System.out.println(a + " " + option + " " + b + " = " + result);
		
		input.close();
	}
}