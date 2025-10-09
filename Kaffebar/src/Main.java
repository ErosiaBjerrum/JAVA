import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Får besked fra brugeren om, hvilken cafe der skal arbejdes med
        Scanner scan1 = new Scanner(System.in);
        System.out.println("tast navnet på en cafe:");
        String input = scan1.nextLine();

        Cafe cafe = new Cafe(input);

        File file = new File("data/menu"+input+".csv");
        String header = "";

        try {
            Scanner scan = new Scanner(file);
            header = scan.nextLine(); //skip header

            while(scan.hasNextLine()){
                //læs linjen
                String line = scan.nextLine();  //  "Espresso, 40, 0, 10"
                //isoler værdierne
                String[] values  = line.split(","); //  {"Espresso","40", "0", "10" }

                //assign værdier til variable
                String name = values[0];
                double price = Double.parseDouble(values[1].trim());
                double alcPercent = Double.parseDouble( values[2].trim());
                double sizeInCL = Double.parseDouble(values[3].trim());

                //brug variable til at instansiere drik og tilføj den til cafeen
                Beverage b = new Beverage(name, price, alcPercent, sizeInCL);
                cafe.addItem(b);
            }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

   /* cafe.addItem(b);
      cafe.addItem(b1);
      cafe.addItem(b2);
      cafe.addItem(b3);
   */

        cafe.showMenu();
        /// MATCHA LATTE TILFØJES TIL MENUEN
        cafe.createBeverage();

        /// EFTER:
        cafe.showMenu();


        cafe.saveData(header);
    }





}