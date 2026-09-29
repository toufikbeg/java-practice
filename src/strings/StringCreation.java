public class StringCreation {
    public static void main(String[] args) {
        String first = "hello";
        String second = new String("hello");
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        String third = new String(letters);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
