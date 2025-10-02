
// 1.a
public class Customer {

    String firstName;
    String lastName;
    String userName;
    String userAge;
    int id;
    static int counter;

// 1.b
    // Constructor
    public Customer(String firstName, String lastName, String userName, String userAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userAge = userAge;

        counter++;
        this.id = counter;
    }

        // toString metode

    @Override
    public String toString() {
        return this.firstName + "" + this.lastName + "" + this.userName + this.id;
    }
}
