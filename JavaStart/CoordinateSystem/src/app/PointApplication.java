package app;

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