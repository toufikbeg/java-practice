public class CallInstanceInStatic {
    void greet() {
        System.out.println("Hello from instance method");
    }

    public static void main(String[] args) {
        CallInstanceInStatic obj = new CallInstanceInStatic();
        obj.greet();
    }
}
