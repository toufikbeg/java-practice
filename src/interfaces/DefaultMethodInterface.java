interface Greeter {
    default void greet() {
        System.out.println("Hello from the default method");
    }
}

class Bot implements Greeter {
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        Greeter g = new Bot();
        g.greet();
    }
}
