public class EvenOddSwitch {
    public static void main(String[] args) {
        int number = 14;
        int remainder = number % 2;
        switch (remainder) {
            case 0:
                System.out.println(number + " is EVEN");
                break;
            case 1:
                System.out.println(number + " is ODD");
                break;
        }
    }
}
