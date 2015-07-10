package model;


public class BoardData {
	
	private int colCount;
	private int rowCount;
	BoardCell[][] map;

	public BoardData(int rows, int cols) {
		rowCount = rows;
		colCount = cols;
		map = new BoardCell[rowCount][colCount];
		mapGenerate();
	}
	
	private void mapGenerate() {
		for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < colCount; column++) {
                map[row][column] = new BoardCell(row, column);
            }
        }
	}
	
	private void foodGenerate() {
		int row = (int)(Math.random() * (rowCount));
		int col = (int)(Math.random() * (colCount));
		
		if (map[row][col].getType() == BoardCell.EMPTY_ROOM) {
			map[row][col].setType(BoardCell.TARGET_ROOM);
		} else {
			foodGenerate();
		}
	}

}
