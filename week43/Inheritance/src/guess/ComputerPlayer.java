package guess;

import java.util.Random;

public class ComputerPlayer implements Player {
    private String name;
    private Random rnd = new Random();

    public ComputerPlayer(String name){
        this.name = name;
    }

    @Override
    public int guessANumber(int min, int max) {
        int computerGuess = rnd.nextInt(min, max+1);
        return computerGuess;
    }
}
