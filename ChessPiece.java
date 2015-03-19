/*
 * Grayson Sinclair
 * March 19, 2015
 * 
 * The superclass of all chess pieces,
 * effectively a pawn that can only move upwards
 */

public class ChessPiece implements RectangularBoardPiece {
	private static final char SYMBOL = 'P';
	private RectangularBoard board;
	private boolean isNullPiece;
	private boolean isWhite;
	private boolean isInPlay;
	private int x;
	private int y;
	
	// Generate a piece and do not put it on the board
	public ChessPiece() {
		this.isNullPiece = true;
		this.isInPlay = false;
		this.isWhite = false;
		this.x = 0;
		this.y = 0;
		this.board = null;
	}
	
	// Specify the piece's board, color, and coordinates
	public ChessPiece(ChessBoard board, boolean colorIsWhite, int x, int y) {
		this.board = board;
		this.isWhite = colorIsWhite;
		this.isInPlay = true;
		this.x = x;
		this.y = y;
		
		board.putPiece(this, this.x, this.y);
	}

	// Returns true if the piece is alive
	public boolean inPlay() {
		return isInPlay;
	}

	// Oh my word, why did I make this a 
	// string function???
	// Returns the coordinates in the form of
	// a chess by mail coordinate e.g. index 2,6 is "c2"
	// Will return null if piece is null
	public String coordinates() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Retrieves the piece's symbol, for use 
	// in ascii board rendering
	public char getSymbol() {
		return SYMBOL;
	}

	// Returns true if the given coordinates
	// are a valid option for a movement
	// Always returns false if isNullPiece
	public boolean canMove(String coordinates) {
		// TODO Auto-generated method stub
		return false;
	}

	// Moves the piece from its current slot on
	// the board to the place where it is now
	// coordinates MUST BE valid, and move 
	// DOES NOT check for mistaken input;
	// it is the client's responsibility to 
	// use canMove first
	// null pieces cannot be moved
	public void move(String coordinates) {
		// TODO Auto-generated method stub
		
	}

	// Places a piece on the board at the 
	// specified coordinates, takes coordinates
	// in the chess by mail format e.g. "b7" for index 1,2
	// Throws IllegalArgumentException if the
	// coordinates are out of bounds
	public void put(String coordinates) {
		// convert coordinates to x and y
	}
	
	//TODO:
	// Helper method for converting chess by mail
	// coordinates to an x, y format
	// Helper completely changes the string handed to it
	// Will throw IllegalArgumentException if not given
	// a String of length two, whose first character is
	// a letter within the inclusive range a through h
	// and whose second character is 1 through 8 inclusive
	private String getXYCoordinates(String mailFormat) {
		mailFormat.toUpperCase();
		if (mailFormat.length() != 2 || (int) mailFormat.charAt(0) < 101 || 
				(int) mailFormat.charAt(0) > 110 || mailFormat.charAt(1) < 1 ||
				mailFormat.charAt(1) > 8)
			throw new IllegalArgumentException();
		
		return mailFormat;
	}

	// removes the given piece from play
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
