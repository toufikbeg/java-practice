public class ReverseOverload {

    static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

    static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Number reversed: " + reverse(1234));
        int[] original = {1, 2, 3, 4, 5};
        int[] flipped = reverse(original);
        for (int n : flipped) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
