package pl.javastart.sequentional_programming.classes_and_objects;

/*
Stwórzmy prosty program, w którym utworzymy klasê Samochód, która bêdzie przechowywa³a informacje, które pokazaliœmy wy¿ej na obrazku. 
Iloœæ drzwi bêdzie przechowywana w zmiennej typu int, natomiast pozosta³e elementy opiszemy po prostu przy pomocy typu String.
Utwórz równie¿ dodatkow¹ zmienn¹ typu String o nazwie audiInfo, która pomo¿e nam w czytelny sposób wyœwietliæ informacjê o samochodzie.
o zdefiniowanym wczeœniej samochodzie. 
Wyrzuæ zmienn¹ audi poza metodê main.
Utwórz 2 klasy.
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
		
		System.out.println("Wybra³eœ nastêpuj¹cy samochód: ");
		System.out.println(audiInfo);
		
		boolean isCar = audi instanceof Car;
        System.out.println(isCar);
	}
}