interface Vehicle2 {
    void start();
    void stop();
}

abstract class Bike implements Vehicle2 {
    public void start() {
        System.out.println("Bike starts");
    }
}

public class PartialImplement extends Bike {
    public void stop() {
        System.out.println("Bike stops");
    }

    public static void main(String[] args) {
        PartialImplement b = new PartialImplement();
        b.start();
        b.stop();
    }
}
