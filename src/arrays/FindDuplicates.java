public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 2, 8, 4, 9, 6};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate found: " + numbers[i]);
                }
            }
        }
    }
}
