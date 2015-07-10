package model;

// one cell on the game map.
public class BoardCell {
	// room with nothing in it.
	public final static int EMPTY_ROOM = 0;
	// room with part of the snake in it.
	public final static int BODY_ROOM = 1;
	// room with snake food in it.
	public final static int TARGET_ROOM = 2;
	// row of the cell.
	private final int row;
	//column of the cell.
	private final int col;
	// which kind of cell it is (empty, body room, or target room).
	public int cellType;

	public BoardCell(int row, int col) {
		this.row = row;
		this.col = col;
	}

}
