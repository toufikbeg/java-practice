interface Config {
    static final String ENV = "production";
    static final int MAX_USERS = 100;
}

public class StaticFinalInterface {
    public static void main(String[] args) {
        System.out.println("Env: " + Config.ENV);
        System.out.println("Max users: " + Config.MAX_USERS);
    }
}
