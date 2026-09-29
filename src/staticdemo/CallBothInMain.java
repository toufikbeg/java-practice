public class CallBothInMain {
    static void staticMethod() {
        System.out.println("I am static");
    }

    void instanceMethod() {
        System.out.println("I am instance");
    }

    public static void main(String[] args) {
        staticMethod();
        CallBothInMain obj = new CallBothInMain();
        obj.instanceMethod();
    }
}
