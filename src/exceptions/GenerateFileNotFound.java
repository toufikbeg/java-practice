import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenerateFileNotFound {
    public static void main(String[] args) {
        try {
            File file = new File("does_not_exist.txt");
            Scanner sc = new Scanner(file);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
