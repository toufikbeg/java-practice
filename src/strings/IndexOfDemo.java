public class IndexOfDemo {
    public static void main(String[] args) {
        String text = "Bright IT Career";
        System.out.println("Index of IT: " + text.indexOf("IT"));
        System.out.println("Index of 'e': " + text.indexOf('e'));
        System.out.println("Index from position 9: " + text.indexOf('e', 9));
        System.out.println("Not found: " + text.indexOf("xyz"));
    }
}
