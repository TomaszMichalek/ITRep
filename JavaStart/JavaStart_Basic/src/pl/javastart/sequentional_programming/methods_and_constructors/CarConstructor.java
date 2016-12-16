package pl.javastart.sequentional_programming.methods_and_constructors;

public class CarConstructor {

	int doors;
    String carColor;
    String wheelsColor;
    String tiresColor;
    String brand;
    String model;
     
    //Konstruktor
    CarConstructor(String carBrand, String carModel, int doorsNumber,
            String color, String wheels, String tires) {
         
        // przypisujemy parametry, które podaliœmy jako argumenty konstruktora
        brand = carBrand;
        model = carModel;
        doors = doorsNumber;
        carColor = color;
        wheelsColor = wheels;
        tiresColor = tires;
    }
     
    void printInfo() {
    	
        String info = "";
        info = info + brand+" ";
        info = info + model+", ";
        info = info + "kolor: " + carColor + ", " ;
        info = info + "drzwi: " + doors + ", " ;
        info = info + "felgi: " + wheelsColor +", ";
        info = info + "opony: " + tiresColor;
 
        System.out.println(info);
    }
}