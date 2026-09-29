import java.util.Arrays;

public class RemoveDuplicatesNewArray {
    public static void main(String[] args) {
        int[] numbers = {4, 4, 8, 8, 15, 16, 16};
        Arrays.sort(numbers);
        int uniqueCount = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                uniqueCount++;
            }
        }
        int[] result = new int[uniqueCount];
        result[0] = numbers[0];
        int index = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                result[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
