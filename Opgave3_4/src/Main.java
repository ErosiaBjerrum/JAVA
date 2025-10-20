import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();
        boolean fileFound = false;

        while (!fileFound) {
            System.out.println("Indtast filens navn.");
            String fileName = myScanner.nextLine();
            try {
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);
                fileFound = true;
                System.out.println("Filen indeholder:");
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
                fileScanner.close();
            } catch (FileNotFoundException fnfe) {
                System.out.println("Prøv igen.");
            }
        }
        myScanner.close();
    }
}