package Game;

import java.util.Scanner;
import Game.PlayerStatus.Player;
import Game.PlayerStatus.AppPlayer;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TicTacToeGame ticTacToeGame = new TicTacToeGame();

        new Screen();
        new AppPlayer();
        Player player = new Player();
        AppPlayer appPlayer = new AppPlayer();


        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while(!ganhou){
            TicTacToeGame.Screen();
            AppPlayer.main();
            if(ticTacToeGame.playerOneMove()){

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3): ");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3): ");
                sinal = 'O';
            }
            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);
            ticTacToeGame.validMove(linha, coluna, sinal);
            ticTacToeGame.displayBoard();

            if(ticTacToeGame.chekWinner('X')){
                ganhou = true;
                System.out.println("Parabéns jogador 1 ganhou");
            }else if (ticTacToeGame.chekWinner('O')){
                System.out.println("Parabéns jogador 2 ganhou");
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