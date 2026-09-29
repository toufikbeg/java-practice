import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            while (reader.readLine() != null) {
                lines++;
            }
            System.out.println("Total lines: " + lines);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
