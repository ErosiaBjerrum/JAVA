import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {


    public String laesFilIndhold(String filnavn) throws FileNotFoundException {

        File myFile = new File(filnavn);
        Scanner scanner = new Scanner(myFile);
        String indhold = "";

        while (scanner.hasNextLine()) {
            indhold = scanner.nextLine();
        }
        scanner.close();
        return indhold;

       // Opret Scanner med File
        // Læs hele filens indhold (alle linjer samlet i en String)
        // Luk Scanner
        // Returner indholdet

    }
}
