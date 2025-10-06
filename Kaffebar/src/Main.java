import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Tast navnet på en café.");
        String input = scan1.nextLine();
        File file = new File("data/menu" + input + ".csv");
        Cafe cafe = new Cafe(input);

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); // skip header

            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                String[] values = line.split(",");

                String name = values[0];
                double price = Double.parseDouble(values[1]);
                double alcPercent = Double.parseDouble(values[2]);
                double sizeInCL = Double.parseDouble(values[3]);

                Beverage b = new Beverage(name, price, alcPercent, sizeInCL);
                cafe.addItem(b);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        cafe.showMenu();
        cafe.createBeverage();

        cafe.showMenu();

        // save data
        cafe.saveData();


    }
}

