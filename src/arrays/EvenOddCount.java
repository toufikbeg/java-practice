public class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 7, 9, 20, 25};
        int even = 0;
        int odd = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
