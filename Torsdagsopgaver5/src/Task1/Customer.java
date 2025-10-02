package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    int id;
    static int counter;

    // Constructor
    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        counter++;
        int id = counter;
    }

    // setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;}
    public void setLastName(String lastName){
        this.lastName = lastName;}
    public void setUserName(String userName){
        this.userName = userName;}

    // getter methods
    public String getFirstName(){
        return firstName;}
    public String getLastName(){
        return lastName;}
    public String getUserName(){
        return userName;}

    // toString method
    @Override
    public String toString(){
    return "Kunden hedder " + this.firstName + " " + this.lastName + " og har brugernavnet " + this.userName + ".";
    }
}