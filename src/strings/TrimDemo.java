public class TrimDemo {
    public static void main(String[] args) {
        String padded = "   Java   ";
        System.out.println("Before: [" + padded + "]");
        System.out.println("After: [" + padded.trim() + "]");
        System.out.println("After strip: [" + padded.strip() + "]");
    }
}
