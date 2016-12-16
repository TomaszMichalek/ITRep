package pl.javastart.sequentional_programming.methods_and_constructors;

public class CarMethod {

	int doors;
    String carColor;
    String wheelsColor;
    String tiresColor;
    String brand;
    String model;
     
    void printInfo() {
        String info = "";
        info = info + brand + " ";
        info = info + model + ", ";
        info = info + "kolor: " + carColor + ", " ;
        info = info + "drzwi: " + doors + ", " ;
        info = info + "felgi: " + wheelsColor + ", ";
        info = info + "opony: " + tiresColor;
 
        System.out.println(info);
    }
}