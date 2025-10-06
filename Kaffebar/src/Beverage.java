public class Beverage {
    private String name;
    private double price;
    private double alcPercent;
    private double sizeInCL;

    // Constructor

    public Beverage(String name, double price, double alcPercent, double sizeInCL) {
        this.name = name;
        this.price = price;
        this.alcPercent = alcPercent;
        this.sizeInCL = sizeInCL;
    }


    // Method
    @Override
    public String toString() {
       String s = this.name + "............." + Math.round(this.price) + " kr.";
       return s;
    }

}
