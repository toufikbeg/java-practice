public class OverloadWithPromotion {

    static void calculate(int a) {
        System.out.println("int version: " + a);
    }

    static void calculate(double a) {
        System.out.println("double version: " + a);
    }

    public static void main(String[] args) {
        calculate(5);
        calculate(5.5);
        calculate('A');
        System.out.println("char A was promoted to int automatically");
    }
}
