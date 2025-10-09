import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLaeserProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();


        System.out.println("Skriv filnavnet.");
        String filnavn = scanner.nextLine();

        try {
            String indhold = fileIO.laesFilIndhold(filnavn);
            System.out.println("Filens indhold er:\n" + indhold);
        } catch (FileNotFoundException fnfe){
            System.out.println("Forkert filnavn. Prøv igen.");
        }

        scanner.close();

        // Bed brugeren om filnavn
        // Kald fileIO.laesFilIndhold() i en try-catch
        // Hvis FileNotFoundException: bed om nyt filnavn og prøv igen
        // Fortsæt indtil en gyldig fil er læst
        // Print filens indhold
    }
}