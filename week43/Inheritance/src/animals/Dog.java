package animals;

public class Dog extends Animal {

    public Dog(String name, String owner, int weightGram) {
        super(name, owner, weightGram);
    }

    public void makeSound(){
        System.out.println("Woof!");
    }

    public void fetch(){
        System.out.println(name + " henter en pind.");
    }
}
