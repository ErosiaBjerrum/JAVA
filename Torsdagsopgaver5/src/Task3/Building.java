package Task3;
import java.util.ArrayList;

public class Building {
    private int numberOfFloors;
    private ArrayList<Room> buildingRooms;

        public Building(int numberOfFloors, ArrayList<Room> buildingRooms){
            this.numberOfFloors = numberOfFloors;
            this.buildingRooms = buildingRooms;
        }

        // getters
        public int getFloors(){
            return numberOfFloors;}
        public ArrayList<Room> getRooms(){
            return buildingRooms;}

        // setters
        public void setFloors(int numberOfFloors){
            this.numberOfFloors = numberOfFloors;}
        public void setRooms(ArrayList<Room> buildingRooms){
            this.buildingRooms = buildingRooms;}


}
