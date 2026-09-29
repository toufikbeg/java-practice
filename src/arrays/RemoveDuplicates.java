import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 7, 7, 9};
        Set<Integer> unique = new LinkedHashSet<>();
        for (int n : numbers) {
            unique.add(n);
        }
        int[] result = new int[unique.size()];
        int i = 0;
        for (int n : unique) {
            result[i] = n;
            i++;
        }
        System.out.println(Arrays.toString(result));
    }
}
