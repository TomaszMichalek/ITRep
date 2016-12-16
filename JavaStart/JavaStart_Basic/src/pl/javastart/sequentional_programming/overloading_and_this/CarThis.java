package pl.javastart.sequentional_programming.overloading_and_this;

public class CarThis {

	/*
    int year;
    String brand;
    String model;
    String color;
     
    CarThis(int y, String b, String m, String c) {
        year = y;
        brand = b;
        model = m;
        color = c;
    }
     
    CarThis(int y, String b, String m) {
        year = y;
        brand = b;
        model = m;
    }
    */
	
	// Tym sposobem unikniemy duplikowania 3 wierszy kodu z przypisywaniem nazwy marki, modelu i roku w obu konstruktorach.
	
	/*
	int year;
    String brand;
    String model;
    String color;
    
    // konstruktor1
    CarThis(int y, String b, String m, String c) {
        this(y, b, m); 		//wywo³ujemy konstruktor2, który ustawi nam rok, markê i model
        color = c; 			//i dodatkowo ustawiamy jeszcze kolor
    }
    // konstruktor2
    CarThis(int y, String b, String m) {
        year = y;
        brand = b;
        model = m;
    }
	*/
	
	// Aby nazwy by³y czytalne i kod by³ poprawny napiszemy
	
	int year;
    String brand;
    String model;
    String color;
 
    // konstruktor1
    CarThis(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }
 
    // konstruktor2
    CarThis(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
}