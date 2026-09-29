class Box {
    Box() {
        this(10);
        System.out.println("Default constructor");
    }

    Box(int size) {
        System.out.println("Parameterized constructor with size: " + size);
    }
}

public class ThisMethodDemo {
    public static void main(String[] args) {
        new Box();
    }
}
