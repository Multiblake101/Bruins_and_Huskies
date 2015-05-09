/*
 * Grayson Sinclair 
 * 04/25/2015
 *
 * The client/user interface for the chess game program
 */

import java.util.Scanner;

class GameClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Chess! Choose an option to get started!");
        printOptions();

        String userResponse = input.nextLine();
        while (!userResponse.equals("0")) {
            if (userResponse.equals("1")) {
                ChessGame game = new ChessGame();
                game.main(args); // args is just a placeholder
            } else {
                System.out.println("Please choose a valid option:");
                printOptions();
            }

            userResponse = input.nextLine();
        }
    }

    public static void printOptions() {
        System.out.println();
        System.out.println("1: New Game");
        System.out.println("0: Quit");
    }
}

