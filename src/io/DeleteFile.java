import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("temp_file.txt");
        if (file.createNewFile()) {
            System.out.println("Created: " + file.getName());
        }
        if (file.delete()) {
            System.out.println("Deleted: " + file.getName());
        } else {
            System.out.println("Delete failed, file may not exist");
        }
    }
}
