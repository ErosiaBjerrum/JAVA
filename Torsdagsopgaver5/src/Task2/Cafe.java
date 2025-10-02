package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

        //getter
        public ArrayList<String> getList() {
        return coffeeMenu;
        } //ends GetList

    //load file method
    public void loadMenuData() {


        try{
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
            scan.close();
        }   catch(FileNotFoundException e){
            System.out.println("File not found. Check path and filename.");
        }

    } //ends loadMenuData


} //ends Cafe