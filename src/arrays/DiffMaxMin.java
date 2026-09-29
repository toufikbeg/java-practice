public class DiffMaxMin {
    public static void main(String[] args) {
        int[] numbers = {23, 7, 89, 14, 56};
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Difference: " + (max - min));
    }
}
