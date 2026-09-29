public class IntToString {
    public static void main(String[] args) {
        int number = 500;
        String first = String.valueOf(number);
        String second = Integer.toString(number);
        String third = "" + number;
        System.out.println(first + " " + second + " " + third);
    }
}
