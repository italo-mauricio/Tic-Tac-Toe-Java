package Game;

import java.util.Scanner;
import Game.RegisterPlayer.Player;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        new Screen();
        Player player = new Player();


        boolean win = false;
        char signal;
        int row = 0, column = 0;

        String player1 = ticTacToeGame.registerPlayer1();
        String player2 = ticTacToeGame.registerPlayer2();
        while(!win){
            TicTacToeGame.Screen();
            if(ticTacToeGame.playerOneMove()){
                System.out.println("Player's turn: " + player1 +"\nChoose row and column (1-3): ");
                signal = 'X';
            }else{
                System.out.println("Vez do jogador: " +  player2 + "\nChoose row and column (1-3)): ");
                signal = 'O';
            }

            row = getValue("Row", scan);
            column = getValue("Colum", scan);
            ticTacToeGame.validMove(row, column, signal);
            ticTacToeGame.displayBoard();

            if(ticTacToeGame.chekWinner('X')){
                win = true;
                System.out.println("Parabéns jogador: " + player1 + " ganhou");
            }else if (ticTacToeGame.chekWinner('O')){
                System.out.println("Parabéns jogador: " + player2 + " ganhou");
            }else if (ticTacToeGame.move > 9){
                win = true;
                System.out.println("Empate");
            }
        }
    }

    static int getValue(String valueLabel, Scanner scan) {
        int value = 0;
        boolean validValue = false;
        while(!validValue) {
            System.out.println("Enter " + valueLabel + " (1, 2, or 3):");
            value = scan.nextInt();
            if(value >= 1 && value <= 3) {
                validValue = true;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
        value--;
        return value;
    }

    private static void appPlayer() {
    }
}