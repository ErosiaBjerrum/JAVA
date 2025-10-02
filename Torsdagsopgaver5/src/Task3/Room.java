package Task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    // contructor
    public Room(int numberOfLamps, int numberOfWindows) {
    this.numberOfLamps = numberOfLamps;
    this.numberOfWindows = numberOfWindows;
    }

    // getters
    public int getLamps(){
        return numberOfLamps;}
    public int getWindows(){
        return numberOfWindows;}

    // setters
    public void setLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;}
    public void setWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;}

}
