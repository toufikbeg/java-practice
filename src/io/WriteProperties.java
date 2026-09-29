import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("db.user", "admin");
        props.setProperty("db.password", "secret123");
        try (FileOutputStream out = new FileOutputStream("sample.properties")) {
            props.store(out, "Application configuration");
            System.out.println("Properties file written");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
