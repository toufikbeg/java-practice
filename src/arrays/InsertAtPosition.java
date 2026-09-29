import java.util.Arrays;

public class InsertAtPosition {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 40, 50};
        int position = 2;
        int value = 30;
        int[] result = new int[numbers.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = numbers[i];
        }
        result[position] = value;
        for (int i = position; i < numbers.length; i++) {
            result[i + 1] = numbers[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
