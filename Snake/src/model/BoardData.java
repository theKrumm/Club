package model;

import java.util.Random;

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
		Random rand = new Random();
		int row = (int)(Math.random() * (rowCount));
		int col = (int)(Math.random() * (colCount));
		
		if (map[row][col].cellType == BoardCell.EMPTY_ROOM) {
			map[row][col].cellType = BoardCell.TARGET_ROOM;
		} else {
			foodGenerate();
		}
	}

}
