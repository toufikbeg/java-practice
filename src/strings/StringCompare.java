public class StringCompare {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");
        String c = "java";
        String d = "java";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(a == c);
    }
}
