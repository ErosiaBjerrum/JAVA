package animals;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("TestDyr", "Ingen", 0);
        animal.makeSound();
        animal.eat();

        Dog ozzy = new Dog("Ozzy", "Jon", 21000);
        ozzy.makeSound();
        ozzy.eat();
        ozzy.fetch();

        Cat trold = new Cat("Trold", "Anders", 4000, 9);
        trold.makeSound();
        trold.loseLife();

        Clinic clinic = new Clinic();
        clinic.addAnimal(ozzy);
        clinic.addAnimal(trold);
        clinic.printPatients();



    }

}
