class Outer {
    private interface Hidden {
        void reveal();
    }

    static class SecretKeeper implements Hidden {
        public void reveal() {
            System.out.println("Nested private interface method");
        }
    }

    void run() {
        Hidden h = new SecretKeeper();
        h.reveal();
    }
}

public class NestedPrivateInterface {
    public static void main(String[] args) {
        new Outer().run();
    }
}
