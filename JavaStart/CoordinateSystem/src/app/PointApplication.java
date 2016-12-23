package app;

/*
Napisz program, który pozwala na kontrolowanie danych obiektu, który reprezentuje punkt na p³aszczyŸnie.
Punkt (klasa Point - Point.java) powinien zawieraæ dwa pola reprezentuj¹ce wspó³rzêdn¹ X oraz Y - reprezentacja 
wspó³rzêdnych powinna byæ ca³kowitoliczbowa. Klasa powinna byæ zgodna ze specyfikacj¹ JavaBeans. 
Klasa powinna posiadaæ konstruktor bezparametrowy oraz pozwalaj¹cy ustawiæ odpowiednie wspó³rzêdne w trakcie tworzenia obiektu.
Klasa PointController (PointController.java) posiada cztery metody, które pozwalaj¹ manipulowaæ po³o¿eniem punktu:
- addX() - zwiêksza zmienn¹ x o 1
- minusX() - zmniejsza zmienn¹ x o 1
- addY() - zwiêksza zmienn¹ y o 1
- minusY() - zmniejsza zmienn¹ y o 1
Ka¿da z metod przyjmuje jako parametr obiekt klasy Point i na nim operuje.
Obie klasy powinny znajdowaæ siê w osobnych pakietach, a ich dzia³anie powinno zostaæ przetestowane w trzeciej klasie o nazwie PointApplication.
*/

/*
W zadaniu wykorzystaj projekt z poprzedniego zadania (Specyfikatory dostêpu i JavaBeans). W klasie PointApplication dodaj proste sterowanie, 
które pozwoli na zmianê wartoœci wspó³rzêdnych punktu w zale¿noœci od wybranej opcji.
Zdefiniuj 4 sta³e pozwalaj¹ce na wybór odpowiedniego zachowania ADD_X, ADD_Y, MINUS_X, MINUS_Y.
Wykorzystaj strukturê switch i w niej wywo³aj odpowiedni¹ metodê klasy PointController.
Wyœwietl zmienione wspó³rzêdne punktu.
*/

import controller.PointController;
import data.Point;

public class PointApplication {
	
	public static final int ADD_X = 0;
	public static final int ADD_Y = 1;
	public static final int SUB_X = 2;
	public static final int SUB_Y = 3;

	public static void main(String[] args) {

		Point p1 = new Point(5, 2);
		PointController pc = new PointController();
		
		System.out.println("Punkt przed zmian¹: p1 = (" + p1.getX() + ", " + p1.getY() + ")");
		
		int option = ADD_Y;
		
		switch(option) {
		case ADD_X:
			pc.addX(p1);
			break;
		case ADD_Y:
			pc.addY(p1);
			break;
		case SUB_X:
			pc.subX(p1);
			break;
		case SUB_Y:
			pc.subY(p1);
			break;
        default:
            System.out.println("Podano b³êdn¹ wartoœæ");
		}

		System.out.println("Punkt po zmianie: p1 = (" + p1.getX() + ", " + p1.getY() + ")");
	}
}