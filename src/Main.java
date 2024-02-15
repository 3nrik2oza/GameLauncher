import TicTacToe.TicTacToeGame;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        GameManager gameManager = new GameManager();
        gameManager.gameSelector();
    }
}