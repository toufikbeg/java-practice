public class GenerateNumberFormat {
    public static void main(String[] args) {
        String input = "abc123";
        try {
            int value = Integer.parseInt(input);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
