public class PrintAllInMain {
    static int staticCounter = 5;
    int instanceCounter = 7;

    public static void main(String[] args) {
        PrintAllInMain obj = new PrintAllInMain();
        System.out.println("Static: " + staticCounter);
        System.out.println("Instance: " + obj.instanceCounter);
    }
}
