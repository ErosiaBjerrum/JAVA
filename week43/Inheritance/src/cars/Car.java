package cars;

public class Car {
    protected String brand;
    protected String model;
    protected FuelSource fuelSource;
    protected int milage;


    public Car(String brand, String model, FuelSource fuelSource, int milage) {
        this.brand = brand;
        this.model = model;
        this.fuelSource = fuelSource;
        this.milage = milage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelSource=" + fuelSource +
                ", milage=" + milage +
                '}';
    }
}


