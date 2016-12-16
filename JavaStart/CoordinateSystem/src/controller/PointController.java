package controller;

import data.Point;

public class PointController {

	public void addX (Point p) {
		p.setX(p.getX() + 1);
	}
	
	public void subX (Point p) {
		p.setX(p.getX() - 1);
	}
	
	public void addY (Point p) {
		p.setY(p.getY() + 1);
	}
	
	public void subY (Point p) {
		p.setY(p.getY() - 1);
	}
}