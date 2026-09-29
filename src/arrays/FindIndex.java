public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {15, 28, 37, 44, 59};
        int target = 37;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + index);
    }
}
