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

    // Pieces to be arranged on the board from
    // lowest x to highest x. First character 
    // in the array will completely populate the
    // line one y coordinate towards the middle of 
    // the board with respect to the rest of the pieces
    public static final char[] PIECES = {
        'P', 'R', 'K', 'B', 'Q', 'K', 'B', 'K', 'R'
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChessBoard board = new ChessBoard(PIECES);
        
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
