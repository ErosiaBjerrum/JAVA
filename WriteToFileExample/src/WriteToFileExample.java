import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt"); // creates or overwrites
            writer.write("Hello, world!\n");
            writer.write("This is a second line.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}