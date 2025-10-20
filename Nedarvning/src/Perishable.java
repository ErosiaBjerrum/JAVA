import java.time.LocalDate;

public class Perishable extends Product {
    private LocalDate bestBefore;

    // Constructor
    public Perishable(double price, String name, LocalDate bestBefore) {
        super(price, name);
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return super.toString() + " Mht: " + bestBefore;
    }


}
