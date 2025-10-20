public class Product {
    private double price;
    private String name;


    // Constructor
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }



    // toString method
        @Override
        public String toString(){
            return name + " – pris: " + price + " kr.";
        }


}
