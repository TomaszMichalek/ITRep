package v8.application;

import v8.data.Car;
import v8.data.CarShop;
import v8.utils.DataReader;

public class CarShopControl {
	
	public final int exit = 0;
	public final int addCar = 1;
	public final int printCars = 2;
	
	private DataReader dataReader;
	private CarShop carShop;
	
	public CarShopControl() {
		dataReader = new DataReader();
		carShop = new CarShop();
	}
	
	private void printOptions() {
		System.out.println();
		System.out.println("Options available:");
		System.out.println("0 - Exit program");
        System.out.println("1 - Add new car");
        System.out.println("2 - Cars available");
        System.out.println();
        System.out.println("Choose option:");
	}
	
	private void addCar() {
		Car car = dataReader.readAndCreateCar();
		carShop.addCar(car);
	}
	
	private void printCars() {
		carShop.printCars();
	}
	
	public void controlLoop() {
		int option;
		printOptions();
		while ((option = dataReader.getInt()) != exit) {
			switch (option) {
			case addCar:
				System.out.println();
				addCar();
				break;
			case printCars:
				System.out.println();
				printCars();
				break;
			default:
				System.out.println("Wrong option!");
			}
			printOptions();
		}
		dataReader.close();
	}
}