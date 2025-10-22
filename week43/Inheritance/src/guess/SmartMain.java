package guess;

import java.util.ArrayList;
import java.util.Random;

public class SmartMain {

    public static void main(String[] args) {

        Random rnd = new Random();
        int guess;
        int min = 1, max = 10;
        HumanPlayer otto = new HumanPlayer();
        ComputerPlayer robotto = new ComputerPlayer();
        ArrayList<Player> players = new ArrayList<>();

        players.add(otto);
        players.add(robotto);

        int numberToGuess = rnd.nextInt(min, max + 1);

        while (true) {

            for (Player player : players){
                guess = player.guessANumber(min, max);
                System.out.println(player + " har gættet på " + guess + ".");
                if (equal(numberToGuess, guess)){
                    System.out.println(player + " har vundet!");
                    break;
                }
            }
        }
    }

    private static boolean equal(int a, int b){
        return a == b;
    }

}
