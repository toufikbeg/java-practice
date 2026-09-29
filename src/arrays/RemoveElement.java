import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int remove = 30;
        int[] result = new int[numbers.length - 1];
        int index = 0;
        for (int n : numbers) {
            if (n != remove) {
                result[index] = n;
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
