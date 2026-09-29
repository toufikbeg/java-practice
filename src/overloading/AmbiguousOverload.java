public class AmbiguousOverload {

    static void print(int long_value) {
        System.out.println("int version");
    }

    static void print(long value) {
        System.out.println("long version");
    }

    public static void main(String[] args) {
        print(7);
        print(7L);
        System.out.println("print(7L) picks long, print(7) picks int, promotion only when no exact match");
    }
}
