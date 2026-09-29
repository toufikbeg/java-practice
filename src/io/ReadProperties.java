import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("sample.properties")) {
            Properties props = new Properties();
            props.load(in);
            System.out.println("User: " + props.getProperty("db.user"));
            System.out.println("Missing key default: " + props.getProperty("db.host", "localhost"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
