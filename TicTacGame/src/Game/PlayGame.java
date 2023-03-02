package Game;

import java.util.Scanner;
import Game.RegisterPlayer.Player;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        new Screen();
        Player player = new Player();


        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        String player1 = ticTacToeGame.registerPlayer1();
        String player2 = ticTacToeGame.registerPlayer2();
        while(!ganhou){
            TicTacToeGame.Screen();
            if(ticTacToeGame.playerOneMove()){
                System.out.println("Vez do jogador: " + player1 +"\nEscolha linha e coluna (1 - 3): ");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador: " +  player2 + "\nEscolha linha e coluna (1 - 3): ");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);
            ticTacToeGame.validMove(linha, coluna, sinal);
            ticTacToeGame.displayBoard();

            if(ticTacToeGame.chekWinner('X')){
                ganhou = true;
                System.out.println("Parabéns jogador: " + player1 + " ganhou");
            }else if (ticTacToeGame.chekWinner('O')){
                System.out.println("Parabéns jogador: " + player2 + " ganhou");
            }else if (ticTacToeGame.move > 9){
                ganhou = true;
                System.out.println("Empate");
            }
        }
    }

    private static void appPlayer() {
    }

    static int valor(String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValido = false;
        while(!valorValido){
            System.out.println("Digite a" + tipoValor + " 1 2 e 3");
            valor = scan.nextInt();
            if(valor >= 1 && valor <= 3){
                valorValido = true;
            }else{
                System.out.println("Entrada inválida, tente novamente!");
            }
        }
        valor --;
        return valor;
    }
}