package v7.application;

import v7.data.Car;
import v7.utils.DataReader;

/*
Nasza aplikacja samochodowa w ko�cu otrzyma nieco rozp�du, poniewa� teraz mo�emy dopisa� jedn� z wa�niejszych funkcjonalno�ci, 
kt�r� jest komunikacja z u�ytkownikiem i odbieranie od niego danych.

Poniewa� mo�na si� spodziewa�, �e w przysz�o�ci b�dziemy od u�ytkownika pobierali nieco wi�cej informacji, 
to wydzielmy t� funkcjonalno�� do osobnej klasy. Na razie b�dzie to klasa, kt�ra pozwoli na podstawie danych od u�ytkownika 
tworzy� nowe obiekty klasy Car.
Klasa Car pozostaje bez zmian.
Utworzona zosta�a za to nowa klasa DataReader, kt�ra pozwoli na tworzenie nowych samochod�w na podstawie danych od u�ytkownika.
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