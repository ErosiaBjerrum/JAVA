package cars;

import java.time.LocalTime;

public class EV extends Car {
    private int batteryCapacity;
    private LocalTime lastCharged;

    public EV(String brand, String model, FuelSource fuelSource, int milage, int batteryCapacity, LocalTime lastCharged) {
        super(brand, model, fuelSource, milage);
        this.batteryCapacity = batteryCapacity;
        this.lastCharged = lastCharged;
    }

    public String getInfo(){
        return "Info for EV: " + super.toString() + toString();

    }
}