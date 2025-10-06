import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    String name;
    ArrayList<Beverage> menu = new ArrayList<>();


    // Constructor
    public Cafe(String name) {
        this.name = name;
        this.menu = new ArrayList<Beverage>();
    }


    public void addItem(Beverage b){
        menu.add(b);
    }

    public void showMenu(){
        for(int i = 0; i < menu.size(); i++){
            Beverage b = menu.get(i);
            System.out.println(b);
        }
    }

    public void createBeverage() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tast navnet på den nye vare");
        String name = scan.nextLine();

        System.out.println("Tast prisen på den nye vare");
        double price = scan.nextDouble();

        System.out.println("Tast alkoholprocenten på den nye vare");
        double alcPercent = scan.nextDouble();

        System.out.println("Tast størrelsen på den nye vare");
        double sizeInCL = scan.nextDouble();

        Beverage b = new Beverage(name, price, alcPercent, sizeInCL);
        menu.add(b);
    }

    // save data
    public void saveData(){
        try{
            FileWriter writer = new FileWriter("data/menu" + this.name + ".csv");
            for (Beverage b : menu){
                writer.write(b.toString());
            }
            writer.close();
       } catch(IOException e){
            System.out.println("Kan ikke skrive til filen");
        }
    }

}
