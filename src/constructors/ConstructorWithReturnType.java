class Trick {
    int value = 50;

    Trick() {
        System.out.println("Real constructor runs for every object");
    }

    int Trick() {
        System.out.println("This is a normal method that happens to share the class name");
        return value;
    }
}

public class ConstructorWithReturnType {
    public static void main(String[] args) {
        Trick t = new Trick();
        System.out.println("Method result: " + t.Trick());
        System.out.println("A constructor cannot have a return type, only a method can");
    }
}
