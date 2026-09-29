public class EqualsIgnoreCaseDemo {
    public static void main(String[] args) {
        String a = "JAVA";
        String b = "java";
        System.out.println("Case sensitive: " + a.equals(b));
        System.out.println("Ignoring case: " + a.equalsIgnoreCase(b));
    }
}
