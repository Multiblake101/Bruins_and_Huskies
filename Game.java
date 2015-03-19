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
		b.putPiece('K', 4, 0);
		b.putPiece('Q', 5, 7);
		b.putPiece('P', 7, 6);
		System.out.println(b.toString(true));
	}
}
