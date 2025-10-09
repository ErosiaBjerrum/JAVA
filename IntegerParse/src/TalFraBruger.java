import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        int currentYear = 2025;
        int birthYear;
        int userAge;
        boolean validinput = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast dit fødselsår:");


        while(validinput==false) {

            String input = scanner.nextLine();
            try {
                birthYear = Integer.parseInt(input);
                userAge = currentYear-birthYear;

                if(userAge>=18) {
                System.out.println("Du er " + userAge + " år gammel og voksen!");
                } else{
                    System.out.println("Du er " + userAge + " år gammel og for ung!");
                }
                validinput = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Fejl! Du skal skrive et tal.");
            }

            // Brug Integer.parseInt til at konvertere input til int
            // Beregn brugerens alder (antag at nuværende år er 2025)
            // Print alderen
        }
    }
}