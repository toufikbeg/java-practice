public class GenerateStringIndexOutOfBounds {
    public static void main(String[] args) {
        String text = "java";
        try {
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }
    }
}
