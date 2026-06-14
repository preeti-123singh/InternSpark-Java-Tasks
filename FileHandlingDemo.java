import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Preeti\n");
            writer.write("Course: Java");

            writer.close();

            System.out.println("Data written successfully.\n");

            FileReader reader = new FileReader("student.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}