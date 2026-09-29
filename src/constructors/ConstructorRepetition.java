class Counter {
    int count;

    Counter() {
        count++;
        System.out.println("Object created, count is now " + count);
    }
}

public class ConstructorRepetition {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();
        Counter third = new Counter();
        System.out.println("A single object cannot run its constructor twice, each new creates a fresh one");
    }
}
