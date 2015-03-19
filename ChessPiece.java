/*
 * Grayson Sinclair
 * March 19, 2015
 * 
 * The superclass of all chess pieces,
 * effectively a pawn that can only move upwards
 */

public class ChessPiece {
	private static final char SYMBOL = 'P';
	private static final String ALPHA = "ABCDEFGH";
	private ChessBoard board;
	private boolean isWhite;
	private boolean isInPlay;
	private int x;
	private int y;
	
	// Specify the piece's board, color, and coordinates
	public ChessPiece(ChessBoard board, boolean colorIsWhite, int x, int y) {
		this.board = board;
		this.isWhite = colorIsWhite;
		this.isInPlay = true;
		this.x = x;
		this.y = y;
		
		put();
	}

	// Returns true if the piece is alive
	public boolean inPlay() {
		return isInPlay;
	}
	
	// Retrieves the piece's symbol, for use 
	// in ascii board rendering
	public char getSymbol() {
		return SYMBOL;
	}

	// Oh my word, why did I make this a 
	// string function???
	// Returns the coordinates in the form of
	// a chess by mail coordinate e.g. index 2,6 is "c2"
	public String coordinates() {
		String coords = "";
		for (int i = 0; i < ALPHA.length(); i++) 
			if (x == i)
				coords += ALPHA.charAt(i);
		coords += y;
		return coords;
	}

	// Returns true if the given coordinates
	// are a valid option for a movement
	public boolean canMove(String coordinates) {
		int coords = getXYCoordinates(coordinates);
		int xCoord = coords / 10;
		int yCoord = coords % 10;
		
		int direction = 1;
		if (!isWhite)
			direction *= -1;
		
		return this.x == xCoord && this.y + direction == yCoord;
	}

	// Moves the piece from its current slot on
	// the board to the place where it is now
	// coordinates MUST BE valid, and move 
	// DOES NOT check for mistaken input;
	// it is the client's responsibility to 
	// use canMove first
	public void move(String coordinates) {
		this.board[x][y] = this.board.getNullPiece();
		int coords = getXYCoordinates(coordinates);
		this.x = coords / 10;
		this.y = coords % 10;
		this.put();
	}
	
	// Places the piece down at the location of
	// the xy coordinates contained in the fields x and y
	private void put() {
		this.board.putPiece(this, x, y);
	}
	
	// Helper method for converting chess by mail
	// coordinates to an "xy" format, where the 10's decimal place is
	// the x, and the 1's decimal place is the y
	// Helper completely changes the string handed to it
	// Will throw IllegalArgumentException if not given
	// a String of length two, whose first character is
	// a letter within the inclusive range a through h
	// and whose second character is 1 through 8 inclusive
	private int getXYCoordinates(String mailFormat) {
		mailFormat.toUpperCase();
		if (mailFormat.length() != 2 || (int) mailFormat.charAt(0) < 101 || 
				(int) mailFormat.charAt(0) > 110 || mailFormat.charAt(1) < 1 ||
				mailFormat.charAt(1) > 8)
			throw new IllegalArgumentException();
		
		char xCoord = mailFormat.charAt(0);
		int yCoord = Integer.parseInt("" + mailFormat.charAt(1));
		
		for (int i = 0; i < ALPHA.length(); i++)
			if (ALPHA.charAt(i) == xCoord)
				yCoord += i * 10;
		mailFormat += yCoord;
		return yCoord;
	}

	// removes the given piece from play
	public void remove() {
		this.isInPlay = false;
		this.board[x][y] = this.board.getNullPiece();
	}
}
