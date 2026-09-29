public class MethodOverloadingDemo {

    static int add(int a, int b) {
        System.out.println("Two int version");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Three int version");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("Two double version");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
        System.out.println(add(2.5, 3.5));
    }
}
