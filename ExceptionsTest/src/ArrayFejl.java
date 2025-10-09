import java.io.IOException;
import java.util.Scanner;

public class ArrayFejl {

    public static void printTreForsteElementer(String[] array) {

        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Der mangler et element.");
            String[] fixedArray = {array[0], array[1], null};

            printTreForsteElementer(fixedArray);
        }
    }

        public static void main (String[] args){

            String[] navne1 = {"Anna", "Bob", "Clara", "David"};
            String[] navne2 = {"Eva", "Frank"};

            printTreForsteElementer(navne1);
            printTreForsteElementer(navne2);

            getUserInput();

        }

        public static void getUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv et tal mellem 5 og 10");

       tryk
        int input = Integer.parseInt(scan.nextLine());
        }
    }

/*
Din opgave:

Identificer hvad der går galt når metoden kaldes med navne2
Tilføj try-catch i metoden til at håndtere ArrayIndexOutOfBoundsException
I catch-blokken skal du printe en brugervenlig fejlbesked
Sørg for at programmet fortsætter og kan kalde metoden med begge arrays
Note: Normalt ville vi validere array-længden med array.length før vi tilgår elementer, men i denne opgave skal du øve dig i at bruge try-catch.
*/
