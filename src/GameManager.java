import Quizz.QuizzGame;
import TicTacToe.TicTacToeGame;

import java.util.Scanner;

public class GameManager {

    final static String QUIZ_GAME_CODE = "1";
    final static String TIC_TAC_TOE_GAME_CODE = "2";

    public void gameSelector() {
        String selectedGame = getSelectedGame();

        if (selectedGame.equals(QUIZ_GAME_CODE)) {
            QuizzGame quizzGame = new QuizzGame();
        } else if (selectedGame.equals(TIC_TAC_TOE_GAME_CODE)) {
            TicTacToeGame ticTacToeGame = new TicTacToeGame();
            ticTacToeGame.play();
        }
    }

    private String getSelectedGame() {
        Scanner playerInput = new Scanner(System.in);
        String input = " ";

        while (!(input.equals(QUIZ_GAME_CODE) || input.equals(TIC_TAC_TOE_GAME_CODE))) {
            System.out.println("Enter 1 to play quizz or 2 to play tic tac toe");
            input = playerInput.nextLine();
        }
        return input;
    }


}



