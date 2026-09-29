public class VariableScope {
    static int value = 10;

    public static void main(String[] args) {
        int value = 20;
        System.out.println("Local variable: " + value);
        System.out.println("Global/static variable: " + VariableScope.value);
    }
}
