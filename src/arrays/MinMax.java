public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {23, 7, 89, 14, 56};
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
