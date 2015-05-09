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
    
    // Declarations of al the piece's character
    // representations. These are how the piece
    // will appear on the printed board. 
    // The cases will change depending on piece
    // color. (Since there is no color, white is
    // uppercase, black is lowercase.)
    public static final char PAWN = 'P';
    public static final char ROOK = 'R';
    public static final char KNIGHT = 'N';
    public static final char BISHOP = 'B';
    public static final char QUEEN = 'Q';
    public static final char KING = 'K';
    public static final char[] REPRESENTATIONS = {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
    };

    // Creates a chessboard for the user
    public ChessBoard() {
        matrix = new ChessPiece[BOARD_HEIGHT][BOARD_WIDTH];
    }

    // Takes an array of BOARD_WIDTH + 1 characters
    // Each character should correspond to the 
    // character representations specified above.
    // Places the populates the entire second row with
    // the character in the first array, and the row 
    // behind that with the following array of characters
    // in the order specified. 
    // Throws IllegalArgumentException if wrong
    // number of arguments are given, or an illegal
    // character is passed. (A character without a
    // corresponding representation.)
    public ChessBoard(char[] reps) {
        if (reps.length != BOARD_WIDTH + 1 || 
                !containsAll(REPRESENTATIONS, reps))
            throw new IllegalArgumentException();
        
        for (int i = 0; i < BOARD_WIDTH; i++) {
        // TODO: Change piece to the class they should actually be
            if (false /* this character == ROOK, make a rook etc. */) {
            }
        }

    }

    // TODO: return true if second array's elements only
    // consist of elements from the first array
    public boolean containsAll(char[] encapsulating, char[] excerpt) {
        return true;
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
