interface First {
    void show();
}

interface Second {
    void show();
}

class Demo implements First, Second {
    public void show() {
        System.out.println("One implementation serves both interfaces");
    }
}

public class SameMethodInterfaces {
    public static void main(String[] args) {
        new Demo().show();
    }
}
