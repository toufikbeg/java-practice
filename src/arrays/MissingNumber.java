public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[99];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != 57) {
                numbers[index] = i;
                index++;
            }
        }
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;
        for (int n : numbers) {
            actualSum = actualSum + n;
        }
        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}
