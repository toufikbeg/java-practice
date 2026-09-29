public class StaticInInstance {
    static String city = "Hyderabad";

    void show() {
        System.out.println("Static variable from instance method: " + city);
    }

    public static void main(String[] args) {
        StaticInInstance obj = new StaticInInstance();
        obj.show();
    }
}
