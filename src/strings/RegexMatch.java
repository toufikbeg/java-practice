public class RegexMatch {
    public static void main(String[] args) {
        String text = "java123";
        System.out.println(text.matches("[a-z]+[0-9]+"));
        System.out.println("2026".matches("[0-9]{4}"));
        String replaced = text.replaceAll("[0-9]+", " code ");
        System.out.println(replaced);
    }
}
