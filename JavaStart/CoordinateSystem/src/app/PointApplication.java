package app;

import controller.PointController;
import data.Point;

public class PointApplication {

	public static void main(String[] args) {

		Point p1 = new Point(5, 2);
		PointController pc = new PointController();
		
		System.out.println("Punkt p1 = (" + p1.getX() + ", " + p1.getY() + ")");
		
		pc.addX(p1);
		pc.addY(p1);
		System.out.println("Punkt p1 = (" + p1.getX() + ", " + p1.getY() + ")");
		
		pc.subX(p1);
		pc.subY(p1);
		System.out.println("Punkt p1 = (" + p1.getX() + ", " + p1.getY() + ")");
	}
}