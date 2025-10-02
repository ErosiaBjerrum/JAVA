import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner catNumberQ = new Scanner(System.in);
        int numberOfCats;

        System.out.println("Hvor mange katte har du?");

        while (!catNumberQ.hasNextInt()) {
            System.out.println("Fejl. Du skal indtaste et heltal.");
            catNumberQ.next();
        }

        numberOfCats = catNumberQ.nextInt();
        catNumberQ.nextLine();

        String[] catNames = new String[numberOfCats];

        for (int i = 0; i < numberOfCats; i++) {
            System.out.println("Hvad hedder din " + getOrdinal(i) + " kat?");
            catNames[i] = catNumberQ.nextLine();
        }

        System.out.println("Dine katte hedder:");
        for (String name : catNames) {
            System.out.println(name);
        }

    }

        public static String getOrdinal(int i){
            switch (i) {
                case 0: return "første";
                case 1: return "anden";
                case 2: return "tredje";
                case 3: return "fjerde";
                case 4: return "femte";
                case 5: return "sjette";
                case 6: return "syvende";
                case 7: return "ottende";
                case 8: return "niende";
                default: return (i + 1) + ".";

            }
            }

        }



