public class GenerateClassNotFound {
    public static void main(String[] args) {
        try {
            Class.forName("com.nosuchpackage.MissingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
