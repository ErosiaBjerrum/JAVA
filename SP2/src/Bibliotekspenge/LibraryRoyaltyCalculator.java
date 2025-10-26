package Bibliotekspenge;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author JussiAdler = new Author("Jussi Adler");
        PrintedBook book1 = new PrintedBook("Kvinden i buret", "SKØN", 230, 378);
        PrintedBook book2 = new PrintedBook("Den døde herre", "SKØN", 123, 256);
        AudioBook book3 = new AudioBook("Forfatterens manual", "FAG", 54, 420);

        JussiAdler.addTitle(book1);
        JussiAdler.addTitle(book2);
        JussiAdler.addTitle(book3);

        double royalties = JussiAdler.calculateRoyalties();


        System.out.println(JussiAdler.getName() + ": " + royalties + " kr.");
    }
}
