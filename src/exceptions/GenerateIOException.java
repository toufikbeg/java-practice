import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GenerateIOException {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("missing_file.txt"));
            reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
