package cars;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // Hvordan afprøver vi?

        // 1. Opret en fleet
        Fleet fleet = new Fleet();
        // 2. Instantier en benzinbil
        PetrolCar volvo = new PetrolCar("Volvo", "Amazon", FuelSource.PETROL, 450000, 10.5, 42);
        // 3. Instantier en elbil
        EV nissan = new EV("Nissan", "Leaf", FuelSource.ELECTRICITY, 23000, 62, LocalTime.of(14,10));
        // 4. Indsæt i "fleet"
        fleet.addCar(volvo);
        fleet.addCar(nissan);
        // 5. Udskriv bilerne

    fleet.showFleet();
        }


    }


