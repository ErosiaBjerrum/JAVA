package animals;

public class Cat extends Animal {
    private int lives = 9;
    public Cat(String name, String owner, int weightGram, int livesLeft) {
                super(name, owner, weightGram);
                this.lives = livesLeft;
    }

    @Override
    public void makeSound(){
        System.out.println("Miav!");
    }

    public void loseLife(){
        lives--;
        System.out.println("Katten " + name + " har " + lives + " liv tilbage.");
    }

}
