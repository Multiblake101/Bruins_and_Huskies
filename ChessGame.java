/*
 * Grayson Sinclair
 * 04/25/2015
 *
 * Instantiates a new vanilla chess game
 */

import java.util.Scanner;

class ChessGame {
    // Choose the player's starting color
    // true  ->  white
    // false ->  black
    public static final boolean COLOR = true;
    
    // Declarations of al the piece's character
    // representations. These are how the piece
    // will appear on the printed board. 
    public static final char PAWN = 'P';
    public static final char ROOK = 'R';
    public static final char KNIGHT = 'N';
    public static final char BISHOP = 'B';
    public static final char QUEEN = 'Q';
    public static final char KING = 'K';

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChessBoard board = new ChessBoard();
        // TODO: Add all pieces, black and white

        // TODO: Add an interpreter for user input
        // that returns boolean for gameFinished
        // and moves the pieces/evaluates whether 
        // the game has been won/prompts the user
        // to retry their move if the last input 
        // was wrong
        boolean gameFinished = false;
        while (!gameFinished) {
            System.out.println(board.toString());
            gameFinished = input.nextLine().equals("done");
        }
    }
}
