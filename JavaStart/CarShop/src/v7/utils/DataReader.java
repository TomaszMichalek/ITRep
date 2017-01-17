package v7.utils;

import java.util.Locale;
import java.util.Scanner;

import v7.data.Car;

public class DataReader {

	private Scanner sc;
	
	public DataReader() {
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
	}
	
	public void close() {
		sc.close();
	}
	
	public Car readAndCreateNewCar() {
		System.out.println("Brand:");
		String brand = sc.nextLine();
		System.out.println("Model:");
		String model = sc.nextLine();
		System.out.println("Capacity:");
		double capacity = sc.nextDouble();
		sc.nextLine();
		System.out.println("Year:");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Type:");
		String type = sc.nextLine();
		System.out.println("Color:");
		String color = sc.nextLine();
		
		return new Car(brand, model, capacity, year, type, color);
	}
}