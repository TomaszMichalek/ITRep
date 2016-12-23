package app;

/*
Napisz program, kt�ry pozwala na kontrolowanie danych obiektu, kt�ry reprezentuje punkt na p�aszczy�nie.
Punkt (klasa Point - Point.java) powinien zawiera� dwa pola reprezentuj�ce wsp�rz�dn� X oraz Y - reprezentacja 
wsp�rz�dnych powinna by� ca�kowitoliczbowa. Klasa powinna by� zgodna ze specyfikacj� JavaBeans. 
Klasa powinna posiada� konstruktor bezparametrowy oraz pozwalaj�cy ustawi� odpowiednie wsp�rz�dne w trakcie tworzenia obiektu.
Klasa PointController (PointController.java) posiada cztery metody, kt�re pozwalaj� manipulowa� po�o�eniem punktu:
- addX() - zwi�ksza zmienn� x o 1
- minusX() - zmniejsza zmienn� x o 1
- addY() - zwi�ksza zmienn� y o 1
- minusY() - zmniejsza zmienn� y o 1
Ka�da z metod przyjmuje jako parametr obiekt klasy Point i na nim operuje.
Obie klasy powinny znajdowa� si� w osobnych pakietach, a ich dzia�anie powinno zosta� przetestowane w trzeciej klasie o nazwie PointApplication.
*/

/*
W zadaniu wykorzystaj projekt z poprzedniego zadania (Specyfikatory dost�pu i JavaBeans). W klasie PointApplication dodaj proste sterowanie, 
kt�re pozwoli na zmian� warto�ci wsp�rz�dnych punktu w zale�no�ci od wybranej opcji.
Zdefiniuj 4 sta�e pozwalaj�ce na wyb�r odpowiedniego zachowania ADD_X, ADD_Y, MINUS_X, MINUS_Y.
Wykorzystaj struktur� switch i w niej wywo�aj odpowiedni� metod� klasy PointController.
Wy�wietl zmienione wsp�rz�dne punktu.
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
		
		System.out.println("Punkt przed zmian�: p1 = (" + p1.getX() + ", " + p1.getY() + ")");
		
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
            System.out.println("Podano b��dn� warto��");
		}

		System.out.println("Punkt po zmianie: p1 = (" + p1.getX() + ", " + p1.getY() + ")");
	}
}