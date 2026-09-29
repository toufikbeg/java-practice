class DefaultHolder {
    String message = "Default access works inside the same package";
    void printMessage() {
        System.out.println(message);
    }
}

public class DefaultAccess {
    public static void main(String[] args) {
        DefaultHolder obj = new DefaultHolder();
        obj.printMessage();
        System.out.println(obj.message);
    }
}
