package animals;

public class Animal {
    protected String name;
    protected String owner;
    protected int weightGram;



    public Animal(String name, String owner, int weightGram){
        this.name = name;
        this.owner = owner;
        this.weightGram = weightGram;

    }

    public void makeSound(){
        System.out.println("Generisk dyrelyd.");
    }

    public void eat(){
        System.out.println(name + " spiser.");
    }

}
