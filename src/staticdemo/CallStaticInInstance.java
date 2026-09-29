public class CallStaticInInstance {
    static void announce() {
        System.out.println("Static method called");
    }

    void run() {
        announce();
    }

    public static void main(String[] args) {
        CallStaticInInstance obj = new CallStaticInInstance();
        obj.run();
    }
}
