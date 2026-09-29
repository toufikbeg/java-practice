interface Mixed {
    int COUNT = 10;
}

public class InterfaceFields {
    public static void main(String[] args) {
        System.out.println("Interface fields are always public static final: " + Mixed.COUNT);
        System.out.println("A private field inside an interface is not allowed by the language");
    }
}
