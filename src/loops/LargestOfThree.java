public class LargestOfThree {
    public static void main(String[] args) {
        int a = 25;
        int b = 78;
        int c = 41;
        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }
}
