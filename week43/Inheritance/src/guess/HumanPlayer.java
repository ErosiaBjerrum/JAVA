package guess;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name){
        this.name = name;
    }

    @Override
    public int guessANumber(int min, int max) {
        System.out.println("Indtast et tal mellem " + min + " og " + max + ":");
        int input = scanner.nextInt();
        return input;
    }

    public String getName(){
        return name;
    }
}
