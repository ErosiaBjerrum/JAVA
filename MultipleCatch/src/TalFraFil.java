import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args) {
        int[] talArray = new int[5];

        String path = "data/tekst.txt";
        File file = new File(path);



        try {
            Scanner scan = new Scanner(file);
            int counter = 0;
            while(scan.hasNextLine()){
                talArray[counter] = Integer.parseInt(scan.nextLine());
                counter++;
            }
        } catch (FileNotFoundException e){
            System.out.println("Filen blev ikke fundet.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Der er for mange elementer.");
        } catch (NumberFormatException e){
            System.out.println("Du skal skrive et heltal.");
        }

        for(int i: talArray){
            System.out.println(i);
        }
        // Læs tal fra fil "tal.txt" med Scanner
        // Gem tallene i talArray
        // Håndter følgende exceptions med separate catch-blokke:
        // - FileNotFoundException
        // - ArrayIndexOutOfBoundsException (hvis filen har for mange tal)
        // - NumberFormatException (hvis filen indeholder ikke-tal)
    }
}