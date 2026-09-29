public class PublicDemo {
    public String tag = "Public everywhere";

    public void show() {
        System.out.println(tag);
    }
}

class PublicUser {
    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        obj.show();
        System.out.println(obj.tag);
    }
}
