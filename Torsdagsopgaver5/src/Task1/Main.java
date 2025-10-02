package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Egon", "Olsen", "Bandeleder"));
        customers.add(new Customer("Andy", "Dufresne", "Indsat"));
        customers.add(new Customer("Peter", "Plys", "Bamse"));
        customers.add(new Customer("Sly", "Stallone", "Skuespiller"));

        printCustomers(customers);
    }

    static void printCustomers(ArrayList customers) {
        for(Object Customer : customers){
            System.out.println(Customer);
        }
    }

}