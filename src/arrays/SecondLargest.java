public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + second);
    }
}
