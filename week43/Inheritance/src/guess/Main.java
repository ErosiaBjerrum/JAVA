package guess;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int guess;
        int min = 1, max = 10;
        HumanPlayer otto = new HumanPlayer();
        ComputerPlayer robotto = new ComputerPlayer();

        int numberToGuess = rnd.nextInt(min, max + 1);

        while (true) {

            guess = otto.guessANumber(min, max);
            System.out.println("Otto har gættet på " + guess + ".");
            if (equal(numberToGuess, guess)){
                System.out.println("Otto har vundet!");
                break;
            }

            guess = robotto.guessANumber(min, max);
            System.out.println("Robotto har gættet på " + guess + ".");
            if (equal(numberToGuess, guess)){
                System.out.println("Robotto har vundet!");
                break;
            }
        }
    }
    private static boolean equal(int a, int b){
        return a == b;
    }
}
