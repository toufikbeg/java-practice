public class GenerateNoSuchMethod {
    public static void main(String[] args) {
        try {
            String.class.getMethod("noSuchMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
