import java.util.ArrayList;
import java.util.Scanner;


public class Game {

    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    private int maxPlayers;


    // Constructor

    public Game(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
    }


    public void registerPlayers() {

        players.size();
        System.out.println("Størrelse på playerliste: FØR " + players.size());

        while (players.size() < maxPlayers) {
            System.out.println("Tast navn på spiller " + (players.size()+1) + ": ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Player p = new Player(input);
            players.add(p);
        }

        players.size();
        System.out.println("Størrelse på playerliste: EFTER " + players.size());

    }
        @Override
        public String toString () {

            String s = this.name;
            for (Player p : players) {
                s += "\n" + p.toString();


            }
            return s;
        }

    }
