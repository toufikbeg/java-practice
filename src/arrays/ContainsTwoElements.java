public class ContainsTwoElements {
    static boolean bothPresent(int[] arr, int first, int second) {
        boolean foundFirst = false;
        boolean foundSecond = false;
        for (int n : arr) {
            if (n == first) foundFirst = true;
            if (n == second) foundSecond = true;
        }
        return foundFirst && foundSecond;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 23, 8, 41};
        System.out.println("Contains 12 and 23: " + bothPresent(numbers, 12, 23));
        System.out.println("Contains 12 and 99: " + bothPresent(numbers, 12, 99));
    }
}
