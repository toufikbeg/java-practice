class ProtectedHolder {
    protected String secret = "Protected data";

    protected void reveal() {
        System.out.println(secret);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        ProtectedHolder obj = new ProtectedHolder();
        obj.reveal();
        System.out.println(obj.secret);
    }
}
