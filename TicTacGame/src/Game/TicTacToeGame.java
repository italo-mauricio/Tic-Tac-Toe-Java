package Game;


public class TicTacToeGame {
    static char[][] ticTacToe = new char[3][3];
    int move = 1;

    public static void ticTacToe() {
    }


    boolean validarJogada(int linha, int coluna, char sinal){
        if(ticTacToe[linha][coluna] == 'X' || ticTacToe[linha][coluna] == 'O'){
            return false;
        }else {
            ticTacToe[linha][coluna] = sinal;
            move++;
            return true;
        }
    }


    void exibirTabuleiro(){

        for (int i = 0; i < ticTacToe.length; i++){
            for (int j = 0; j < ticTacToe[i].length; j++){
                System.out.print(ticTacToe[i][j] + " | ");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char signal) {
        //verificar quem ganhou
        if ((ticTacToe[0][0] == signal && ticTacToe[0][1] == signal && ticTacToe[0][2] == signal) ||    // linha 1
                (ticTacToe[1][0] == signal && ticTacToe[1][1] == signal && ticTacToe[1][2] == signal) ||  // linha 2
                (ticTacToe[2][0] == signal && ticTacToe[2][1] == signal && ticTacToe[2][2] == signal) ||  // linha 3
                (ticTacToe[0][0] == signal && ticTacToe[1][0] == signal && ticTacToe[2][0] == signal) ||  // coluna 1
                (ticTacToe[0][1] == signal && ticTacToe[1][1] == signal && ticTacToe[2][1] == signal) ||  // coluna 2
                (ticTacToe[0][2] == signal && ticTacToe[1][2] == signal && ticTacToe[2][2] == signal) ||  // coluna 3
                (ticTacToe[0][0] == signal && ticTacToe[1][1] == signal && ticTacToe[2][2] == signal) ||  // diagonal
                (ticTacToe[0][2] == signal && ticTacToe[1][1] == signal && ticTacToe[2][0] == signal)) {   //diagonal inversa
            return true;
        }
        return false;
    }

    boolean vezJogador1(){
        if (move % 2 == 1){
            return true;
        }
        return false;
    }
}
}




