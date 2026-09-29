public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        a++;
        System.out.println("After increment: " + a);
        a--;
        System.out.println("After decrement: " + a);
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("Final value: " + a);
    }
}
