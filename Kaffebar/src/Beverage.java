public class Beverage {

    private String name;
    private double price;
    private double alcPercent;
    private double sizeInCL;

    public Beverage(String name, double price, double alcPercent, double sizeInCL) {
        this.name = name;
        this.price = price;
        this.alcPercent = alcPercent;
        this.sizeInCL = sizeInCL;
    }

    public String toString(){
        String s = this.name + "....................."+Math.round(this.price)+" kr."+ "(cl:"+this.sizeInCL+")";
        return s;
    }

    public String toCSV(){
        String s = "\n" + this.name + ", " + this.price + ", " + this.alcPercent + ", " + this.sizeInCL;
        return s;

    }

}
