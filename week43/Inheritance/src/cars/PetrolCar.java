package cars;

public class PetrolCar extends Car {
    private double fuelEfficiency;
    private int fuelCapacity;

    public PetrolCar(String brand, String model, FuelSource fuelSource, int milage, double fuelEfficiency, int fuelCapacity) {
        super(brand, model, fuelSource, milage);
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getInfo(){
        return "Info for petrol car: " + super.toString() + toString();

    }
}
