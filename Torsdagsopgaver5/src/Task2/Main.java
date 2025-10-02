package Task2;

public class Main {

    public static void main(String[] args) {

    Cafe myCafe = new Cafe();
    myCafe.loadMenuData();

    // Print the menu
    for (String coffee : myCafe.getList()) {
        System.out.println(coffee);
    }


    } //ends main



} //ends Main
