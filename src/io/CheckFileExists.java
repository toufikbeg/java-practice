import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("output.txt");
        if (file.exists()) {
            System.out.println("File exists, size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist");
        }
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
    }
}
