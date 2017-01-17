package v8.utils;

import java.util.Locale;
import java.util.Scanner;

import v8.data.Car;

public class DataReader {

	private Scanner sc;
	
	public DataReader() {
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
	}
	
	public void close() {
		sc.close();
	}
	
	public int getInt() {
		int number = sc.nextInt();
		sc.nextLine();
		return number;
	}
	
	public Car readAndCreateCar() {
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

/*
W klasie DataReader dodajmy tylko jedn¹ metodê getInt(), która pozwoli na odczytanie pojedynczej liczby typu int - przyda siê 
do odczytywania wyboru opcji przez u¿ytkownika (w kolejnej klasie LibraryControl).
*/