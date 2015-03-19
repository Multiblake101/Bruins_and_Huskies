/*
 * Grayson Sinclair
 * March 19, 2015
 * 
 * Instantiates a generic game using the
 * other classes in this project
 */

public class Game {
	public static void main(String[] args) {
		ChessBoard b = new ChessBoard();
		ChessPiece piece1 = new ChessPiece(b, false, 4, 2);
		ChessPiece piece2 = new ChessPiece(b, true, 0, 0);
		ChessPiece piece3 = new ChessPiece(b, true, 6, 3);
		System.out.println(b.toString(true));
	}
}
