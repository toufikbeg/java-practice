class Caller {
    void doWork() {
        System.out.println("Work started");
        process(this);
    }

    void process(Caller c) {
        System.out.println("Processing the current object");
    }
}

public class ThisMethodArgument {
    public static void main(String[] args) {
        new Caller().doWork();
    }
}
