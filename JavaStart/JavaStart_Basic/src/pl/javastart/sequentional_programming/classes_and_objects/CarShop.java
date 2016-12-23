package pl.javastart.sequentional_programming.classes_and_objects;

/*
Stw�rzmy prosty program, w kt�rym utworzymy klas� Samoch�d, kt�ra b�dzie przechowywa�a informacje, kt�re pokazali�my wy�ej na obrazku. 
Ilo�� drzwi b�dzie przechowywana w zmiennej typu int, natomiast pozosta�e elementy opiszemy po prostu przy pomocy typu String.
Utw�rz r�wnie� dodatkow� zmienn� typu String o nazwie audiInfo, kt�ra pomo�e nam w czytelny spos�b wy�wietli� informacj� o samochodzie.
o zdefiniowanym wcze�niej samochodzie. 
Wyrzu� zmienn� audi poza metod� main.
Utw�rz 2 klasy.
*/

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
		
		System.out.println("Wybra�e� nast�puj�cy samoch�d: ");
		System.out.println(audiInfo);
		
		boolean isCar = audi instanceof Car;
        System.out.println(isCar);
	}
}