interface Constants {
    String NAME = "Java";
    int VERSION = 21;

    void showInfo();
}

class Info implements Constants {
    public void showInfo() {
        System.out.println(NAME + " " + VERSION);
    }
}

public class PublicInterfaceFields {
    public static void main(String[] args) {
        new Info().showInfo();
        System.out.println("Direct access: " + Constants.NAME);
    }
}
