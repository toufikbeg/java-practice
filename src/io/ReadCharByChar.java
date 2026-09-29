import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("output.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
