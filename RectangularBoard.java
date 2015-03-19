/*
 * Grayson Sinclair
 * March 19, 2015
 * 
 * This interface defines the public functionality
 * that should be present in all square board classes
 */

interface RectangularBoard {
	// Define the dimensions of the board
	int BOARD_WIDTH = 8;
	int BOARD_HEIGHT = 8;
	
	// Return the character representation
	// of a single piece at the specified coordinates
	RectangularBoardPiece getPiece(int x, int y);
	
	// Add a pointer to the piece to a specific location on the board
	void putPiece(RectangularBoardPiece piece, int x, int y);
	
	// Return an asciiart representation of the board
	String toString();
}