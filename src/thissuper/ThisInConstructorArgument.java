class Engine {
    Engine(Car owner) {
        System.out.println("Engine built for a car");
    }
}

class Car {
    Engine engine;

    Car() {
        engine = new Engine(this);
        System.out.println("Car assembled");
    }
}

public class ThisInConstructorArgument {
    public static void main(String[] args) {
        new Car();
    }
}
