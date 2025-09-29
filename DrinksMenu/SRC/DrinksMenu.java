import java.util.ArrayList;
import java.util.Scanner;

public class DrinksMenu {







    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> choices = new ArrayList<>();

        System.out.println("Hvor gammel er du?");
        String input = scan.nextLine();
        int age = Integer.parseInt(input);

        if(age>=18){
            options.add("IrskKaffe");
            options.add("BloodyMary");
            options.add("Pils");
    }   else{
            options.add("Juice");
            options.add("Mælk");
            options.add("Sodavand");
        }

       for(String drink: options){
           System.out.println(drink);
       }

       System.out.println("Hvor mange drinks vil du bestille?");
       int numberOfDrinks = Integer.parseInt(scan.nextLine());


       while(choices.size()<numberOfDrinks){
           System.out.println("Vælg en drink fra listen.");
           String choice = scan.nextLine();
           choices.add(choice);

       }
        System.out.println("Dette er din bestilling: ");
       for(String choice : choices){
           System.out.println(choice);
       }

    }



}



// while loop indtil der er bestilt 3 drinks