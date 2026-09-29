interface Printer {
    void print();
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Laser printing");
    }
}

public class InterfaceReference {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print();
    }
}
