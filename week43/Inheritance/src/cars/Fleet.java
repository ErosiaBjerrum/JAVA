package cars;

import java.util.ArrayList;

public class Fleet {
    private ArrayList<Car> carList = new ArrayList<>();


public Fleet(){}

public void addCar(Car car){
    carList.add(car);
}

public void showFleet(){
    for (Car car : carList) {
        if (car instanceof PetrolCar){
            System.out.println(((PetrolCar) car).getInfo());
        }
        if (car instanceof EV){
            System.out.println(((EV) car).getInfo());
        }
    }
}
}