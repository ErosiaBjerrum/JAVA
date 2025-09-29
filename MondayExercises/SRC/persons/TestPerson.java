package persons;

public class TestPerson {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

    TestPerson person1 = new TestPerson("Erik", 25);
    TestPerson person2 = new TestPerson("Conrad", 12);

    person.getName();
    person.getAge();

    System.out.println();

    }
}
