/* 
 * Grayson Sinclair 
 * March 18, 2015
 * 
 * This interface specifies the methods 
 * needed for pieces on the board. 
 * 
 * I don't know if an interface is really the right
 * thing to use here, but I'm defining it for all
 * my pieces so I can use them interchangeably, which
 * seems right. Either way, it's good practice. 
 */

interface RectangularBoardPiece {
	// Specifies whether or not the piece is 
	// being used by the player(s)
	boolean inPlay();
	
	// Returns the current location of the piece
	// as a String. String is for flexibility,
	// so that any number of games can be used.
	// For example, chess may use "a4" while 
	// mastermind uses "blue, red, blue, green"
	// Parsing a string is your problem. >:D
	String coordinates();
	
	// Takes a board and a pair of coordinates
	// and verifies whether the user can move 
	// to that place on the board. 
	boolean canMove(String coordinates);
	
	// Moves the piece to the specified location
	// on the board
	void move(String coordinates);
	
	// Adds the piece to the specified coordinates
	void put(String coordinates);
	
	// Takes the piece out of play
	void remove();
}
