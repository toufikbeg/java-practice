public class ChangeArgumentType {

    static void show(int number) {
        System.out.println("Integer: " + number);
    }

    static void show(String text) {
        System.out.println("String: " + text);
    }

    static void show(double number) {
        System.out.println("Double: " + number);
    }

    public static void main(String[] args) {
        show(10);
        show("hello");
        show(10.5);
    }
}
