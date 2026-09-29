public class ContainsValue {
    static boolean contains(int[] arr, int value) {
        for (int n : arr) {
            if (n == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 19, 27, 33};
        System.out.println("Contains 19: " + contains(numbers, 19));
        System.out.println("Contains 20: " + contains(numbers, 20));
    }
}
