/*
 * Grayson Sinclair
 * March 19, 2015
 * 
 * The class for a chessboard, keeps track of the 
 * pieces accordingly. This board only keeps track
 * of a single char per space on the board, so any
 * value added to the board from the piece's toString
 * must be cast to a char.
 */

public class ChessBoard implements RectangularBoard {
	// To define row of a board
	static final String ALPHA = "ABCDEFGH";
	// Spots on the board, onto which pieces
	// may be placed
	private RectangularBoardPiece[][] spots;
	
	// Create a generic board.
	public ChessBoard(){
		spots = new ChessPiece[BOARD_WIDTH][BOARD_HEIGHT];
		
		ChessPiece placeHolder = new ChessPiecePlaceHolder();
		for (int i = 0; i < BOARD_WIDTH; i++)
			for (int j = 0; j < BOARD_HEIGHT; j++)
				spots[i][j] = placeHolder;
				// The above is a lazy way to avoid null pointer exceptions
	}
	
	// Print which piece is at the specified coordinate
	// Takes coordinates as two integer values x and y
	// Will throw IllegalArgumentException if coordinates
	// are out of bounds
	public RectangularBoardPiece getPiece(int x, int y) {
		if (!checkBounds(x, y)) 
			throw new IllegalArgumentException();
		return spots[x][y];
	}
	
	// Like getPiece, but inserts a specified piece
	// into a spot on the board at specified coordinates
	public void putPiece(RectangularBoardPiece piece, int x, int y) {
		if (!checkBounds(x, y)) 
			throw new IllegalArgumentException();
		spots[x][y] = piece;
	}
	
	// takes two integers x and y and returns true if they
	// are within the bounds of the board
	public boolean checkBounds(int x, int y) {
		return x >= 0 && x < BOARD_WIDTH && y >= 0 && y < BOARD_HEIGHT;
	}
	
	// Print the current board
	// board must be printed backwards (y, x)
	// or else x and y will appear inverted
	public String toString() {
		return this.toString(false);
	}
	
	// Print the board with line numbers, if true
	// false elsewise
	// TODO: Use TextAttribute underlining to make a prettier board
	public String toString(boolean lineNumbers) {
		String board_string = " ";
		int adjustedWidth = BOARD_WIDTH - 1;
		
		for (int i = 0; i < BOARD_WIDTH; i++)
				board_string += "_ ";
		board_string += "\n";
		for (int i = 0; i < BOARD_HEIGHT; i++) {
			if (lineNumbers)
				board_string += (8 - i);
			board_string += '|';
			for (int j = 0; j < adjustedWidth; j++) 
				board_string += ((ChessPiece) spots[j][i]).getSymbol() + " ";
			board_string += 
					((ChessPiece) spots[adjustedWidth][i]).getSymbol() + "|\n";
		}
		if (lineNumbers)
			for (int i = 0; i < BOARD_WIDTH; i++) 
				board_string += " " + ALPHA.charAt(i);
		
		return board_string;
	}
}
