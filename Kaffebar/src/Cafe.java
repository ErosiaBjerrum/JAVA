import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    String name;
    ArrayList<Beverage> menu;

    public Cafe(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addItem(Beverage b){
        menu.add(b);
    }

    public void showMenu(){
        //for-i
      /* for(int i = 0; i < menu.size(); i++){
          Beverage b = menu.get(i);
          System.out.println(b);
       }*/

        //for-each
        for(Beverage b: menu){
            System.out.println(b);
        }

    }

    public void createBeverage(){

        Scanner scan = new Scanner(System.in);

        //Ask user for beverage name, price, alco, size etc.
        System.out.println("Tast navnet på den nye vare");
        String name = scan.nextLine();

        System.out.println("Tast prisen på den nye vare");
        double price = scan.nextDouble();

        System.out.println("Tast alcohol procenten på den nye vare");
        double alco = scan.nextDouble();

        System.out.println("Tast størrelsen på den nye vare");
        double size = scan.nextDouble();

        Beverage b = new Beverage(name, price, alco, size);
        menu.add(b);

    }

    public void saveData(String header){

        try {
            FileWriter writer = new FileWriter("data/menu" + this.name + ".csv");

            writer.write(header);

            for(Beverage b: menu){
                writer.write(b.toCSV());
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Problemer med at skrive til filen.");
        }


    }

    @Override
    public String toString() {
        String s = "***********************************\n"+
                this.name+"\n"+
                "***********************************\n";
        return s;
    }
}
