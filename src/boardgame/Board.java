package boardgame;

public class Board {
	private int row;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int row, int columns) {
		this.row = row;
		this.columns = columns;
		pieces = new Piece[row][columns];
	}

	protected int getRow() {
		return row;
	}

	protected void setRow(int row) {
		this.row = row;
	}

	protected int getColumns() {
		return columns;
	}

	protected void setColumns(int columns) {
		this.columns = columns;
	}
	
}
