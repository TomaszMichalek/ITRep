package pl.javastart.sequentional_programming.methods_and_constructors;

public class CarFactoryMethod {

	/*
     * Metoda createCar() przyjmuje parametry opisuj¹ce egzemplarz nowego
     * samochodu i zwraca gotowy obiekt typu Car
     */
    CarMethod createCar(String carBrand, String carModel, int doorsNumber, String color, String wheels, String tires) {
         
        // tworzymy nowy obiekt typu Car
        CarMethod car = new CarMethod();
 
        // przypisujemy parametry, które podaliœmy jako parametry metody
        car.brand = carBrand;
        car.model = carModel;
        car.doors = doorsNumber;
        car.carColor = color;
        car.wheelsColor = wheels;
        car.tiresColor = tires;
 
        // zwracamy utworzony egzemplarz klasy car za pomoc¹ s³owa return
        return car;
    }
}