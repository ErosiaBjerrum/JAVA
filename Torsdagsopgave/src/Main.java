import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        File file = new File("data/customers.csv");

        try {
            Scanner filereader = new Scanner(file);
            filereader.nextLine();

            while(filereader.hasNextLine()){
                String s = filereader.nextLine();
                String[] values = s.split(",");
                System.out.println("Objektets fornavn: " + values[0]);

                String firstName = values[0];
                String lastName = values[1];
                String userName = values[2];
                int userAge = Integer.parseInt(values[3].trim());

                Customer c = new Customer(firstName, lastName, userName, userAge);

            }

        }   catch (FileNotFoundException e) {
               System.out.println(e.getMessage());
        }





    }
}