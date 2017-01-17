package v7.application;

import v7.data.Car;
import v7.utils.DataReader;

/*
Nasza aplikacja samochodowa w koñcu otrzyma nieco rozpêdu, poniewa¿ teraz mo¿emy dopisaæ jedn¹ z wa¿niejszych funkcjonalnoœci, 
któr¹ jest komunikacja z u¿ytkownikiem i odbieranie od niego danych.

Poniewa¿ mo¿na siê spodziewaæ, ¿e w przysz³oœci bêdziemy od u¿ytkownika pobierali nieco wiêcej informacji, 
to wydzielmy tê funkcjonalnoœæ do osobnej klasy. Na razie bêdzie to klasa, która pozwoli na podstawie danych od u¿ytkownika 
tworzyæ nowe obiekty klasy Car.
Klasa Car pozostaje bez zmian.
Utworzona zosta³a za to nowa klasa DataReader, która pozwoli na tworzenie nowych samochodów na podstawie danych od u¿ytkownika.
*/

public class CarShop {

	public static void main(String[] args) {
		
		final String appName = "CarShop";
		
		Car[] cars = new Car[1000];
		DataReader dataReader = new DataReader();
		
		System.out.printf("%32s", appName);
		System.out.println();
		System.out.println("Load new car:");
		System.out.println();
		cars[0] = dataReader.readAndCreateNewCar();
		//cars[1] = dataReader.readAndCreateNewCar();
		//cars[2] = dataReader.readAndCreateNewCar();
		dataReader.close();
		System.out.println();
		
		cars[0].CarInfo();
		//cars[1].CarInfo();
		//cars[2].CarInfo();
		System.out.println();
		System.out.println("System can contain " + cars.length + " cars.");
	}
}