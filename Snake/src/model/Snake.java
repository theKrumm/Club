package model;

// snake and its direction.

import java.util.ArrayList;

public class Snake {
	private BoardCell head;
	private ArrayList<BoardCell> body;
	private BoardCell tail;
	
	public Snake(BoardCell startingLocation) {
		head = startingLocation;
		body = new ArrayList<BoardCell>();
		tail = body.get(body.size() - 1);
		// need to decide a starting location, so we can add 2 body parts.
	}
	public BoardCell getHead() {
		return head;
	}
	
	public ArrayList<BoardCell> getBody() {
		return body;
	}
	
	public BoardCell getTail() {
		return tail;
	}
	
	public void addBody() {
		BoardCell prev = body.get(body.size() - 2);
		int dx = (tail.getCol() - prev.getCol());
		int dy = (tail.getRow() - prev.getRow());
		
		if (dx != 0) {
			if (dx < 0) {
				body.add(new BoardCell( tail.getCol() + 1, tail.getRow()));
			} else {
				body.add(new BoardCell( tail.getCol() - 1, tail.getRow()));
			}
		} else if (dy != 0) {
			if (dy < 0) {
				body.add(new BoardCell((int) tail.getCol(), (int) tail.getRow() + 1));
			} else {
				body.add(new BoardCell((int) tail.getCol(), (int) tail.getRow() - 1));
			}
		}
		body.add(tail);
		tail = body.get(body.size() - 1);	
	}
	
}
