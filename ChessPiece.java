/*
 * Grayson Sinclair
 * 04/24/2015
 *
 * The chess piece is what should be used
 * as the basis for board logic.
 * A piece's movement about a board should be 
 * entirely encapsulated by that piece's methods.
 *
 * Also, pieces use the boards methods to move 
 * themselves around the board.
 *
 * If a piece is placed on the board at a location
 * already occupied by another piece, the movement
 * will kill the piece that was previously there.
 * This is not considered an error and thus this 
 * will happen silently. 
 */

class ChessPiece {
    private ChessBoard board;
    private boolean color;
    private char representation;
    private int x;
    private int y;

    // Associates a piece with a space on the board
    // Takes the board to be associated with, the 
    // coordinates to be placed at, a character to 
    // represent the piece, and a boolean to represent 
    // the color. (White is true, black is false.)
    public ChessPiece(ChessBoard board, boolean isWhite, char rep, int x, int y) {
        this.x = x;
        this.y = y;
        this.board = board;
        this.color = isWhite;
        this.representation = rep;

        this.move(this.x, this.y);
    }

    // Returns the piece's representation as 
    // a string, for use when the board constructs
    // an image of the game's current state. 
    public String toString() {
        return "" + representation;
    }

    // Takes the coordinates to be moved to,
    // will kill any pieces that were previously
    // at those coordinates. Board will throw
    // IndexOutOfBoundsError if the coordinates
    // are outside the range of the board.
    public void move(int to_x, int to_y) {
        board.setPiece(this, to_x, to_y);
        board.removePiece(this.x, this.y);

        this.x = to_x;
        this.y = to_y;
    }

    // Kills the piece
    // This means that the piece is no longer on the
    // board, NOT that the piece no longer exists,
    // or can no longer be used in the game
    public void kill() {
        board.removePiece(this.x, this.y);
        
        this.x = -1;
        this.y = -1;
    }

    // Returns true if the coordinates are a location
    // that the piece can move to, according to the 
    // rules of the game, false elsewise
    public boolean checkMove(int x, int y) {
        return x != this.x || y != this.y;
    }

    // TODO: Add revive method to put dead pieces 
    // back on the board (Will be necessary to circumvent
    // the piece logic in more complex pieces)
}
