import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Product Stol = new Product (1099, "Stol");
        Product tShirt = new Product(299, "T-shirt");
        LocalDate date = LocalDate.of(2026, 4, 1);
        Perishable Choko = new Perishable(33, "Chokolade", date);

        System.out.println(Stol);
        System.out.println(tShirt);
        System.out.println(Choko);
    }


}
