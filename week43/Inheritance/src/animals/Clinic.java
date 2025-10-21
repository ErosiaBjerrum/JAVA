package animals;

import java.util.ArrayList;

public class Clinic {
    private ArrayList<Animal> animals = new ArrayList<>();

    public Clinic(){

    }

    public void addAnimal(Animal patient){
        animals.add(patient);
    }

    public void printPatients(){
        System.out.println("I venteværelset:");
        for (Animal patient: animals){
            System.out.println(patient.name);
        }

    }
}
