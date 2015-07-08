package model;

import java.awt.Point;
import java.util.ArrayList;

public class Snake {
	private Point head;
	private ArrayList<Point> body;
	private Point tail;
	
	public Snake() {
		head = new Point(0, 2);
		body = new ArrayList<Point>();
		body.add(new Point(0, 1));
		body.add(new Point(0, 0));
		tail = body.get(body.size() - 1);
	}
	public Point getHead() {
		return head;
	}
	
	public ArrayList<Point> getBody() {
		return body;
	}
	
	public void addBody() {
		Point prev = body.get(body.size() - 2);
		int dx = (int) (tail.getX() - prev.getX());
		int dy = (int) (tail.getY() - prev.getY());
		
		if (dx != 0) {
			if (dx < 0) {
				body.add(new Point((int) tail.getX() + 1, (int) tail.getY()));
			} else {
				body.add(new Point((int) tail.getX() - 1, (int) tail.getY()));
			}
		} else if (dy != 0) {
			if (dy < 0) {
				body.add(new Point((int) tail.getX(), (int) tail.getY() + 1));
			} else {
				body.add(new Point((int) tail.getX(), (int) tail.getY() - 1));
			}
			
		}
		body.add(tail);
		tail = body.get(body.size() - 1);
		
	}
	
}
