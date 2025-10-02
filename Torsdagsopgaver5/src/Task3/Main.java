package Task3;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(4,2);
        Room room2 = new Room(4,2);
        Room room3 = new Room(4,2);
        Room room4 = new Room(4,2);
        Room room5 = new Room(5,4);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

        Building building1 = new Building(3, rooms);

    } //end of main


} //end of Main
