public class ThrowWithMessage {

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above, got " + age);
        }
        System.out.println("Age " + age + " is valid");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        validateAge(21);
    }
}
