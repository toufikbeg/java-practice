abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Uses petrol or diesel");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuelType();

        Car car = new Car();
        car.start();
        car.fuelType();
    }
}
