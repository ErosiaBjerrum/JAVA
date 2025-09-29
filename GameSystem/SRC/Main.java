public class Main {


    public static void main(String[] args) {

        Game game = new Game("Ludo", 4);
        Game game1 = new Game("Skak", 2);
        Game game2 = new Game("Uno", 3);

        game.registerPlayers();

        System.out.println(game);


    }
}
