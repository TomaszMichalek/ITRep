package pl.javastart.sequentional_programming.classes_and_objects;

public class CarShop {
	
	static Car audi;

	public static void main(String[] args) {

		audi = new Car();
		audi.brand = "Audi";
		audi.model = "A4";
		audi.doors = 4;
		audi.carColor = "Czarny";
		audi.wheelsColor = "Srebrny";
		audi.tiresColor = "Czarny";

		String audiInfo = audi.brand + " " + audi.model + ", Drzwi: " + audi.doors + ", Kolor nadwozia: "
				+ audi.carColor + ", Kolor felg: " + audi.wheelsColor + ", Kolor opon: " + audi.tiresColor;
		
		System.out.println("Wybra³eœ nastêpuj¹cy samochód: ");
		System.out.println(audiInfo);
		
		boolean isCar = audi instanceof Car;
        System.out.println(isCar);
	}
}