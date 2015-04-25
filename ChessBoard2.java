/*
 * Grayson Sinclair
 * 04/24/2015
 *
 * Class defines the board for chess. 
 * It can and should be reused for the checkers game.
 * The board can be used to get Pieces, which can
 * then be moved about the board. the Pieces use the
 * board's methods to move around.
 */

class ChessBoard {
    private static int BOARD_HEIGHT = 8;
    private static int BOARD_WIDTH = 8;

    private ChessPiece[][] matrix;

    // Creates a chessboard for the user
    public ChessBoard() {
        matrix = new ChessPiece[BOARD_HEIGHT][BOARD_WIDTH];
    }

    // Returns the piece at the specified location
    // CAREFUL! Returns null if there isn't a piece 
    // at the specified coordinates! 
    public ChessPiece getPiece(int x, int y) {
        return matrix[y][x];
    }

    // Takes a piece and coordinates, and places the specified
    // piece at those coordinates
    public void setPiece(ChessPiece piece, int x, int y) {
        matrix[y][x] = piece; 
    }

    // Removes a piece from the board at the 
    // specified coordinates
    public void removePiece(int x, int y) {
        matrix[y][x] = null;
    }

    // Public method for public/private toString pair
    public String toString() {
        return toString(false);
    }

    // Returns the board in the form of a string
    // If lineInfo is true, prints extra information
    // about the column and row
    public String toString(boolean lineInfo) {
        String boardString = "";

        // TODO: make this print a good looking 
        // board. Look out for null spaces

        return boardString;
    }
}
