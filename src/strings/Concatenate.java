public class Concatenate {
    public static void main(String[] args) {
        String a = "Bright";
        String b = "IT Career";
        System.out.println(a + " " + b);
        System.out.println(a.concat(" ").concat(b));
        StringBuilder builder = new StringBuilder(a);
        System.out.println(builder.append(" ").append(b));
    }
}
