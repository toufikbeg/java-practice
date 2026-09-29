public class CommonValues {
    public static void main(String[] args) {
        int[] first = {1, 4, 7, 9, 12};
        int[] second = {2, 4, 9, 15, 20};
        for (int a : first) {
            for (int b : second) {
                if (a == b) {
                    System.out.println("Common: " + a);
                }
            }
        }
    }
}
